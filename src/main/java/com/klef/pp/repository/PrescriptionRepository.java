package com.klef.pp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.pp.entity.Prescription;

public interface PrescriptionRepository
        extends JpaRepository<Prescription, Long> {

    List<Prescription> findByName(String name);

    List<Prescription> findByType(String type);
}