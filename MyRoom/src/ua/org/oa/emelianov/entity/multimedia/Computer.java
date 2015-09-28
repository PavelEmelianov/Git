package ua.org.oa.emelianov.entity.multimedia;

public class Computer extends Multimedia {

	public Computer(String name, String manufacturer, String gettingStartedDate, boolean isExpiredWarranty,
			String processorName, String videocardName, int ramAmount, double weight) {
		super(name, manufacturer, gettingStartedDate, isExpiredWarranty, weight);
		setProcessorName(processorName);
		setVideocardName(videocardName);
		setRamAmount(ramAmount);
		addAdditionalAttributes();
	}

	private String processorName;
	private String videocardName;
	private int ramAmount;

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public String getVideocardName() {
		return videocardName;
	}

	public void setVideocardName(String videocardName) {
		this.videocardName = videocardName;
	}

	public int getRamAmount() {
		return ramAmount;
	}

	public void setRamAmount(int ramAmount) {
		this.ramAmount = ramAmount;
	}

	@Override
	protected void addAdditionalAttributes() {
		getNamesAndAttributes().put("Processor", getProcessorName());
		getNamesAndAttributes().put("Videocard", getVideocardName());
		getNamesAndAttributes().put("RAM", String.valueOf(getRamAmount()) + " GB");

	}

}
