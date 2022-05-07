/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package view.backing;

import com.mycompany.primefaces.Student;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author radziu
 */
@Named(value = "tableBean")
@RequestScoped
public class TableBean {
    private List<Student> students;
    /**
     * Creates a new instance of TableBean
     */
    public TableBean() {
        students = new ArrayList<>();
        students.add(new Student("Radosław", "Burdziński", 5.01));
        students.add(new Student("scott ", "tiger", 3.2));
        students.add(new Student("Szymon", "Dziegielewski",4.5));
        students.add(new Student("Adrian", "Krzyżanowicz",4.3));
        students.add(new Student("Marcin", "Frankowski",4.6));
       
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
