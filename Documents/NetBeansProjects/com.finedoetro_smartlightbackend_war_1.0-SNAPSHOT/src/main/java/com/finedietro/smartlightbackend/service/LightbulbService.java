package com.finedietro.smartlightbackend.service;

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

    public LightbulbService() {
    }

    public LightbulbService(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    public Lightbulb switchStatus() {
        //TODO è solo una mock
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
