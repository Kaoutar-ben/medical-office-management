package com.kaoutar.patientservice.service;

import com.kaoutar.patientservice.model.patient;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class patientService {
    private List<patient> patients = new ArrayList<>();
    private Long currentId = 1L;

    // Ajouter un patient
    public patient ajouterPatient(patient patient) {
        patient.setId(currentId++);
        patients.add(patient);
        return patient;
    }

    // Modifier un patient
    public patient modifierPatient(patient patient) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId().equals(patient.getId())) {
                patients.set(i, patient);
                return patient;
            }
        }
        return null;
    }

    // Supprimer un patient
    public boolean supprimerPatient(Long id) {
        return patients.removeIf(patient -> patient.getId().equals(id));
    }

    // Consulter un patient par ID
    public Optional<patient> consulterPatient(Long id) {
        return patients.stream()
                .filter(patient -> patient.getId().equals(id))
                .findFirst();
    }

    // Lister tous les patients
    public List<patient> listerTousPatients() {
        return new ArrayList<>(patients);
    }

}
