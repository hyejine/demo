package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.testDto;
import com.example.demo.service.testService;

@RestController
public class testController {

    @Autowired
    private testService testService;

    @GetMapping("/api/list")
    public @ResponseBody List<testDto> list(){
        List<testDto> allList = testService.list();
        return allList;
    }

    @PostMapping("/api/write")
    public testDto write(@RequestBody testDto value){
        System.out.println("controller"+value.getTitle());
        System.out.println("controller"+value.getContent());

        return testService.write(value);
    }
}
