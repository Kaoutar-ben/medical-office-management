package com.kaoutar.rendezvous.service;

import com.kaoutar.rendezvous.model.Appointment;
import com.kaoutar.rendezvous.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public Appointment createAppointment(Appointment appointment) {
        return repository.save(appointment);
    }

    public List<Appointment> getAppointmentsForPatient(Long patientId) {
        return repository.findByPatientId(patientId);
    }
}
