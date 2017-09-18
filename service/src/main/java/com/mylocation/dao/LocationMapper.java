package com.mylocation.dao;

import com.mylocation.dto.LocationResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by lenovo on 2017/8/30.
 */
@Mapper
public interface LocationMapper {

    LocationResult selectLastLocation();
}
