package com.github.Olaf0.officialmedicalclinic.controller;

import com.github.Olaf0.officialmedicalclinic.model.Patient;
import com.github.Olaf0.officialmedicalclinic.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/patients")
public class PatientController {

private PatientService patientService;

@GetMapping
    public List<Patient> getAllPatients() {
    return patientService.getAllPatients();
}
@GetMapping("/{email}")
    public Optional<Patient> getPatientByEmail(@PathVariable String email) {
    return patientService.getPatientByEmail(email);
}
@PostMapping
    public Patient addNewPatient(@RequestBody Patient patient) {
    return patientService.addNewPatient(patient);
}
@DeleteMapping
    public Patient deletePatientByEmail(@PathVariable String email) {
    return patientService.deletePatientByEmail(email);
}
@PutMapping
    public Patient editPatientByEmail(@PathVariable String email,@RequestBody Patient editPatient) {
    return patientService.editPatientByEmail(email,editPatient);
}



}
