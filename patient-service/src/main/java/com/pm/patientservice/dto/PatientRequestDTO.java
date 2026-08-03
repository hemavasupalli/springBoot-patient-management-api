package com.pm.patientservice.dto;

import com.pm.patientservice.dto.validation.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class PatientRequestDTO {
    @NotBlank(message = "Name is mandatory")
    @Size(max = 100, message = "Name must not exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is mandatory")
    private String address;


    @NotNull(message = "Date of Birth is mandatory")
    private String dateOfBirth;

@NotBlank(groups = CreatePatientValidationGroup.class, message = "Registered Date is mandatory")
private String registeredDate;

}
