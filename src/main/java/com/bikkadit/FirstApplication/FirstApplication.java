package com.bikkadit.FirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {
      
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

   
	//priority work
	public String ImpWork() {
		return "task completing";	
	}
	
	public String Task() {
		return "task completed";
		
	}
	
	

	
	//afternoon work
	public String demo1() {
		return "task running";
	}


}
