package com.example.healtassistant.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PersonalResult {

    private float basicMetabolism;

    private float BMI;

    private float idealBodyWeight;

}
