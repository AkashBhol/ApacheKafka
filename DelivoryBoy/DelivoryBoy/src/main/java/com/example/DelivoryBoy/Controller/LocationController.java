package com.example.DelivoryBoy.Controller;

import com.example.DelivoryBoy.Service.DelivoryKafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v2")
public class LocationController {

    @Autowired
    private DelivoryKafkaService delivoryKafkaService;


    @PostMapping("/create")
    public ResponseEntity<?> updatedeleivoryKafha() {
        String latitude = String.valueOf(Math.random() * 100);
        String longitude = String.valueOf(Math.random() * 100);
        delivoryKafkaService.updateLocation(longitude);
        return new ResponseEntity<>(Map.of("shvxh","location updated"), HttpStatus.CREATED);
    }
}
