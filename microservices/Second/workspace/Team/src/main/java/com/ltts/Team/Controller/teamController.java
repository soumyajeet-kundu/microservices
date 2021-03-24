package com.ltts.Team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Team.Dao.teamDao;
import com.ltts.Team.model.Team;

@RestController
public class teamController {
		
	@Autowired
	teamDao td;
	
	  @GetMapping(value="/teams")
	    public List<Team> index() {
	        return td.getAllTeams();
	    }
}