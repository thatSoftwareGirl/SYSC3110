import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddies;

	public AddressBook() {
		buddies = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo buddy) {
		buddies.add(buddy);
	}

	public void removeBuddy(int index) {
		if (index >= 0 && index < buddies.size()) {
			buddies.remove(index);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Address Book");
				BuddyInfo jimmy = new BuddyInfo("Jimmy", 12, "Carleton");
				AddressBook addressBook = new AddressBook();
				addressBook.addBuddy(jimmy);
				addressBook.removeBuddy(0);
	}

}

