import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	//Test add 
	@Test
	public void testAddPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C1", "Reginald", "Furthing", "5555555555", "123 West St");
		Contact c2 = new Contact("C2", "Jim", "Jones", "4444444444", "321 East St");
		Contact c3 = new Contact("C3", "Alissa", "Basala", "3211233214", "North South St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}

	//Test add fail
	@Test
	public void testAddFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C1", "Reginald", "Furthing", "5555555555", "123 West St");
		Contact c2 = new Contact("C2", "Jim", "Jones", "4444444444", "321 East St");
		Contact c3 = new Contact("C3", "Alissa", "Basala", "3211233214", "North South St");
		
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c1));
		assertEquals(false, cs.add(c1));
		
	}

	//Test delete
	@Test
	public void testDeletePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C1", "Reginald", "Furthing", "5555555555", "123 West St");
		Contact c2 = new Contact("C2", "Jim", "Jones", "4444444444", "321 East St");
		Contact c3 = new Contact("C3", "Alissa", "Basala", "3211233214", "North South St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));

		assertEquals(true, cs.remove("C3"));
		assertEquals(true, cs.remove("C2"));
	}

	//Test delete fail
	@Test
	public void testDeleteFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C1", "Reginald", "Furthing", "5555555555", "123 West St");
		Contact c2 = new Contact("C2", "Jim", "Jones", "4444444444", "321 East St");
		Contact c3 = new Contact("C3", "Alissa", "Basala", "3211233214", "North South St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
		
		assertEquals(true, cs.remove("C2"));
		assertEquals(false, cs.remove("C4"));
	}

	//Test update
	@Test
	public void testUpdatePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C1", "Reginald", "Furthing", "5555555555", "123 West St");
		Contact c2 = new Contact("C2", "Jim", "Jones", "4444444444", "321 East St");
		Contact c3 = new Contact("C3", "Alissa", "Basala", "3211233214", "North South St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.update("C2", "Helissa", "Westward", "4566544565", "10000 East Blvd"));
		assertEquals(true, cs.update("C3", "Richard", "Richard", "9876543210", ""));
		
	}

	//Test update fail
	@Test
	public void testUpdateFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("C1", "Reginald", "Furthing", "5555555555", "123 West St");
		Contact c2 = new Contact("C2", "Jim", "Jones", "4444444444", "321 East St");
		Contact c3 = new Contact("C3", "Alissa", "Basala", "3211233214", "North South St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c3));
		assertEquals(true, cs.add(c2));
		
		assertEquals(true, cs.update("C2", "Helissa", "Westward", "4566544565", "10000 East Blvd"));
		assertEquals(true, cs.update("C3", "Richard", "Richard", "9876543210", ""));
	}

}