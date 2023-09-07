package com.github.Olaf0.officialmedicalclinic.repository;

import com.github.Olaf0.officialmedicalclinic.model.Patient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@RequestMapping
public class PatientRepository {
    private List<Patient> patientList = new ArrayList();

    public List<Patient> getAllPatients() {
        return patientList;
    }
}
