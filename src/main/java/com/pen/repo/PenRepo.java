package com.pen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pen.model.PenModel;

@Repository
public interface PenRepo extends JpaRepository<PenModel, Integer>{

}
