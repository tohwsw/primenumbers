package com.example.primenumbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class PrimenumbersApplication {

	@GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

	@GetMapping("/primes")
    public int getPrimes(@RequestParam int max) {
        SieveOfEratosthenesPrimeGenerator generator = new SieveOfEratosthenesPrimeGenerator();
        return generator.generatePrimes(max);
    }

	public static void main(String[] args) {
		SpringApplication.run(PrimenumbersApplication.class, args);
    
	}

}
