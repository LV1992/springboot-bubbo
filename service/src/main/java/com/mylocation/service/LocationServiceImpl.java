package com.mylocation.service;

import com.mylocation.api.LocationService;
import com.mylocation.dao.LocationMapper;
import com.mylocation.dto.LocationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/30.
 */
@Service("locationService")
public class LocationServiceImpl implements LocationService{
    @Autowired
    private LocationMapper locationMapper;
    @Override
    public LocationResult getLastLocation() {
        return locationMapper.selectLastLocation();
    }
}
