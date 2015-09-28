package ua.org.oa.emelianov.entity.clock;

import ua.org.oa.emelianov.entity.Subject;

abstract class Clock extends Subject {

	protected Clock(String name, int numbetOfBatteries, String batteryFormat, double weight) {
		super(name, weight);
		setNumberOfBatteries(numbetOfBatteries);
		setBatteryFormat(batteryFormat);
		addCoreAttributes();
	}

	private int numberOfBatteries;
	private String batteryFormat;

	public int getNumberOfBatteries() {
		return numberOfBatteries;
	}

	public void setNumberOfBatteries(int numberOfBatteries) {
		this.numberOfBatteries = numberOfBatteries;
	}

	public String getBatteryFormat() {
		return batteryFormat;
	}

	public void setBatteryFormat(String batteryFormat) {
		this.batteryFormat = batteryFormat;
	}

	@Override
	protected void addCoreAttributes() {
		getNamesAndAttributes().put("Name", getName());
		getNamesAndAttributes().put("Number of batteries", String.valueOf(getNumberOfBatteries()));
		getNamesAndAttributes().put("Battery format", getBatteryFormat());
		getNamesAndAttributes().put("Weight", String.valueOf(getWeight() + " kg."));

	}

}
