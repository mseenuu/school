package com.spring.demo.services;

import com.spring.demo.mapper.MyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    MyBatisMapper mapper;

    public String fetch() {

        return mapper.fetch().toString();
    }

    public String insert() {

        return "function to insert";
    }
}
