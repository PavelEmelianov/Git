package ua.org.oa.emelianov.entity.furniture;

public class Sofa extends Furniture {

	public Sofa(String name, double height, double width, double length, double weight, boolean isFolding) {
		super(name, height, width, length, weight);
		setFolding(isFolding);
		addAdditionalAttributes();
	}

	boolean isFolding;

	public boolean isFolding() {
		return isFolding;
	}

	public void setFolding(boolean isFolding) {
		this.isFolding = isFolding;
	}

	@Override
	protected void addAdditionalAttributes() {
		getNamesAndAttributes().put("Is folding", String.valueOf(isFolding()));
	}

}
