package com.mitocode.dto;

import com.mitocode.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VitalSignDTO {
    private Integer idVitalSign;

    @NotNull
    private PatientDTO patient;

    @NotNull
    @Size(min = 2, message = "{temperature.size}")
    private String temperature;

    @Size(min = 2, message = "{pulse.size}")
    private String pulse;

    @Size(min = 2, message = "{swing.size}")
    private String swing;

    @NotNull
    private LocalDateTime vitalSignDate;


}
