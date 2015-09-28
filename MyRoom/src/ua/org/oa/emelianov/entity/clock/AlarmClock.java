package ua.org.oa.emelianov.entity.clock;

public class AlarmClock extends Clock {

	public AlarmClock(String name, int numbetOfBatteries, String batteryFormat, int alarmTime, double weight) {
		super(name, numbetOfBatteries, batteryFormat, weight);
		setAlarmTime(alarmTime);
		addAdditionalAttributes();
	}

	private int alarmTime;

	public int getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(int alarmTime) {
		this.alarmTime = alarmTime;
	}

	@Override
	protected void addAdditionalAttributes() {
		getNamesAndAttributes().put("Alarm time", getAlarmTime() + " o'clock");

	}

}
