public class Contact 
{

	// Variables 
	private String contactID;
	private String firstName;
	private String lastName;
	private String numberPhone;
	private String numberAddress;

	// Constructor 
	public Contact(String contactID, String firstName, String lastName, String numberPhone, String numberAddress) 
	{
	    updatecontactID(contactID);
	    updateFirstName(firstName);
	    updateLastName(lastName);
	    updatenumberAddress(numberAddress);
	    updatenumberPhone(numberPhone);
	}

	//Setters
	public void updatecontactID(String contactID)
	{
		  if (contactID == null || contactID.length()>10) { 
	            throw new IllegalArgumentException("Invalid ID"); 
		  }
		  else 
			  this.contactID = contactID;
	}
	
	public void updateFirstName(String firstName) {
		if (firstName == null || firstName.length()>10) { 
            throw new IllegalArgumentException("Invalid first name"); 
	  }
	  else 
		this.firstName = firstName;
	}

	public void updateLastName(String lastName) {
		if (lastName == null || lastName.length()>10) { 
            throw new IllegalArgumentException("Invalid last name"); 
	  }
	  else 
		this.lastName = lastName;
	}
	public void updatenumberAddress(String numberAddress) {
		if (numberAddress == null || numberAddress.length()>50) { 
            throw new IllegalArgumentException("Invalid address."); 
	  }
	  else 
		this.numberAddress = numberAddress;
	}

	public void updatenumberPhone(String numberPhone) {
		if (numberPhone == null || numberPhone.length()!=10) { 
            throw new IllegalArgumentException("Invalid phone number."); 
	  }
	  else 
		this.numberPhone = numberPhone;
	}
	
	

	//Getters
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getnumberPhone() {
		return numberPhone;
	}

	public String getnumberAddress() {
		return numberAddress;
	}
	  
	 
}
	
	
	