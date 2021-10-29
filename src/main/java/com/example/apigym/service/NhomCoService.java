package com.example.apigym.service;

import com.example.apigym.model.NhomCo;
import com.example.apigym.repository.NhomCoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NhomCoService {
    @Autowired
    private NhomCoRepository nhomCoRepository;

    public List<NhomCo> getNhomCoList() {
        List<NhomCo> nhomCoList = nhomCoRepository.findAll();
        return nhomCoList;
    }
}
