/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import com.fasterxml.jackson.databind.ObjectMapper;       
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Client;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Entity;
import org.glassfish.jersey.client.ClientConfig;
/**
 *
 * @author radziu
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        config.register(new ObjectMapper().registerModule(new JavaTimeModule()));
        Client client = ClientBuilder.newClient();
        String count
                = client.target("http://localhost:8080/Complaints/" + "resources/complaints/count")
                        .request(MediaType.TEXT_PLAIN).get(String.class);
        System.out.println("Count: " + count);
     
    
    
      
        //1. WSZYSTKIE SKARGI
        List<Complaint> allComplaints = client.target("http://localhost:8080/Complaints/" + "resources/complaints")
                .request(MediaType.APPLICATION_JSON).get(List.class);
        System.out.println("Wszystkie skargi:\n\n" +allComplaints);

        Complaint myComplaint = null;
       
    
        for (Complaint c : allComplaints) {
            if (c.getStatus().equals("open")) {
                myComplaint = client.target("http://localhost:8080/Complaints/" + "resources/complaints/" + c.getId())
                        .request(MediaType.APPLICATION_JSON).get(Complaint.class);
                break;
            }
        }
        
        
        //2. jedna z otwartych skarg
         if (myComplaint != null){
                System.out.println("Skarga typu open:\n" + myComplaint);
                //3 zmiana statusu na closed
                myComplaint.setStatus("closed");
        }
        //4 wszystki otwarte skargi 
        client.target("http://localhost:8080/Complaints/" + "resources/complaints")
            .request(MediaType.APPLICATION_JSON)
            .put(Entity.json(myComplaint));
        
        List<Complaint> complaintsOpened = client.target("http://localhost:8080/Complaints/" + "resources/complaints")
            .queryParam("status", "open").request(MediaType.APPLICATION_JSON).get(List.class);
        System.out.println("Wszystki otwarte skargi: " + complaintsOpened);

        client.close(); 
    

    }
}
