package com.gg.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.tutorial.dao.CityDao;
import com.gg.tutorial.model.City;

@Service
public class CityService {
 
 @Autowired
 private CityDao cityDao;

 public List<City> getCitiesByCountry(int countryId) {
  return cityDao.getCitiesByCountry(countryId);
 }
}
