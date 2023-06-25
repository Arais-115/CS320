import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//Test for new Contact
class ContactTest {
    @Test 
    public void testId() { 
    	 Contact contact = new Contact("C10", "Barthemlow", "Smashing", "5554443333", "8765 Smashing Ln");
    	    assertAll(
    	        "ID test",
    	        ()
    	            -> assertEquals("C10", contact.getContactID()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updatecontactID(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updatecontactID("1234567891011")));
    	    }
 
     @Test 
     public void testFirstName() {  	 
    	 Contact contact = new Contact("C10", "Barthemlow", "Smashing", "5554443333", "8765 Smashing Ln");
    	    assertAll(
    	        "First name test",
    	        ()
    	            -> assertEquals("Barthemlow", contact.getFirstName()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updateFirstName(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updateFirstName("1234567891011")));
    	    }
     

     @Test 
     public void testLastName() {
    	 Contact contact = new Contact("C10", "Barthemlow", "Smashing", "5554443333", "8765 Smashing Ln");
 	    assertAll(
    	        "Last name test",
    	        ()
    	            -> assertEquals("Smashing", contact.getLastName()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updateLastName(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updateLastName("1234567891011")));
    	    }
    
     
     @Test 
     public void testAddress() { 	 
    	 Contact contact = new Contact("C10", "Barthemlow", "Smashing", "5554443333", "8765 Smashing Ln");
 	    assertAll(
    	        "Address test",
    	        ()
    	            -> assertEquals("8765 Smashing Ln", contact.getnumberAddress()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updatenumberAddress(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updatenumberAddress("123456789101112131415461718192021222324252627282930")));
    	    }
     
     @Test 
    public void testPhoneNumber() {  
    	Contact contact = new Contact("C10", "Barthemlow", "Smashing", "5554443333", "8765 Smashing Ln");
 	    assertAll(
    	        "Phone number test",
    	        ()
    	            -> assertEquals("5554443333", contact.getnumberPhone()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updatenumberPhone(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> contact.updatenumberPhone("1234567891011")));
    	    }
    

}