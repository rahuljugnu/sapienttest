package com.sapient.cric.SapientCric.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScorePojo {

    private String stat;

    private String creditsLeft;

    private Provider provider;
    
    private String v;

    private String matchStarted;
   @JsonProperty("team-1")
    private String team1;

    private String ttl;
    @JsonProperty("team-2")
    private String team2;
    
    @JsonProperty("score")
    private String score;

    public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getStat ()
    {
        return stat;
    }

    public void setStat (String stat)
    {
        this.stat = stat;
    }

    public String getCreditsLeft ()
    {
        return creditsLeft;
    }

    public void setCreditsLeft (String creditsLeft)
    {
        this.creditsLeft = creditsLeft;
    }

    public Provider getProvider ()
    {
        return provider;
    }

    public void setProvider (Provider provider)
    {
        this.provider = provider;
    }

    public String getV ()
    {
        return v;
    }

    public void setV (String v)
    {
        this.v = v;
    }

    public String getMatchStarted ()
    {
        return matchStarted;
    }

    public void setMatchStarted (String matchStarted)
    {
        this.matchStarted = matchStarted;
    }

   

    public String getTtl ()
    {
        return ttl;
    }

    public void setTtl (String ttl)
    {
        this.ttl = ttl;
    }

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

   

    
}
