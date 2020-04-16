package com.sapient.cric.SapientCric.dao;

public class OutputPojo {

	private String team1;
	private String team2;
	private String winningTeamScore;
	private String roundRotation;
	
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
	public String getWinningTeamScore() {
		return winningTeamScore;
	}
	public void setWinningTeamScore(String winningTeamScore) {
		this.winningTeamScore = winningTeamScore;
	}
	public String getRoundRotation() {
		return roundRotation;
	}
	public void setRoundRotation(String roundRotation) {
		this.roundRotation = roundRotation;
	}
	@Override
	public String toString() {
		return "{team1:" + team1 + ", team2:" + team2 + ", winningTeamScore:" + winningTeamScore
				+ ", roundRotation:" + roundRotation + "}";
	}
	
	
}
