package com.example.stripepayment;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StripePaymentDemoApplication {

	@PostConstruct
	public void setup(){
		Stripe.apiKey = "sk_test_T5GgEByxZokCChfd80afL66u00H31pLjud";
	}

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentDemoApplication.class, args);
	}

}
