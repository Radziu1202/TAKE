/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package view.backing;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author radziu
 */
@Named(value = "calcBean")
@RequestScoped
public class CalcBean {

    /**
     * Creates a new instance of CalcBean
     */
    public CalcBean() {
        this.date = new Date();
    }
    
    
    
    private int firstValue;
    private int secondValue;
    private int outcome;
    private Date date;
    /**
     * @return the firstValue
     */
    public int getFirstValue() {
        return firstValue;
    }

    /**
     * @param firstValue the firstValue to set
     */
    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    /**
     * @return the secondValue
     */
    public int getSecondValue() {
        return secondValue;
    }

    /**
     * @param secondValue the secondValue to set
     */
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
    
    public void calculate(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
        setOutcome(getFirstValue()+getSecondValue());
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(String.format("%d + %d = %d",getFirstValue(),getSecondValue(),  getOutcome())));
    }

    /**
     * @return the outcome
     */
    public int getOutcome() {
        return outcome;
    }

    /**
     * @param outcome the outcome to set
     */
    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
