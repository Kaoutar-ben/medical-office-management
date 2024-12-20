package com.kaoutar.rendezvous.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@ApiModel
public class Appointment {
    private static int idGenerator = 0;
    @Id
    @ApiModelProperty(notes = "The database generated appointment ID")
    private int id;

    @ApiModelProperty(notes = "Date of the appointment")
    private LocalDateTime date;

    @ApiModelProperty(notes = "The patient ID")
    private String patientID;

    @ApiModelProperty(notes = "The practitioner ID")
    private String praticienId;

    @ApiModelProperty(notes = "The description of the appointment")
    private String description;

}
