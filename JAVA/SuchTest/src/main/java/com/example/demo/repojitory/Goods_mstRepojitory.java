package com.example.demo.repojitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Goods_mstEntity;

@Repository
public interface Goods_mstRepojitory  extends JpaRepository<Goods_mstEntity, Integer>{

}
