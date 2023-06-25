import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class AppointmentService {
  private ArrayList<Appointment> appts;

	public AppointmentService() 
	{
		appts = new ArrayList<>();
	}
	
public boolean addAppointment(Appointment appt) {
	  //Check for existing Appointment
	  		boolean existing = false;
	  		for (Appointment a : appts) 
	  		{
	  			if (a.equals(appt)) 
	  			{
	  				existing = true;
	  			}
	  		}
	  		//Add if non-existing
	  		if (!existing) 
	  		{
	  			appts.add(appt);
	  			System.out.println("Appointment Added.");
	  			return true;
	  		} else 
	  		{
	  			System.out.println("Appointment already present.");
	  			return false;
	  		}
}

  
//Remove method
	public boolean removeAppointment(String appointmentID) 
	{
		for (Appointment a : appts)  
		{
			if (a.getAppointmentID().equals(appointmentID)) 
			{
				appts.remove(a);
				System.out.println("Appointment removed.");
				return true;
			}
		}
		System.out.println("Appointment not present.");
		return false;
	}
}
  


