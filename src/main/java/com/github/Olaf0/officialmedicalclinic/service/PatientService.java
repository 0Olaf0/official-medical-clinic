package com.github.Olaf0.officialmedicalclinic.service;

import com.github.Olaf0.officialmedicalclinic.model.Patient;
import com.github.Olaf0.officialmedicalclinic.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PatientService {
   private PatientRepository patientRepository;

   public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    public Optional<Patient> getPatientByEmail( String email) {
       return patientRepository.findByEmail(email);
    }
    public Patient addNewPatient(Patient patient) {
       return patientRepository.save(patient);
    }
    public Patient deletePatientByEmail(String email) {
        Patient patient = patientRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found"));
        patientRepository.delete(patient);
        return patient;
    }
    public Patient editPatientByEmail(String email, Patient editPatient) {
       Patient patient = patientRepository.findByEmail(email)
               .orElseThrow(() -> new IllegalArgumentException("Patient not found"));
       if (editPatient.getIdCardNo() == null)
           throw new IllegalArgumentException("Not possible");
       if (!patient.getIdCardNo().equals(editPatient.getIdCardNo()))
        throw new IllegalArgumentException("Not possible");
       if (editPatient.getEmail() == null)
        throw new IllegalArgumentException("Not possible");
       if (editPatient.getPassword() == null)
        throw new IllegalArgumentException("Not possible");
       if (editPatient.getFirstName() == null)
           throw new IllegalArgumentException("Not possible");
       if (editPatient.getLastName() == null)
           throw new IllegalArgumentException("Not possible");
       if (editPatient.getPhoneNumber() == null)
           throw new IllegalArgumentException("Not possible");
       if (editPatient.getBirthday() == null)
           throw new IllegalArgumentException("Not possible");
       patient.update(editPatient);
       return patientRepository.save(patient);
    }




}
