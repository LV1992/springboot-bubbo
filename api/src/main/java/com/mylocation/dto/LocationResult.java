package com.mylocation.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/25.
 */
@Data
public class LocationResult implements Serializable{
   private Long id;
   private Double lat;
   private Double lng;
   private String time;
}
