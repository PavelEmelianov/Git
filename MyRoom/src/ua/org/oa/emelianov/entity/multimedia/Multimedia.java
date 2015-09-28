package ua.org.oa.emelianov.entity.multimedia;

import ua.org.oa.emelianov.entity.Subject;

abstract class Multimedia extends Subject {

	protected Multimedia(String name, String manufacturer, String gettingStartedDate, boolean isExpiredWarranty,
			double weight) {
		super(name, weight);
		setManufacturer(name);
		setManufacturer(manufacturer);
		setGettingStartedDate(gettingStartedDate);
		setExpiredWarranty(isExpiredWarranty);
		addCoreAttributes();
	}

	private String manufacturer;
	private String gettingStartedDate;
	private boolean isExpiredWarranty;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getGettingStartedDate() {
		return gettingStartedDate;
	}

	public void setGettingStartedDate(String gettingStartedDate) {
		this.gettingStartedDate = gettingStartedDate;
	}

	public boolean isExpiredWarranty() {
		return isExpiredWarranty;
	}

	public void setExpiredWarranty(boolean isExpiredWarranty) {
		this.isExpiredWarranty = isExpiredWarranty;
	}

	@Override
	protected void addCoreAttributes() {
		getNamesAndAttributes().put("Name", getName());
		getNamesAndAttributes().put("Manufacturer", getManufacturer());
		getNamesAndAttributes().put("Start of exploitation", getGettingStartedDate());
		getNamesAndAttributes().put("Expired warranty", String.valueOf(isExpiredWarranty()));
		getNamesAndAttributes().put("Weight", String.valueOf(getWeight()) + " kg.");
	}

}
