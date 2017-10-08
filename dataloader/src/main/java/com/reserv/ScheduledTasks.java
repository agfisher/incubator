package com.reserv;

import lombok.extern.log4j.Log4j2;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Log4j2
@Singleton
public class ScheduledTasks {

    @EJB
    RestDataProcessor restDataProcessor;

    @Schedule(minute="*/1", hour="*")
    public void loadData() {
        log.info("Load data from rest...");
        restDataProcessor.processData();
    }
}
