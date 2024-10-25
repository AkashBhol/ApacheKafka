package com.example.DelivoryBoy.Service;

import com.example.DelivoryBoy.kfakaConfig.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DelivoryKafkaService {

    @Autowired
    private KafkaTemplate<String, String> stringStringKafkaTemplate;

    public boolean updateLocation(String location) {
        this.stringStringKafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        return  true;
    }
}
