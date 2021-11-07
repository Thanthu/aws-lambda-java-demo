package helloworld.dto;

public class ClinicalData {
	
	private String bp;
	private String heartRate;
	
	public ClinicalData(String bp, String heartRate) {
		this.bp = bp;
		this.heartRate = heartRate;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}
	
	

}
