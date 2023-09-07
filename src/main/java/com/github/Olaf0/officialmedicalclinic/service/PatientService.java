package com.github.Olaf0.officialmedicalclinic.service;

import com.github.Olaf0.officialmedicalclinic.model.Patient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PatientService {
   private PatientService patientService;

   public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
}
