package com.sumerge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

public class App 
{
     private static final Logger log = LogManager.getLogger(App.class);
    private static ResourceBundle resourceBundle;
    public static void main( String[] args )
    {
        resourceBundle = ResourceBundle.getBundle("mavenProfiles");
        String profileName = resourceBundle.getString("profileName");


            log.error("Running profile = " + profileName);

        // mvn clean install -P {profile-1 | profile-2}
        //mvn package exec:java -P {profile-1 | profile-2}
    }
}
