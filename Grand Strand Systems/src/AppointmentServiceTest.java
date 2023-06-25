import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	Date currentDate=new Date();
		@Test
		public void testAddPass() 
		{
			AppointmentService as = new AppointmentService();
			Appointment a1 = new Appointment("001", currentDate, "Cleaning service has been performed");
			Appointment a2 = new Appointment("001", currentDate, "Document cleanup has been performed");
			assertEquals(true, as.addAppointment(a1));
			assertEquals(true, as.addAppointment(a2));
		}

		@Test
		public void testAddFail() 
		{
			AppointmentService as = new AppointmentService();
			Appointment a1 = new Appointment("002", currentDate, "Cleaning service has been performed");
			Appointment a2 = new Appointment("003", currentDate, "Document cleanup has been performed");
			Appointment a3 = new Appointment("003", currentDate, "Schedule has been adjusted");
			
			assertEquals(true, as.addAppointment(a1));
			assertEquals(true, as.addAppointment(a2));
			assertEquals(true, as.addAppointment(a3));
			assertEquals(false, as.addAppointment(a1));
		}

		@Test
		public void testDeletePass() 
		{
			AppointmentService as = new AppointmentService();
			Appointment a1 = new Appointment("002", currentDate, "Cleaning service has been performed");
			Appointment a2 = new Appointment("003", currentDate, "Document cleanup has been performed");
			Appointment a3 = new Appointment("003", currentDate, "Schedule has been adjusted");
		
			assertEquals(true, as.addAppointment(a1));
			assertEquals(true, as.addAppointment(a2));
			assertEquals(true, as.addAppointment(a3));
			assertEquals(true, as.removeAppointment("002"));
			assertEquals(true, as.removeAppointment("003"));
			
		}
		
		@Test
		public void testDeleteFail() 
		{
			AppointmentService as = new AppointmentService();
			Appointment a1 = new Appointment("002", currentDate, "Cleaning service has been performed");
			Appointment a2 = new Appointment("003", currentDate, "Document cleanup has been performed");
			Appointment a3 = new Appointment("003", currentDate, "Schedule has been adjusted");
		
			assertEquals(true, as.addAppointment(a1));
			assertEquals(true, as.addAppointment(a2));
			assertEquals(true, as.addAppointment(a3));
			
			assertEquals(true, as.removeAppointment("002"));
			assertEquals(false, as.removeAppointment("004"));
		}


	
		
	}


