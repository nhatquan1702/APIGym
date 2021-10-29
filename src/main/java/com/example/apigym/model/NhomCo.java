package com.example.apigym.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "NhomCo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NhomCo {
    @Id
    @Column(name = "MaNhomCo", nullable = false)
    private String maNhomCo;

    @Column(name = "TenNhomCo",nullable = false)
    private String tenNhomCo;

    @Column(name = "HinhMinhHoa",nullable = false)
    private String hinhMinhHoa;
}
