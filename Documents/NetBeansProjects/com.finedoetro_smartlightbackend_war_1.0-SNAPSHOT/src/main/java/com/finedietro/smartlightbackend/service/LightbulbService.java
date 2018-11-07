package com.finedietro.smartlightbackend.service;

import com.finedietro.smartlightbackend.model.Action;
import com.finedietro.smartlightbackend.model.Lightbulb;

/**
 *
 * @author aless
 */
public class LightbulbService {

    private Lightbulb lightbulb;

    private String STATUS_ON = "ON";
    private String STATUS_OFF = "OFF";
    private String STATUS_ERROR = "ERROR";
    private String ACTION_ACCENDI = "ACCENDI";
    private String STATUS_SPEGNI = "SPEGNI";

    public LightbulbService() {
        this.lightbulb = new Lightbulb();
    }

    public Lightbulb menageStatus(Action action) {
        if (action.getAction().equalsIgnoreCase(ACTION_ACCENDI)) {
            lightbulb.setStatus(STATUS_ON);
        } else if (action.getAction().equalsIgnoreCase(STATUS_SPEGNI)) {
            lightbulb.setStatus(STATUS_OFF);
        } else {
            lightbulb.setStatus(STATUS_ERROR);
            lightbulb.setMessage("Azione non esistente");
        }
        return lightbulb;
    }

    public Lightbulb getLightbulbStatus(String id) {
        //MOCK!!!
        lightbulb.setId(id);
        /*ACCENDI DAL METER*/
        lightbulb.setStatus(STATUS_ON);
        return lightbulb;
    }

    public Lightbulb getLightbulb() {
        return lightbulb;
    }

    public void setLightbulb(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

}
