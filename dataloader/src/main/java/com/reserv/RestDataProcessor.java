package com.reserv;

import com.reserv.db.Incubation;
import com.reserv.db.IncubationData;
import com.reserv.service.IncubationDatabaseService;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.json.JsonObject;
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
        saveData(result);
    }

    //save data to DB
    private void saveData(JsonObject jsonObject) {

        IncubationData incubation = new IncubationData();
        incubation.setDate(new Date());
        incubation.setDayNumber(1);
        incubation.setPoint("aaa");
        incubation.setValue(new BigDecimal(12.5));
        incubationDatabaseService.saveIncubationData(incubation);
    }

}
