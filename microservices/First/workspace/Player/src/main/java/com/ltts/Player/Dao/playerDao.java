package com.ltts.Player.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Player.model.Player;
@Repository
public class playerDao {
	public List<Player> getAllPlayers()
	{
		List <Player> li = new ArrayList<Player>();
		li.add(new Player(1, "Dhoni", "India"));	
		li.add(new Player(2, "Sachin", "India"));		
		li.add(new Player(3, "Sehwag", "India"));		
		return li;		
		
	}
	
}