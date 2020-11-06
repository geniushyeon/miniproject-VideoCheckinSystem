package videocheckin;
import java.util.List;
import java.util.ArrayList;
public class VideoRepository {
	List<VideoInformation> videoList = new ArrayList<>();
	VideoInformation videoInfo = new VideoInformation();
	
	public VideoRepository() {
		setVideoList();
	}
	

	public void setVideoList() {
		videoInfo.setVideoCode(101);
		videoInfo.setVideoName("캡틴마블");
		videoList.add(videoInfo);
	}
	
}
