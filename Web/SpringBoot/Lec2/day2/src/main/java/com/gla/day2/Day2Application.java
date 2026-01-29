package com.gla.day2;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day2Application implements CommandLineRunner {

    public Day2Application(RazorPayPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public static void main(String[] args) {
		SpringApplication.run(Day2Application.class, args);
	}

	@Autowired
	private final RazorPayPaymentService paymentService;

	@Override
	public void run(String... args) throws Exception {
		String payment = paymentService.pay();
		System.out.println(payment);
	}
}
