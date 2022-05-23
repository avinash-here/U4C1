package Pro_4;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students you want to add");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter Roll");
			int roll1 = sc.nextInt();			
			System.out.println("Enter Name");
			String name1 = sc.next();
			System.out.println("Enter Marks");
			int marks1 = sc.nextInt();
			
			Student s1 = new Student(roll1, name1, marks1);			
			
			System.out.println("Student "+ i + " Details :");
			System.out.println("Name : "+ name1);
			System.out.println("Roll : "+ roll1);
			System.out.println("Marks : "+ marks1);
			
			System.out.println("<=======================>");
		}
		
		sc.close();
		
		
		
	}

}
