package ua.org.oa.emelianov.entity.furniture;

public class Chair extends Furniture {

	public Chair(String name, double height, double width, double length, double weight, boolean isRocking) {
		super(name, height, width, length, weight);
		setRocking(isRocking);
		addAdditionalAttributes();
	}

	private boolean isRocking;

	public boolean isRocking() {
		return isRocking;
	}

	public void setRocking(boolean isRocking) {
		this.isRocking = isRocking;
	}

	@Override
	protected void addAdditionalAttributes() {
		getNamesAndAttributes().put("Is rocking", String.valueOf(isRocking()));
	}

}
