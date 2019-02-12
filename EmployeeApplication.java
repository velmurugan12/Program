package com.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.maven"})
public class EmployeeApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EmployeeApplication.class, args);
    }
}
