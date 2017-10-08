package com.reserv;

import com.reserv.model.DataModel;

import javax.ejb.Singleton;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.StringReader;

@Singleton
public class IncubatorRestClient {

    public JsonObject loadData() {
/*
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://192.168.10.103");
        String result = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        JsonReader jsonReader = Json.createReader(new StringReader(result));

        JsonObject jsonObject = jsonReader.readObject();*/
        JsonObject jsonObject = null; // just for test

        return jsonObject;
    }

}
