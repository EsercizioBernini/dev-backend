package com.finedietro.smartlightbackend.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aless
 */
@XmlRootElement
public class Lightbulb {

    private String status;
    private String message;

    public Lightbulb(String status) {
        this.status = status;
    }

    public Lightbulb() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
