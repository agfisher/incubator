package com.reserv;

import com.reserv.model.DataModel;

import javax.ejb.Singleton;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.StringReader;

@Singleton
public class IncubatorRestClient {

    public JsonObject loadData() {

/* Real data from server
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://192.168.10.105");
        String result = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        JsonReader jsonReader = Json.createReader(new StringReader(result));

        JsonObject jsonObject = jsonReader.readObject();
        */

/********** TEST DATA from String********/
        String jsonData = "{\"query_type\":\"QueryCPValues\",\"cp_values\":[[\"cpoTz\",37.7],[\"cpoHz\",55],[\"cpoVZ\",100],[\"cpoT\",37.65],[\"cpoH\",56],[\"cpoV\",100]]}";
        JsonReader reader = Json.createReader(new StringReader(jsonData));

        JsonObject jsonObject = reader.readObject();

        reader.close();
/*********** END TEST DATA ********/////////////

        return jsonObject;
    }

}
