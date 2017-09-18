package com.mylocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:dubbo.properties")
@ImportResource("classpath:provider.xml")
public class ServiceApplication {

    public static void main(String[] args) {
        try {
            Object o = new Object();
            synchronized (o) {
                while (true) {
                    SpringApplication.run(ServiceApplication.class, args);
                    o.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
