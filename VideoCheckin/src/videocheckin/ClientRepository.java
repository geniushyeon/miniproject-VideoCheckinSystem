package videocheckin;
import java.util.List;
import java.util.ArrayList;

public class ClientRepository {

	List<Client> clientList = new ArrayList<>();
	List<VideoInformation> clientVideoList = new ArrayList<>();

	VideoRepository clientVideoRepo = new VideoRepository();

	public ClientRepository() {
		setClientList();

	}

	public void setClientList() {
		clientList.add(0, new Client("이지현", 1, 1000));
		clientList.add(1, new Client("이수현", 2, 0));

	}
	
	public void getClientList() {
		System.out.println("\n이름\t고객코드\t연체료");
		System.out.println("---------------------");
		for(Client clientlist : clientList) {
			System.out.println(clientlist);
		}
	}

}



