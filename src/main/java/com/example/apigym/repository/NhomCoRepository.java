package com.example.apigym.repository;

import com.example.apigym.model.NhomCo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhomCoRepository extends JpaRepository<NhomCo, String> {
    @Override
    List<NhomCo> findAll();

    @Override
    List<NhomCo> findAllById(Iterable<String> strings);


}
