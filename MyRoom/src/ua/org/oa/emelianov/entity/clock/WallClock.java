package ua.org.oa.emelianov.entity.clock;

public class WallClock extends Clock {

	public WallClock(String name, int numbetOfBatteries, String batteryFormat, int positionHeightOnTheWall,
			double weight) {
		super(name, numbetOfBatteries, batteryFormat, weight);
		setPositionHeightOnTheWall(positionHeightOnTheWall);
		addAdditionalAttributes();
	}

	private int positionHeightOnTheWall;

	public int getPositionHeightOnTheWall() {
		return positionHeightOnTheWall;
	}

	public void setPositionHeightOnTheWall(int positionHeightOnTheWall) {
		this.positionHeightOnTheWall = positionHeightOnTheWall;
	}

	@Override
	protected void addAdditionalAttributes() {
		getNamesAndAttributes().put("Position height on the wall", getPositionHeightOnTheWall() + " m.");

	}

}
