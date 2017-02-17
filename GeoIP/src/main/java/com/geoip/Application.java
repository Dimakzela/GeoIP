package com.geoip;

import com.maxmind.geoip.Country;
import com.maxmind.geoip.LookupService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by Dimakatso.Bopape on 2/16/2017.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            // First, create a LookupService instance with the location of the database.
            LookupService lookupService = new LookupService("GeoIP.dat",LookupService.GEOIP_CHECK_CACHE);
            // Assume we have a String ipAddress (in dot-decimal form).
            Country country = lookupService.getCountry("41.189.68.2");
            System.out.println("The country is: " + country.getName());
            System.out.println("The country code is: " + country.getCode());
        };
    }
}
