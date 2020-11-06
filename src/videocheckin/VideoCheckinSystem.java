package videocheckin;
import java.util.Scanner;
public class VideoCheckinSystem {

	Scanner scan = new Scanner(System.in);
	ClientRepository clientRepo = new ClientRepository();
	VideoRepository	videoRepo = new VideoRepository();

	int client;

	public VideoCheckinSystem() {

	}

	public void run() {
		System.out.println("이지 비디오 관리 시스템입니다.");
		System.out.println("고객의 이름을 입력하세요.");
		System.out.print("입력: ");
		String clientName = scan.next();

		for(int i=0; i<clientRepo.clientList.size(); i++) {
			if (clientName.equals(clientRepo.clientList.get(i).getClientName())) {
				client = i;
				getClientInformation();
				break;
			}
		}
	}


	public void getClientInformation() {
		System.out.println("\n선택하신 고객의 정보입니다. ");
		System.out.println("\n이름\t고객코드\t연체료");
		System.out.println("---------------------");
		System.out.println(clientRepo.clientList.get(client));
		if (clientRepo.clientList.get(client).getLateFee() == 0) {
			inputVideoCode();

		}

		else {
			getLateFee();
		}

	}

	public void getLateFee() {
		System.out.println("\n고객님의 연체료는 " + clientRepo.clientList.get(client).getLateFee() + "원입니다. ");
		System.out.println("연체료를 결제하시겠습니까? ");
		System.out.println("1.예\t2.아니오");
		System.out.print("입력: ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("\n연체료가 결제되었습니다. ");
			inputVideoCode();
		}
		if (choice == 2) {
			System.out.println("\n비디오 대여가 불가능합니다. ");
		}

	}

	public void inputVideoCode() {
		System.out.println("\n대여 가능한 비디오 목록입니다.\n");
		videoRepo.getVideoList();
		System.out.println("\n대여해줄 비디오 코드를 입력하세요. ");
		System.out.print("입력: ");
		long inputVideoCode = scan.nextLong();
		for (int i=0; i<videoRepo.videoList.size(); i++) {
			if ((long)inputVideoCode == videoRepo.videoList.get(i).getVideoCode()) {			
				System.out.println(videoRepo.videoList.get(i).getVideoName() + " 비디오 대여가 완료되었습니다. ");
				clientRepo.clientVideoList.add(videoRepo.videoList.get(0));
			}
		}


	}


}
