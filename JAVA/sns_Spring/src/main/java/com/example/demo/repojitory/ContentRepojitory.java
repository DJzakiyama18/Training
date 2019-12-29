package com.example.demo.repojitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ContentEntity;
@Repository
public interface ContentRepojitory extends JpaRepository<ContentEntity, Integer>{

}
