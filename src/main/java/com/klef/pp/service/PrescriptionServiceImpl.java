package com.klef.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.pp.entity.Prescription;
import com.klef.pp.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionRepository repository;

    @Override
    public Prescription insertPrescription(Prescription prescription) {
        return repository.save(prescription);
    }

    @Override
    public Prescription updatePrescription(Long id, Prescription prescription) {

        Prescription existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prescription not found"));

        existing.setName(prescription.getName());
        existing.setType(prescription.getType());
        existing.setStatus(prescription.getStatus());
        existing.setLocation(prescription.getLocation());

        return repository.save(existing);
    }

    @Override
    public void deletePrescription(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Prescription> getAllPrescriptions() {
        return repository.findAll();
    }

    @Override
    public Prescription getPrescriptionById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prescription not found"));
    }

    @Override
    public List<Prescription> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Prescription> findByType(String type) {
        return repository.findByType(type);
    }
}