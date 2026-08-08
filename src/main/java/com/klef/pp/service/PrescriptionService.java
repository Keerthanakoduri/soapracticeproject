package com.klef.pp.service;

import java.util.List;

import com.klef.pp.entity.Prescription;

public interface PrescriptionService {

    Prescription insertPrescription(Prescription prescription);

    Prescription updatePrescription(Long id, Prescription prescription);

    void deletePrescription(Long id);

    List<Prescription> getAllPrescriptions();

    Prescription getPrescriptionById(Long id);

    List<Prescription> findByName(String name);

    List<Prescription> findByType(String type);
}