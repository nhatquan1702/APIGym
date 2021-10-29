package com.example.apigym.controller;

import com.example.apigym.model.NhomCo;
import com.example.apigym.service.NhomCoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/nhomco")
public class NhomCoController {


    @Autowired
    private NhomCoService nhomCoService;

    @GetMapping("")
    public ResponseEntity<List<NhomCo>> getAllBrand() {
        NhomCo nhomCo =  new NhomCo();
        List<NhomCo> nhomCoList = nhomCoService.getNhomCoList();
        return new ResponseEntity<>(nhomCoList, HttpStatus.OK);
    }
}
