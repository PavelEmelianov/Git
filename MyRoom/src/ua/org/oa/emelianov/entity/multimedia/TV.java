package ua.org.oa.emelianov.entity.multimedia;

public class TV extends Multimedia {

	public TV(String name, String manufacturer, String gettingStartedDate, boolean isExpiredWarranty,
			int numberOfChannels, double weight) {
		super(name, manufacturer, gettingStartedDate, isExpiredWarranty, weight);
		setNumberOfChannels(numberOfChannels);
		addAdditionalAttributes();

	}

	private int numberOfChannels;

	public int getNumberOfChannels() {
		return numberOfChannels;
	}

	public void setNumberOfChannels(int numberOfChannels) {
		this.numberOfChannels = numberOfChannels;
	}

	@Override
	protected void addAdditionalAttributes() {
		getNamesAndAttributes().put("Number of channels", String.valueOf(getNumberOfChannels()));

	}

}
