package com.example.demo.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.dto.testDto;

@Repository
@Mapper
public interface TestMapper {
   public List<testDto> getList();

   public testDto save(testDto value);
}
