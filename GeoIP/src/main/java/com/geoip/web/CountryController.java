package com.geoip.web;

import com.geoip.service.CountryService;
import com.maxmind.geoip.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Dimakatso.Bopape on 2/16/2017.
 */
@RestController
@RequestMapping("/GeoIP")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/getCountry/{ipAddress}", method = RequestMethod.GET)
    public Country getCountry(@PathVariable(value = "ipAddress") String ipAddress){
        return countryService.getCountry(ipAddress);
    }

}
