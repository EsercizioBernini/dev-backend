package com.finedietro.smartlightbackend.service;

import com.finedietro.smartlightbackend.model.Action;
import com.finedietro.smartlightbackend.model.Lightbulb;
import com.finedietro.smartlightbackend.model.Rele;

/**
 *
 * @author aless
 */
public class LightbulbService {

    private Lightbulb lightbulb;
    private ReleService rs;
    private MeterService ms;
    private Rele rele;

    private static String STATUS_ON = "ON";
    private static String STATUS_OFF = "OFF";
    private static String STATUS_ERROR = "ERROR";
    private static String ACTION_ACCENDI = "ACCENDI";
    private static String STATUS_SPEGNI = "SPEGNI";

    public LightbulbService() {
        this.lightbulb = new Lightbulb();
        this.ms = new MeterService();
    }

    private booelan checkLightBulbStatus(String id) {   // DA FARE !!!!!!!!!

        this.rs = new ReleService(id);

        if (rs.getStatus().getStatus().equalsIgnoreCase(STATUS_ON)) {
            return true;
        } else if (rele.getStatus().equalsIgnoreCase(STATUS_OFF)) {
            return false;
        } else {

        }

    }

    public Lightbulb manageAction(Action action) {
        if (action.getAction().equalsIgnoreCase(ACTION_ACCENDI)) {
            lightbulb.setId(action.getId());
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
        if (checkLightBulbStatus(id)) {
            lightbulb.setStatus(STATUS_ON);
        } else {
            lightbulb.setStatus(STATUS_OFF);

        }

        return lightbulb;
    }

    public Lightbulb getLightbulb() {
        return lightbulb;
    }

    public void setLightbulb(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

}
