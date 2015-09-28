package ua.org.oa.emelianov.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Subject {

	protected Subject(String name, double weight) {
		setName(name);
		setWeight(weight);
	}

	private String name;
	private double weight;

	private Map<String, String> namesAndAttributes = new LinkedHashMap<String, String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Map<String, String> getNamesAndAttributes() {
		return namesAndAttributes;
	}

	abstract protected void addCoreAttributes();

	abstract protected void addAdditionalAttributes();

	public String extractAttributes() {
		StringBuilder keysAndValues = new StringBuilder();
		for (Map.Entry<String, String> entry : namesAndAttributes.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			keysAndValues.append(key).append(": ").append(value).append(System.lineSeparator());
		}
		return keysAndValues.toString();
	}

}
