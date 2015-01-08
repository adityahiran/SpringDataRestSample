package edu.csus.ecs.careers.cpt;

import edu.csus.ecs.careers.cpt.json.ResourcesMapper;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.csus.ecs.careers.cpt.controllers.HelloWorldController;
import edu.csus.ecs.careers.cpt.domains.CareerSkillsAndOptions;
import edu.csus.ecs.careers.cpt.repositories.CareerSkillsAndOptionsRepo;

@EnableAutoConfiguration
//Tell Spring to automatically create a JPA implementation of our
//VideoRepository
@EnableJpaRepositories(basePackageClasses = {CareerSkillsAndOptionsRepo.class, CareerSkillsAndOptions.class})
//Tell Spring to turn on WebMVC (e.g., it should enable the DispatcherServlet
//so that requests can be routed to our Controllers)
@EnableWebMvc
//Tell Spring that this object represents a Configuration for the
//application
@Configuration
//Tell Spring to go and scan our controller package (and all sub packages) to
//find any Controllers or other components that are part of our applciation.
//Any class in this package that is annotated with @Controller is going to be
//automatically discovered and connected to the DispatcherServlet.
@ComponentScan(basePackageClasses={CareerSkillsAndOptionsRepo.class, CareerSkillsAndOptions.class, HelloWorldController.class, CPTFilter.class})
public class Application extends RepositoryRestMvcConfiguration {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }
  
 /* @Override
	public ObjectMapper halObjectMapper(){
		return new ResourcesMapper();
	}*/
}
