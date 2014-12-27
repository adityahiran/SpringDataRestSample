package edu.csus.ecs.careers.cpt.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import edu.csus.ecs.careers.cpt.domains.CareerSkillsAndOptions;

@RepositoryRestResource(path = "/careerskillsandoptions")
public interface CareerSkillsAndOptionsRepo extends CrudRepository<CareerSkillsAndOptions, Integer> {
	
	//public Collection<CareerSkillsAndOptions> findAll();
}
