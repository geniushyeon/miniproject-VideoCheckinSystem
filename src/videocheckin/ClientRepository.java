package videocheckin;
import java.util.List;
import java.util.ArrayList;

public class ClientRepository {

	List<Client> clientList = new ArrayList<>();
	List<VideoInformation> clientVideoList = new ArrayList<>();
	
	Client client = new Client();
	VideoRepository clientVideoRepo = new VideoRepository();
	
	public ClientRepository() {
		setClientList();
		
	}
	
	public void setClientList() {
		client.setClientName("이지현");
		client.setClientCode(1);
		client.setLateFee(0);
		clientList.add(client);

		client.setClientName("윤소인");
		client.setClientCode(2);
		client.setLateFee(1000);
		clientList.add(client);	
	
	}
	
	public void setClientVideoList() {
		
		
	}
	
	public void getClientList() {
		for (int i=0; i<clientList.size(); i++) {
			System.out.println(clientList.get(i));
		}
	}
	
	
	
	
	
}
