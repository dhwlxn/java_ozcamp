package com.service;

import com.dto.LocationDTO;

import java.util.List;

public interface LocationService {
    LocationDTO findByDistrict(LocationDTO dto);

//	String findByDistrict(String gu, String dong);
}
