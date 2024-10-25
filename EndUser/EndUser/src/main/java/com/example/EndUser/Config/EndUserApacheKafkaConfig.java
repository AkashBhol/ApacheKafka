package com.example.EndUser.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class EndUserApacheKafkaConfig {


    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
    public void updateValue(String value) {
        System.out.println(value);
    }
}
