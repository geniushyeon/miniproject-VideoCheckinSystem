package videocheckin;

public class Client {
	
	private String clientName;
	private long clientCode;
	private long lateFee;
	
	public Client() {
		
	}
	
	public Client(String clientName, long clientCode, long lateFee) {
		this.clientName = clientName;
		this.clientCode = clientCode;
		this.lateFee = lateFee;
	}
	

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public long getClientCode() {
		return clientCode;
	}

	public void setClientCode(long clientCode) {
		this.clientCode = clientCode;
	}

	public long getLateFee() {
		return lateFee;
	}

	public void setLateFee(long lateFee) {
		this.lateFee = lateFee;
	}

	@Override
	public String toString() {
		return  clientName + "\t" + clientCode + "\t" + lateFee + "원";
	}
	
	
	
	
}
