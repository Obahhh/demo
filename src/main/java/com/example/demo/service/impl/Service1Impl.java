package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao1;
import com.example.demo.service.Service1;
import com.example.demo.vo.User;
@Service
public class Service1Impl implements Service1{
	//Dao1 mts = new Dao1();
	
	@Autowired
	private Dao1 mts;
	
    @Override
    public List<User> mtsJapan(){
    	
    	return mts.selectUsers();
    }
    
}