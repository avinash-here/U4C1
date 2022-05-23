package Pro_2;

import java.util.*;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	
	void displayCourseDetails() {
		System.out.println("Course ID : "+ this.courseId);
		System.out.println("Course Name : "+ this.courseName);
		System.out.println("Course Fee : "+ this.courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username == "Admin" && password == "1234") {
			Course c1 = new Course();			
			
			Scanner sc = new Scanner(System.in);			
			
			System.out.println("Enter Course ID");
			c1.courseId = sc.nextInt();
			System.out.println("Enter Course Name");
			c1.courseName = sc.next();
			System.out.println("Enter Course Fee");
			c1.courseFee = sc.nextInt();			
			
			sc.close();
			
			c1.displayCourseDetails();			
			
		}
		else
		{
			System.out.println("Invalid Username or Password!");
		}
	}
	
	public static void main(String[] args) {
		
		Course.authenticate("Admin", "1234");
		System.out.println("");
		System.out.println("<====================>");
		System.out.println("");
		Course.authenticate("Admin", "12345");
		
	}

}
