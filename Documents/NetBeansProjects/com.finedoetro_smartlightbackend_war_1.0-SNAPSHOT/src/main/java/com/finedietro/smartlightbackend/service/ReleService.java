
package com.finedietro.smartlightbackend.service;

import com.finedietro.smartlightbackend.model.Rele;

public class ReleService {
    
    private Rele rele;
    private static String STATUS_ON = "ON";
    private static String STATUS_OFF = "OFF";
    private static String STATUS_ERROR = "ERROR";
    private static String ACTION_ACCENDI = "ACCENDI";
    private static String ACTION_SPEGNI = "SPEGNI";
    
    
    public ReleService(String idBulbConnected){
        
        rele= new Rele(idBulbConnected);
        
    }
    
    public Rele getStatusReleFromIbBulb(String idBulb){
       
        // viene chiamato il rele fisico facendo le relative chiamate http per ottenere lo stato dell'interruttore
        
        try{
   
            if (false){    // caso in cui rele rilevi contatto chiuso (passa corrente)
            rele.setStatus(STATUS_ON);
            
        }else{       // caso in cui rele rilevi contatto aperto (non passa corrente)
            rele.setStatus(STATUS_OFF);
            
        }
                      
        }catch(Exception e){
            
           
        }
        
        return rele;
    }
    
    
    public Rele setStatusReleFromIdBulb(String idBulb, String action){
        
        
        if (action.equalsIgnoreCase(ACTION_ACCENDI)){
            
            
            try{
                           
            // chiamo il rele e con richiesta http chiedo di accendere
            
              
            }catch(Exception e){
                rele.setStatus(e.getMessage());
            }
          
            
        }else if (action.equalsIgnoreCase(ACTION_SPEGNI)){
            // chiamo il rele e con richiesta http chiedo di spegnere

            
        }
        
        return rele;
        
        
    }
    
    
    
    
}
