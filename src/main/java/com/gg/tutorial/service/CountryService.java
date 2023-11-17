package com.gg.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.tutorial.dao.CountryDao;
import com.gg.tutorial.model.Country;

@Service
public class CountryService {

 @Autowired
 private CountryDao countryDao;

 public List<Country> getCountriesList() {
  return countryDao.getCountriesList();
 }
}
