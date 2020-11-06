package videocheckin;
import java.util.Scanner;
public class VideoCheckinSystem {
	
	Scanner scan = new Scanner(System.in);
	ClientRepository clientRepo = new ClientRepository();
	VideoRepository	videoRepo = new VideoRepository();

	
	public VideoCheckinSystem() {
		
	}
	
	public void run() {
		System.out.println("이지 비디오 관리 시스템입니다.");
//		clientRepo.getClientList();
		System.out.println("고객의 이름을 입력하세요.");
		System.out.print("입력: ");
		String clientName = scan.next();
		System.out.println(clientRepo.client.getClientName());
//		System.out.println(clientRepo.clientList.toString());
		if (clientName.equals(clientRepo.client.getClientName())) {
			getClientInformation();
		}
		
	}

	public void getClientInformation() {
		if (clientRepo.client.getLateFee() == 0) {
			inputVideoCode();
			
		}
		
		else {
			getLateFee();
		}
		
	}

	public void getLateFee() {
		System.out.println("고객님의 연체료는 " + clientRepo.client.getLateFee() + "원입니다. ");
		System.out.println("연체료를 결제해주세요. ");
	}

	public void inputVideoCode() {
		System.out.println("대여해줄 비디오 코드를 입력하세요. ");
		long inputVideoCode = scan.nextLong();
		if ((long)inputVideoCode == videoRepo.videoInfo.getVideoCode()) {			
			System.out.println(videoRepo.videoInfo.getVideoName() + " 비디오 대여가 완료되었습니다. ");
			clientRepo.clientVideoList.add(videoRepo.videoList.get(0));
			
			
		}
		
		
	}
	

}
