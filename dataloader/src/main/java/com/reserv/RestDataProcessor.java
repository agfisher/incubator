package com.reserv;

import com.reserv.db.Incubation;
import com.reserv.db.IncubationData;
import com.reserv.service.IncubationDatabaseService;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Singleton
public class RestDataProcessor {
    @EJB
    IncubatorRestClient incubatorRestClient;

    @EJB
    IncubationDatabaseService incubationDatabaseService;

    public void processData() {
        JsonObject result = incubatorRestClient.loadData();
        if(result.getString("query_type").equals("QueryCPValues"))
            saveData(result);

    }

    //save data to DB
    private void saveData(JsonObject jsonObject) {

        JsonArray values = (JsonArray)jsonObject.get("cp_values");
        for(int i = 0; i < values.size(); i++) {
            IncubationData incubation = new IncubationData();
            JsonArray item =  values.getJsonArray(i);
            incubation.setDate(new Date());
            incubation.setDayNumber(1);
            incubation.setPoint(item.getString(0));
            incubation.setValue(item.getJsonNumber(1).bigDecimalValue());
            incubationDatabaseService.saveIncubationData(incubation);
        }
    }

}
