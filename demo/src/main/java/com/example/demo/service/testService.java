package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dao.TestMapper;
import com.example.demo.model.dto.testDto;

@Service
public class testService {
    
    @Autowired
    public TestMapper testMapper;

    public List<testDto> list(){
        return testMapper.getList();
    }

    public testDto write(testDto value){
        System.out.println("service"+value.getTitle());
        System.out.println("service"+value.getContent());
        return testMapper.save(value);
    }
}
