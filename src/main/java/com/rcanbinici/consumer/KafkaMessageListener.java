package com.rcanbinici.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
	
	Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
	
	@KafkaListener(topics = "kafka-demo", groupId = "rc-group-1")
    public void consumeEvents(String message) {
        log.info("consumer consume the events {} ", message);
    }
	
//  @KafkaListener(topics = "kafka-demo1",groupId = "rc-group-new")
//  public void consume2(String message) {
//      log.info("consumer2 consume the message {} ", message);
//  }
//
//  @KafkaListener(topics = "kafka-demo1",groupId = "rc-group-new")
//  public void consume3(String message) {
//      log.info("consumer3 consume the message {} ", message);
//  }
//
//  @KafkaListener(topics = "kafka-demo1",groupId = "rc-group-new")
//  public void consume4(String message) {
//      log.info("consumer4 consume the message {} ", message);
//  }
}
