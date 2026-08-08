package com.klef.pp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.pp.entity.Prescription;
import com.klef.pp.service.PrescriptionService;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService service;

    @PostMapping("/add")
    public Prescription insertPrescription(
            @RequestBody Prescription prescription) {

        return service.insertPrescription(prescription);
    }

    @PutMapping("/update/{id}")
    public Prescription updatePrescription(
            @PathVariable Long id,
            @RequestBody Prescription prescription) {

        return service.updatePrescription(id, prescription);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePrescription(@PathVariable Long id) {

        service.deletePrescription(id);

        return "Prescription deleted successfully";
    }

    @GetMapping("/displayAll")
    public List<Prescription> getAllPrescriptions() {

        return service.getAllPrescriptions();
    }

    @GetMapping("/display/{id}")
    public Prescription getPrescriptionById(
            @PathVariable Long id) {

        return service.getPrescriptionById(id);
    }

    @GetMapping("/findByName/{name}")
    public List<Prescription> findByName(
            @PathVariable String name) {

        return service.findByName(name);
    }

    @GetMapping("/findByType/{type}")
    public List<Prescription> findByType(
            @PathVariable String type) {

        return service.findByType(type);
    }
}