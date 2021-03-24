package com.ltts.DetailedInfo.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailedInfo.model.Team;

@RestController
public class homeController {
	
	@Autowired
	RestTemplate rt;
	
	
	@RequestMapping("/detail")
	public List<Team> getExternalTeam(){
		/*
		 * //List<Team> li=new ArrayList<Team> List<Team>
		 * li=rt.getForObject("http://localhost:8080/teams", Team.class); return li;
		 * 
		 */
		
		/*
		 * ResponseEntity<List<Team>> responseEntity =
		 * rt.exchange("http://localhost:8080/teams", HttpMethod.GET, null, new
		 * ParameterizedTypeReference<List<Team>>() { }); List<Team> li =
		 * Arrays.asList(responseEntity.getBody()); return li;
		 */
		
		ResponseEntity<Team[]> response =
				  rt.getForEntity(
				  "http://team-service/teams/",
				  Team[].class);
				Team[] teams = response.getBody();
				List<Team> lt=Arrays.asList(teams);
				
				//player
				//plist array
				
				//List<Player> plt=Arrays.asList(players);
				
				//List<Combined> comlist 
				//combine
				//return the combined list
				return lt;
	}
	
	

}