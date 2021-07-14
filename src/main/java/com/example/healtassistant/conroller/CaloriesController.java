package com.example.healtassistant.conroller;

import com.example.healtassistant.model.dto.PersonalResult;
import com.example.healtassistant.service.CaloriesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/calories")
@CrossOrigin("*")
public class CaloriesController {

    private final CaloriesService caloriesService;

    @GetMapping
    public ResponseEntity<PersonalResult> getPersonalResult(@RequestParam String sex,
                                                            @RequestParam int age,
                                                            @RequestParam float weight,
                                                            @RequestParam float height){
        return ResponseEntity
                .ok(caloriesService.calculatePersonalResults(sex, age, weight, height));
    }

}
