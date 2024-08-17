package com.bikkadit.FirstApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FirstApplication.class);
	}
	
	public void developChanges() {
     System.out.println("Developer changes");
	}
	public void QAChanges() {
	     System.out.println("QA changes");
	}
<<<<<<< HEAD
	public void QA1Changes() {
	     System.out.println("QA1 changes");
	}

=======
	public void developChanges1() {
	     System.out.println("Developer changes1");
		}
>>>>>>> 2679ed7 (V1:B-12345, d11)

}