package com.github.Olaf0.officialmedicalclinic.repository;


import com.github.Olaf0.officialmedicalclinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Optional<Patient> findByEmail(String email);
}
