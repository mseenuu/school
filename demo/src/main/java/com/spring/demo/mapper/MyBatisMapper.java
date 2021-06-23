package com.spring.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(value="prototype")

@Mapper
public interface MyBatisMapper {

    List<JSONObject> fetch();
}
