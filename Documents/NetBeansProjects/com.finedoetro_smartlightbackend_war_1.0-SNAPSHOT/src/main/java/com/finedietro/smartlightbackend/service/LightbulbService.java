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

    private boolean checkLightBulbStatus(String id) {        

        rs = new ReleService(id);
        rele = rs.getStatusReleFromIbBulb(id);

        if (rele.getStatus().equalsIgnoreCase(STATUS_ON)) {
            return true;
        } else if (rele.getStatus().equalsIgnoreCase(STATUS_OFF)) {
            return false;
        } else {
            return false;
        }
    }

    public Lightbulb manageAction(Action action) {
        if (action.getId().equalsIgnoreCase("001")){
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
        }else{
            lightbulb.setMessage(STATUS_ERROR);
            return lightbulb;
        }
    }

    public Lightbulb getLightbulbStatus(String id) {

        lightbulb.setId(id);

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
