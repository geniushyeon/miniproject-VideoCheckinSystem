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
		while(true) {
			System.out.println("\n원하시는 메뉴를 선택하세요. ");
			System.out.println("1. 회원 관리\t2. 비디오 관리\t3. 시스템 종료");
			System.out.print("입력: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				memberAdministration();
				break;
			case 2:
				videoAdministration();
				break;
			case 3: {
				System.out.println("\n시스템을 종료합니다. ");
				break;

			}
			}
			if (choice == 3)
				break;
		}
	}
	private void memberAdministration() {
		System.out.println("\n회원 관리 메뉴입니다. ");
		System.out.println("1. 회원 검색\t2. 회원 목록 보기");
		System.out.print("입력: ");
		int choice = scan.nextInt();
		if (choice == 1)
			searchMember();
		if (choice == 2)
			clientRepo.getClientList();
	}

	private void videoAdministration() {
		System.out.println("\n매장의 비디오 목록입니다. ");
		videoRepo.getVideoList();
	}

	private void searchMember() {
		System.out.println("\n회원의 이름을 입력하세요.");
		System.out.print("입력: ");
		String clientName = scan.next();

		for(int i=0; i<clientRepo.clientList.size(); i++) {
			if (clientName.equals(clientRepo.clientList.get(i).getClientName())) {
				client = i;
				getMemberInformation();
				break;
			}
		}
	}


	private void getMemberInformation() {
		System.out.println("\n검색하신 회원의 정보입니다. ");
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

	private void getLateFee() {
		System.out.println("\n회원님의 연체료는 " + clientRepo.clientList.get(client).getLateFee() + "원입니다. ");
		System.out.println("연체료를 결제하시겠습니까? ");
		System.out.println("1.예\t2.아니오");
		System.out.print("입력: ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("\n연체료가 결제되었습니다. ");
			System.out.println("비디오 대여가 가능합니다. ");
			clientRepo.clientList.get(client).setLateFee(0);
		}
		if (choice == 2) {
			System.out.println("\n비디오 대여가 불가능합니다. ");
		}

	}
	

	private void inputVideoCode() {
		System.out.println("\n매장의 비디오 목록입니다.\n");
		videoRepo.getVideoList();
		System.out.println("\n대여해줄 비디오 코드를 입력하세요. ");
		System.out.print("입력(취소는 0): ");
		long inputVideoCode = scan.nextLong();
		for (int i=0; i<videoRepo.videoList.size(); i++) {
			if ((long)inputVideoCode == videoRepo.videoList.get(i).getVideoCode()) {			
				System.out.println(videoRepo.videoList.get(i).getVideoName() + " 비디오 대여가 완료되었습니다. ");
				clientRepo.clientVideoList.add(videoRepo.videoList.get(0)); //수정요망
				videoRepo.videoList.get(i).setWhether("대여중");
			}
		}
		
		if (inputVideoCode == 0) {
			System.out.println("비디오를 대여하지 않았습니다. ");
		}

	}

}
