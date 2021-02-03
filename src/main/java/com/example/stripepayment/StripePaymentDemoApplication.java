package com.example.stripepayment;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StripePaymentDemoApplication {

	@Value("${stripe.api.key}")
	private String apiKey;

	@PostConstruct
	public void setup(){
		Stripe.apiKey = apiKey;
	}

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentDemoApplication.class, args);
	}

}
