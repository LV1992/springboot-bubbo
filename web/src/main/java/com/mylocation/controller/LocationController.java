package com.mylocation.controller;

import com.mylocation.api.LocationService;
import com.mylocation.common.Response;
import com.mylocation.dto.LocationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/8/30.
 */
@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping("currentLocation")
    Response<LocationResult> response(){
        return Response.create(locationService.getLastLocation());
    }
}
