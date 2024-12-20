package com.kaoutar.rendezvous.controller;

import com.kaoutar.rendezvous.model.Appointment;
import com.kaoutar.rendezvous.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        return ResponseEntity.ok(service.createAppointment(appointment));
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<Appointment>> getAppointments(@PathVariable Long patientId) {
        return ResponseEntity.ok(service.getAppointmentsForPatient(patientId));
    }
}
