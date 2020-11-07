package videocheckin;

public class VideoInformation {
	
	private String videoName;
	private long videoCode;
	private String whether; //나중에 불리언으로 바꿔보기
	
	public VideoInformation() {
		
	}
	
	public VideoInformation(long videoCode, String videoName, String whether) {
		this.videoCode = videoCode;
		this.videoName = videoName;
		this.whether = whether;
	}
	
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public long getVideoCode() {
		return videoCode;
	}
	public void setVideoCode(long videoCode) {
		this.videoCode = videoCode;
	}
	

	public String getWhether() {
		return whether;
	}

	public void setWhether(String whether) {
		this.whether = whether;
	}

	@Override
	public String toString() {
		return  videoCode + "\t" + videoName + "\t" + whether;
	}
	
	
}
