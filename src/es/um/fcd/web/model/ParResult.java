package es.um.fcd.web.model;

import java.util.Map;

import es.um.fcd.model.Par;

public class ParResult {
	private Par par;
	private Map<Integer, Integer> topResults;
	private double mean;
	
	public ParResult(Par par, Map<Integer, Integer> topResults, double mean) {
		this.par = par;
		this.topResults = topResults;
		this.mean = mean;
	}
	
	public Par getPar() {
		return par;
	}
	
	public void setPar(Par par) {
		this.par = par;
	}
	
	public Map<Integer, Integer> getTopResults() {
		return topResults;
	}
	
	public void setTopResults(Map<Integer, Integer> topResults) {
		this.topResults = topResults;
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}
}