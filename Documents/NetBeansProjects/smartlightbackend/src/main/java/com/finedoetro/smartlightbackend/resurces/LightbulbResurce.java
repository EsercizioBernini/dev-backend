package com.finedoetro.smartlightbackend.resurces;

import com.finedoetro.smartlightbackend.model.Lightbulb;
import com.finedoetro.smartlightbackend.service.LightbulbService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author aless
 */
@Path("lightbulb")
public class LightbulbResurce {

    LightbulbService ls = new LightbulbService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Lightbulb getLightbulbStatus() {
        //TODO l'originale dovrà cosiderare la response del interruttore e del contatore
        Lightbulb lightbulb = new Lightbulb("ERROR");
        lightbulb.setMessage("Lampada scollegata o rotta");
        return lightbulb;
    }

    @GET
    @Path("/switch")
    @Produces(MediaType.APPLICATION_JSON)
    public Lightbulb setLightbulbStatus() {
        //TODO è solo una mock
        Lightbulb lightbulb = new Lightbulb();
        ls.setLightbulb(lightbulb);
        return ls.switchStatus();
    }
}
