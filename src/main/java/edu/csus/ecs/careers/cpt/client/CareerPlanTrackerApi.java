package edu.csus.ecs.careers.cpt.client;

import java.util.Collection;

import edu.csus.ecs.careers.cpt.domains.CareerSkillsAndOptions;
import retrofit.http.GET;

public interface CareerPlanTrackerApi {
	
	public static final String CAREERSKILLS_AND_OPTIONS_PATH = "/careerskillsandoptions";

	@GET(CAREERSKILLS_AND_OPTIONS_PATH)
	public String getAllCareerSkillsAndOptions();
}
