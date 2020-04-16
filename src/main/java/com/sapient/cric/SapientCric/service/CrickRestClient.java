package com.sapient.cric.SapientCric.service;

import com.sapient.cric.SapientCric.dao.ScorePojo;

public interface CrickRestClient {
	
	static final String apiKey="WmPJrX2s3KMyZVPFwlm1vxXLXKw1"; 
	public ScorePojo getCricketScore(String uniqueId);


}
