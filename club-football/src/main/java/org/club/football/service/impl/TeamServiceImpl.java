package org.club.football.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.club.football.domain.Team;
import org.club.football.service.TeamService;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

	@Override
	public List<Team> getAll() {
		List<Team> teams= new ArrayList<>();
		
		teams.add(new Team(1,"Castores"));
		teams.add(new Team(2,"Tigres"));
		teams.add(new Team(3,"Aguilas"));
		
		return teams;
	}

}
