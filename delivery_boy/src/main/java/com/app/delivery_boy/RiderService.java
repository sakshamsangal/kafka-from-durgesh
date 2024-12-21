package com.app.delivery_boy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Slf4j
@Service
@RequiredArgsConstructor
public class RiderService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void updateLocation() {
        long x = Math.round(Math.random() * 100);
        long y = Math.round(Math.random() * 100);
        String msg = MessageFormat.format("({0},{1})", x, y);
        log.info("updateLocation {}", msg);
        kafkaTemplate.send("user-topic", msg);
    }
}
