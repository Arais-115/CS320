import java.util.Date;

public class Appointment {

  private String uniqueID;
  private String appointmentDescription;
  private Date appointmentDate;
 
  public Appointment(String id, Date date, String description) {
    updateAppointmentID(id);
    updateDate(date);
    updateDescription(description);
  }
  

//Setters
  public void updateDescription(String description) {
	    if (description == null|| description.length() > 50) {
	      throw new IllegalArgumentException("Invalid appointment description.");
	    } 
	    else {
	      this.appointmentDescription = description;
	    }
	  }
  
  public void updateAppointmentID(String id) 
  {
	if (id == null || id.length()>10)
	  throw new IllegalArgumentException("Invalid ID."); 
    else {
      this.uniqueID = id;
    }
  }


  public void updateDate(Date date) {
    if (date == null || date.before(new Date())) {
      throw new IllegalArgumentException("Invalid appointment date.");
    } 
    else {
      this.appointmentDate = date;
    }
  }

  //Getters
  public String getappointmentDescription() { 
	  return appointmentDescription; 
	  }
  public String getAppointmentID() { 
	  return uniqueID; 
	  }
  public Date getAppointmentDate() { 
	  return appointmentDate; 
	  }
}

