import java.util.ArrayList;

public class ContactService {
	// Contact list
	private ArrayList<Contact> contacts;

	// Constructor
	public ContactService() 
	{
		contacts = new ArrayList<>();
	}

	public boolean add(Contact contact) 
	{
		//Check for existing Contact
		boolean existing = false;
		for (Contact c : contacts) 
		{
			if (c.equals(contact)) 
			{
				existing = true;
			}
		}
		//Add if non-existing
		if (!existing) 
		{
			contacts.add(contact);
			System.out.println("Contact Added.");
			return true;
		} else 
		{
			System.out.println("Contact already present.");
			return false;
		}
	}

	//Remove method
	public boolean remove(String contactID) 
	{
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) 
			{
				contacts.remove(c);
				System.out.println("Contact removed.");
				return true;
			}
		}
		System.out.println("Contact not present.");
		return false;
	}

	//Update existing contact method
	public boolean update(String contactID, String firstName, String lastName, String numberPhone, String numberAddress) 
	{
		for (Contact c : contacts) {
			
			if (c.getContactID().equals(contactID)) 
			{
				
				if (!firstName.equals(""))
					c.updateFirstName(firstName);
				
				if (!lastName.equals(""))
					c.updateLastName(lastName);
				
				if (!numberPhone.equals(""))
					c.updatenumberPhone(numberPhone);
				
				if (!numberAddress.equals(""))
					c.updatenumberAddress(numberAddress);
				
				System.out.println("Contact updated.");
				return true;
			}
		}
		
		System.out.println("No matching contact.");
		return false;
	}

}