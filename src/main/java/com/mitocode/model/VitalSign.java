package com.mitocode.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VitalSign {


    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVitalSign;


    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false, foreignKey = @ForeignKey(name = "FK_VITAL_SIGN_PATIENT"))
    private Patient patient;

    @Column(length = 100, nullable = false)
    private String temperature;

    @Column(length = 100, nullable = false)
    private String pulse;

    @Column(length = 100, nullable = false)
    private String swing;

    @Column(nullable = false)
    private LocalDateTime vitalSignDate;

}
