
public class BuddyInfo {

	private int num;
	private String name;
	private String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");

		//BuddyInfo b = new BuddyInfo();

		//b.setName("Jim");
		//System.out.println(b.getName());

	}

	public BuddyInfo(String name, int num, String address) {

		this.name = name;
		this.num = num;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
