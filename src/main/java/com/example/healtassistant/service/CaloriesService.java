package com.example.healtassistant.service;

import com.example.healtassistant.model.dto.PersonalResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CaloriesService {

    public PersonalResult calculatePersonalResults(String sex,
                                                   int age,
                                                   float weight,
                                                   float height) {
        PersonalResult.PersonalResultBuilder personalResultBuilder = PersonalResult.builder();
        personalResultBuilder.BMI(weight / ((height / 100) * (height / 100)));

        if (sex.equals("kobieta")) {
            return personalResultBuilder
                    .basicMetabolism((float) (655.1 + (9.56 * weight) + ((1.85 * height) - (4.68 * age))))
                    .idealBodyWeight((float) ((height - 100) * 0.85))
                    .build();
        }
        return personalResultBuilder
                .basicMetabolism((float) (66.5 + (13.75 * weight) + ((5 * height) - (6.78 * age))))
                .idealBodyWeight((float) ((height - 100) * 0.9))
                .build();
    }

}
