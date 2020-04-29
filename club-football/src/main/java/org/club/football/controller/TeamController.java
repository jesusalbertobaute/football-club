package org.club.football.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.club.football.service.TeamService;
import org.club.football.domain.Team;

@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/teams")
	public List<Team> getAll() {
		return teamService.getAll();
	}
}
