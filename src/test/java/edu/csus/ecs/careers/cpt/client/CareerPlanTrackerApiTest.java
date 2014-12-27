package edu.csus.ecs.careers.cpt.client;

import edu.csus.ecs.careers.cpt.client.CareerPlanTrackerApi;
import edu.csus.ecs.careers.cpt.domains.CareerSkillsAndOptions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;

public class CareerPlanTrackerApiTest {

	private final String TEST_URL = "http://localhost:8080";

	private CareerPlanTrackerApi api = new RestAdapter.Builder()
			.setEndpoint(TEST_URL).setLogLevel(LogLevel.FULL).build()
			.create(CareerPlanTrackerApi.class);

	
	@Test
	public void testListCareerSkillsAndOptions() throws Exception {
		
		// Getting back response in gson. Should convert it into json using jackson.
		//api.getAllCareerSkillsAndOptions();
	}

}