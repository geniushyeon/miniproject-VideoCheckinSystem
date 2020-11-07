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
		videoList.add(new VideoInformation(101, "캡틴마블"));
		videoList.add(new VideoInformation(102, "다크페이트"));


	}
	
	public void getVideoList() {
		System.out.println("Code\tTitle");
		System.out.println("---------------");
		for (VideoInformation v : videoList) {
			System.out.println(v.toString());
		}
	}
	
}
