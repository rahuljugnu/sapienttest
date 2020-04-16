package com.sapient.cric.SapientCric.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sapient.cric.SapientCric.dao.OutputPojo;
import com.sapient.cric.SapientCric.dao.ScorePojo;
import com.sapient.cric.SapientCric.service.CrickRestClientImpl;

@RestController
public class CrickController {

	@Autowired
	CrickRestClientImpl crickRestClient;
	
	
	/*
	 * //@RequestMapping("/showScore")
	 * 
	 * @GetMapping(path = "/showScore/{uniqueId}") //@GetMapping(path =
	 * "/hello-world/path-variable/{name}") //public HelloWorldBean
	 * helloWorldPathVariable(@PathVariable String name) { public String
	 * showScore(@PathVariable String uniqueId) {
	 * com.sapient.cric.SapientCric.dao.ScorePojo cricketScore =
	 * crickRestClient.getCricketScore(uniqueId); OutputPojo outputPojo = new
	 * OutputPojo(); outputPojo.setTeam1(cricketScore.getTeam1());
	 * outputPojo.setTeam2(cricketScore.getTeam2());
	 * outputPojo.setWinningTeamScore(""); outputPojo.setRoundRotation("");
	 * System.out.println("Show CheckIN"); return outputPojo.toString(); }
	 */
	
	@GetMapping(path = "/showScore/{uniqueId}")
	
	public String showScore(@PathVariable String uniqueId) {

		ScorePojo cricketScore = crickRestClient.getCricketScore(uniqueId);

		OutputPojo outputPojo = new OutputPojo();

		//"score": "Sunrisers Hyderabad 139/7  v Chennai Super Kings 140/8 *",

		//Winning team’s score: 140/8

		//Round rotation: 8140/

		outputPojo.setTeam1(cricketScore.getTeam1());

		outputPojo.setTeam2(cricketScore.getTeam2());

		String score = cricketScore.getScore();

		if(score!=null && !score.isEmpty()) {

		score = score.substring(score.indexOf(" v ")+3, score.length()-1);

		

		if(score.indexOf(cricketScore.getTeam1())!=-1) {

			System.out.println("Team-1 is wenner");

			outputPojo.setTeam1(cricketScore.getTeam1()+"(winner)");

			score = score.substring(cricketScore.getTeam1().length(), score.length()-1);

		}

		else

		{

			outputPojo.setTeam2(cricketScore.getTeam2()+"(winner)");

			System.out.println("Team-2 is wenner");

			score = score.substring(cricketScore.getTeam2().length(), score.length()-1);

		}

		

		

		outputPojo.setWinningTeamScore(score);

		String [] array =score.split("/");

		String rotation = array[1]+array[0]+"/";

		outputPojo.setRoundRotation(rotation.replaceAll(" ", ""));
		System.out.println("Show CheckIN");

		}

		System.out.println("Show CheckIN");

		return outputPojo.toString();

	}
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	

	@RequestMapping("/test")
	public String showCheckIn() {
		return "test";
	}

	
	
	
}
