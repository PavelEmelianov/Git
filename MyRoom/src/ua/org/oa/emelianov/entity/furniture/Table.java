package ua.org.oa.emelianov.entity.furniture;

public class Table extends Furniture {

	public Table(String name, double height, double width, double length, double weight) {
		super(name, height, width, length, weight);
		addAdditionalAttributes();
	}

	@Override
	protected void addAdditionalAttributes() {
	}

}
