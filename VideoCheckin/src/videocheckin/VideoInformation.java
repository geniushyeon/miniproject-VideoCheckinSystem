package videocheckin;

public class VideoInformation {
	
	private String videoName;
	private long videoCode;
	
	public VideoInformation() {
		
	}
	
	public VideoInformation(long videoCode, String videoName) {
		this.videoCode = videoCode;
		this.videoName = videoName;
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

	@Override
	public String toString() {
		return  videoCode + "\t" + videoName;
	}
	
	
}
