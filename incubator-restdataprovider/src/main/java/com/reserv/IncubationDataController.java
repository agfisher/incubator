package com.reserv;

import com.reserv.model.DataModel;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by kash on 29.06.2017.
 */
@Path("/")
@Stateless
@LocalBean
public class IncubationDataController {
    @GET
    @Produces("application/json")
    @Path("/getData")
    public DataModel getClichedMessage() {
        return new DataModel();
    }
}
