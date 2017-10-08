package com.reserv.service;

import com.reserv.db.Incubation;
import com.reserv.db.IncubationData;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class IncubationDatabaseService {
    private final static String UNIT_NAME = "IncubatorPersistenceUnit";

    @PersistenceContext(unitName = UNIT_NAME)
    private EntityManager entityManager;

    @PostConstruct
    private void setUp() {

    }

    public Incubation saveIncubation(Incubation incubation) {
        entityManager.persist(incubation);
        return incubation;
    }

    public IncubationData saveIncubationData(IncubationData incubationData) {
        entityManager.persist(incubationData);

        return incubationData;
    }

}
