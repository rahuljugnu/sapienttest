package com.sapient.cric.SapientCric.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;




@Component
public class CrickRestClientImpl implements CrickRestClient {

	private static final String REST_URL = "http://cricapi.com/api/cricketScore";

	@Override
	public com.sapient.cric.SapientCric.dao.ScorePojo getCricketScore(String uniqueId) {
		RestTemplate restTemplate = new RestTemplate();
		String query="?"+"unique_id="+uniqueId+"&"+"apikey="+CrickRestClient.apiKey;
		
		String request = REST_URL+query;
		com.sapient.cric.SapientCric.dao.ScorePojo reservation = restTemplate.getForObject(request, com.sapient.cric.SapientCric.dao.ScorePojo.class);
		return reservation;
	}

	

}
