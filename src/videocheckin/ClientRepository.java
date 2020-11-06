package videocheckin;
import java.util.List;
import java.util.ArrayList;

public class ClientRepository {

	List<Client> clientList = new ArrayList<>();
	List<VideoInformation> clientVideoList = new ArrayList<>();

	//	Client client = new Client();
	VideoRepository clientVideoRepo = new VideoRepository();

	public ClientRepository() {
		setClientList();

	}

	public void setClientList() {
		clientList.add(0, new Client("이지현", 1, 1000));
		clientList.add(1, new Client("이수현", 2, 0));

	}

}



