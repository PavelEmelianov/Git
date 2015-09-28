package ua.org.oa.emelianov.entity;

public class Carpet extends Subject {

	public Carpet(String name, int length, int width, double weight) {
		super(name, weight);
		setLength(length);
		setWidth(width);
		addCoreAttributes();
	}

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	protected void addCoreAttributes() {
		getNamesAndAttributes().put("Name", getName());
		getNamesAndAttributes().put("Length", String.valueOf(getLength()) + " m.");
		getNamesAndAttributes().put("Width", String.valueOf(getWidth()) + " m.");
		getNamesAndAttributes().put("Weight", String.valueOf(getWeight()) + " kg.");

	}

	@Override
	protected void addAdditionalAttributes() {
	}

}
