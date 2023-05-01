package com.example;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	public int getPopulation(String city) {
		Map<String, Integer> populationMap = null;
		int populationCount = 0;
		if (city.isEmpty()) {
			throw new NullPointerException("input should be  Empty:");
		}
		populationMap = getPopulationStatistic();
		if (!populationMap.containsKey(city)) {
			throw new NullPointerException("invalid input:");
		} else {
			populationCount = populationMap.get(city);
		}
		return populationCount;
	}

	private Map<String, Integer> getPopulationStatistic() {
		Map<String, Integer> populationMap = new HashMap<String, Integer>();
		populationMap.put("Bangalore", 200000);
		populationMap.put("Hyderabad", 500000);
		populationMap.put("Pune", 300000);
		populationMap.put("Mumbai", 800000);

		return populationMap;
	}
}
