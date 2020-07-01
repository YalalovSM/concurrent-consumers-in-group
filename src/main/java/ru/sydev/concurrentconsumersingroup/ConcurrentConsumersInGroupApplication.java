package ru.sydev.concurrentconsumersingroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConcurrentConsumersInGroupApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConcurrentConsumersInGroupApplication.class, args);
        context.getBean(KafkaConsumersDemo.class).start();
    }
}
