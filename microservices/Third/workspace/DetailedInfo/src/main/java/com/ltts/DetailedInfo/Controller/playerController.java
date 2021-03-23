package com.ltts.DetailedInfo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailedInfo.model.Player;

@RestController
public class playerController {

	
		@Autowired
		RestTemplate rt;
			
		  @GetMapping("/playerdetail")
			public List<Player> getExternalPlayer(){
				
				
				ResponseEntity<Player[]> response =
						  rt.getForEntity(
						  "http://localhost:8080/players/",
						  Player[].class);
						Player[] players = response.getBody();
						List<Player> pl=Arrays.asList(players);
						return pl;
			}

}
