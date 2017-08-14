package com.reserv;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kash on 29.06.2017.
 */
@ApplicationPath("/rest")
public class IncubatorApplication extends Application {
/*  @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( IncubationDataController.class );
        return h;
    }*/
}
