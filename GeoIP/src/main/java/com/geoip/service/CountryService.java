package com.geoip.service;

import com.maxmind.geoip.Country;
import com.maxmind.geoip.LookupService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by Dimakatso.Bopape on 2/16/2017.
 */
@Service
@Scope
public class CountryService {

    public Country getCountry(String ipAddress){
        Country country = null;

        try {
            LookupService lookupService = new LookupService("GeoIP.dat",LookupService.GEOIP_CHECK_CACHE);
            country = lookupService.getCountry("41.189.68.2");
        }catch (IOException e){

        }

        return country;

    }

}
