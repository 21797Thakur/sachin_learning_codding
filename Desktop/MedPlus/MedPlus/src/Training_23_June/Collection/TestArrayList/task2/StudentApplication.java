package Training_23_June.Collection.TestArrayList.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Training_23_June.Collection.TestArrayList.Task1.Employee;

public class StudentApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stList = new ArrayList<Student>();
		stList.add(new Student(1238, "Sachin", "CS", 45, 67, 34));
		stList.add(new Student(12, "Sultan", "Mechanical", 45, 67, 34));
		stList.add(new Student(136, "Sagar", "electric", 25, 27, 24));
		stList.add(new Student(1237, "Vijay", "Mca", 45, 67, 34));
		stList.add(new Student(1238, "Pranshu", "civil", 35, 17, 24));
//	System.out.println("enter the RegNo");
//	int regNo =sc.nextInt();
		// lamda expration
//	stList.forEach((student)-> {
//		if(regNo == student.getRegNumber())
//		{
//		System.out.println("---------Result of " +student.getStudentName()+"------------");
//		int total =student.getSub1() +student.getSub2() +student.getSub3();
//		System.out.println("Total marks: " + total);
//		System.out.println("Average " + total/3);
//		if(total/3 >35)
//			System.out.println("Student is passed");
//		else
//			System.out.println("Student is failed");
//		System.exit(0);
//		}
//	}
//	);
//	System.out.println("Registration not available");
		System.out.println("\n ---------Enter your coice for sorting---------");
		int n = 0;
		while (n != 5) {
			System.out.println("1. Sort by student ID");
			System.out.println("2. Sort by Student name");
			System.out.println("3. Sort by student branch");
			System.out.println("4. Unsorted Student Data");
			System.out.println("5. exit");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("1. Ascending");
				System.out.println("2. Descending");
				int i = sc.nextInt();
				switch (1) {
				case 1: {
					Collections.sort(stList, (e1, e2) -> {
						return e1.getRegNumber() - e2.getRegNumber();
					});
				}
				break;
				case 2:{
					Collections.sort(stList, (e1, e2) -> {
						return e1.getRegNumber() - e2.getRegNumber();
					});
					
					
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + 1);
				}
				

			}
				break;
			case 2: {
				Collections.sort(stList, (e1, e2) -> {
					return e1.getStudentName().compareTo(e2.getStudentName());
				});
			}
				break;
			case 3: {
				Collections.sort(stList, (e1, e2) -> {
					return e1.getGroup().compareTo(e2.getGroup());
				});

			}
				break;
			case 4: {
				for (Student st : stList) {
					System.out.println(st.getRegNumber() + " " + st.getStudentName() + " " + st.getGroup());
				}
				break;
			}
			default:
				throw new IllegalArgumentException("invalid choice");
			}
			for (Student st : stList) {
				System.out.println(st.getRegNumber() + " " + st.getStudentName() + " " + st.getGroup());
			}
		}
	}
}
