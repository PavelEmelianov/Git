package ua.org.oa.emelianov.entity.furniture;

import ua.org.oa.emelianov.entity.Subject;

public abstract class Furniture extends Subject {

	Furniture(String name, double height, double width, double length, double weight) {
		super(name, weight);
		setHeight(height);
		setWidth(width);
		setLength(length);
		addCoreAttributes();
	}

	private double height;
	private double width;
	private double length;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double widht) {
		this.width = widht;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	protected void addCoreAttributes() {
		getNamesAndAttributes().put("Name", getName());
		getNamesAndAttributes().put("Height", String.valueOf(getHeight()) + " m.");
		getNamesAndAttributes().put("Width", String.valueOf(getWidth()) + " m.");
		getNamesAndAttributes().put("Length", String.valueOf(getLength()) + " m.");
		getNamesAndAttributes().put("Weight", String.valueOf(getWeight()) + " kg.");
	}

}
