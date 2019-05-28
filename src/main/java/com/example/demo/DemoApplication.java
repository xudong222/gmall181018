package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		HelloRunable helloRunable = new HelloRunable();
		Thread thread = new Thread(helloRunable);
		thread.start();

		for (int i = 0; i< 100;i++){
			if(i%2 == 0){
				System.out.println("++"+i);
			}

		}


	}

}
