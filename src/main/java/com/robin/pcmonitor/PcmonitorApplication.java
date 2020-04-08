package com.robin.pcmonitor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PcmonitorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PcmonitorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length == 0) {
            System.out.println("hello nobody");
        } else {
            System.out.println(args[0]);
        }

    }
}
