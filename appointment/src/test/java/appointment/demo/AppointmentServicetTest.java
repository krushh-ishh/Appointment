package appointment.demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.poc.appointment.controller.business.AppointmentService;
import com.poc.appointment.entity.Appointment;


public class AppointmentServicetTest {
	
	public AppointmentService appointmentService = new AppointmentService();
	public Appointment  appointment1 = new Appointment(115, "John", "23-Mar-2023", "11:00","XYZ");
	public Appointment  appointment12 = new Appointment(116, "abc", "23-Mar-2023", "11:00","XYZ");

	  @Test
	  @DisplayName("Appointment added successfully")
	  void addAppointmentTest(){
	       int expectedLength = appointmentService.appointments.size() + 1;
	       appointmentService.addAppointment(appointment1);
	       int actualLength = appointmentService.appointments.size();
	       assertEquals(expectedLength, actualLength);
	  }
	  
	  @Test
	  @DisplayName("Appointment added successfully")
	  void addAppointmentTest2(){
	      
	       assertEquals("Successfull", appointmentService.addAppointment(appointment1));
	  }
	  
	  @Test
	  @DisplayName("List of all appointments")
	  void getAllAppointmentTest(){
		  int expectedLength = appointmentService.appointments.size();
	       assertEquals(expectedLength, appointmentService.getAllAppointments().size());
	  }
	  
	  @Test
	  @DisplayName("Get appointment By Id")
	  void getAppointmentByIdTest(){
		  
		  appointmentService.addAppointment(appointment1);
	       assertEquals(appointment1, appointmentService.getAppointment(appointment1.getAppointmentId()));
	  }
	  
	  @Test
	  @DisplayName("Appointment Details updated successfully")
	  void updateAppointmentByIdTest(){
		  appointmentService.appointments.add(appointment1);
		  appointment1.setUserId("XYZZ");
		  Appointment actualAppointment = appointmentService.updateAppointment(appointment1,appointment1.getAppointmentId());
	       assertEquals(appointment1, actualAppointment);
	  }
	  
	  @Test
	  @DisplayName("Appointment doesnt found")
	  void updateAppointmentByIdTest2(){
		  appointmentService.appointments.add(appointment12);
		  appointment12.setUserId("XYZZ");
	       assertEquals(null, appointmentService.updateAppointment(appointment12, 117));
	  }


	  @Test
	  @DisplayName("Appointment deleted successfully")
	  void deleteAppointmentByIdTest2(){
		  appointmentService.appointments.add(appointment12);
		  Appointment actualaAppointment = appointmentService.deleteAppointment(appointment12.getAppointmentId());
		  long actual  = appointmentService.appointments.stream().filter(i->i.getAppointmentId()==appointment12.getAppointmentId()).count();
		  //System.out.println(actual);
		  assertEquals(0, actual);
		  
	  }
//	  @Test
//	  public void Test() {
//		  assertEquals(appointment1, appointment1);
//	  }
	//	
//	  @BeforeEach
//	    public void setUp() {
//		  expectedlist = new ArrayList<>();
//	    appointment1 = new Appointment(1, "John", "23-Mar-2023", "11:00","XYZ");
//	    appointment2 = new Appointment(2, "John", "23-Mar-2023", "11:00","XYZ");
//	    expectedlist.add(appointment1);
//	    expectedlist.add(appointment2);
//	    }
//	  
//	  @AfterEach
//	    public void tearDown() {
//	    appointment1 = appointment2 = null;
//	    expectedlist = null;
//	    }
//	  
//	  
//	  @Test
//	  public void GivenGetAllUsersShouldReturnListOfAllUsers(){
//	       productRepository.save(product1);
//	      //stubbing mock to return specific data
//	      when(productRepository.findAll()).thenReturn(productList);
//	      List<Product> productList1 =productService.getAllProducts();
//	      assertEquals(productList1,productList);
//	      verify(productRepository,times(1)).save(product1);
//	      verify(productRepository,times(1)).findAll();
//	  }
}

