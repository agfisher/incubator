package com.reserv.controller;


import com.reserv.db.IncubationData;
import com.reserv.domain.GraphDataObject;
import com.reserv.domain.Point;
import com.reserv.domain.ValuesData;
import com.reserv.service.IncubationDatabaseService;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Path("/data")
@Singleton
public class DataProviderController {

    //String data = "{'data': {'labels': ['0', '2', '4', '6', '8', '10', '12', '14', '16', '18', '20', '22', '24']}";
    //String data = "{\"data\": {\"labels\": ['0', '2', '4', '6', '8', '10', '12', '14', '16', '18', '20', '22', '24']},datasets: [{\"lineTension\": 0, \"label\": 'Шкаф 1',\"data\": [{x: 0,y: 37.4}, {x: 2,y: 37.4}, {x: 4,y: 37.4}, {x: 6,y: 37.4}, {x: 8,y: 37.5}, {x: 10,y: 37.4}, {x: 12,y: 37.5}, {x: 14,y: 37.4}, {x: 16,y: 37.6}, {x: 18,y: 37.5}, {x: 20,y: 37.6}, {x: 22,y: 37.5}, {x: 24,y: 37.6}],\"backgroundColor\": \"rgba(171, 0, 0, 0.5)\"}]}";
    //String data = "{\"data\": {\"labels\": [\"0\", \"2\", \"4\", \"6\", \"8\", \"10\", \"12\", \"14\", \"16\", \"18\", \"20\", \"22\", \"24\"]},datasets: [{\"lineTension\": 0, \"label\": \"Шкаф 1\",\"data\": [{\"x\": 0,\"y\": 37.4}, {\"x\": 2,\"y\": 37.4}, {\"x\": 4,\"y\": 37.4}, {\"x\": 6,\"y\": 37.4}, {\"x\": 8,\"y\": 37.5}, {\"x\": 10,\"y\": 37.4}, {\"x\": 12,\"y\": 37.5}, {\"x\": 14,\"y\": 37.4}, {\"x\": 16,\"y\": 37.6}, {\"x\": 18,\"y\": 37.5}, {\"x\": 20,\"y\": 37.6}, {\"x\": 22,\"y\": 37.5}, {\"x\": 24,\"y\": 37.6}],\"backgroundColor\": \"rgba(171, 0, 0, 0.5)\"}]}";
    //,datasets: [{    lineTension: 0, label: 'Шкаф 1',data: [{x: 0,y: 37.4}, {x: 2,y: 37.4}, {x: 4,y: 37.4}, {x: 6,y: 37.4}, {x: 8,y: 37.5}, {x: 10,y: 37.4}, {x: 12,y: 37.5}, {x: 14,y: 37.4}, {x: 16,y: 37.6}, {x: 18,y: 37.5}, {x: 20,y: 37.6}, {x: 22,y: 37.5}, {x: 24,y: 37.6}],backgroundColor: "rgba(171, 0, 0, 0.5)"}]

    @EJB
    IncubationDatabaseService incubationDatabaseService;

    @GET
    @Path("/{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDataByType(@PathParam("type") String type) {

        IncubationData d = incubationDatabaseService.getIncubationDataById(1);
        //return Response.ok("test").build();
        GraphDataObject data = createTestData();
        return Response.ok(data).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age", "1209600")
                .build();
    }

    @GET
    @Path("/byId/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getdataById(@PathParam("id") Integer id) {
        return Response.ok(incubationDatabaseService.getIncubationDataById(id)).build();
    }

    private GraphDataObject createTestData() {
        GraphDataObject data = new GraphDataObject();
        ArrayList<ValuesData> datasets = data.getData().getDatasets();
        ValuesData vd = new ValuesData();
        vd.getData().add(new Point(1, 35.0));
        vd.getData().add(new Point(2, 36.0));
        vd.getData().add(new Point(3, 35.0));
        vd.getData().add(new Point(4, 34.0));
        vd.getData().add(new Point(5, 37.0));
        vd.getData().add(new Point(6, 36.0));
        vd.getData().add(new Point(7, 35.0));
        vd.getData().add(new Point(8, 38.0));
        vd.getData().add(new Point(9, 36.0));
        datasets.add(vd);
        return data;
    }

    private int rndInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
