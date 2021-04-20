import java.util.Scanner;

/**
 * packages from the Java that are to be used
 */

/**
 * DISCLAIMER: This work or any that might look like this one is a replica of our work.
 * This note is to avoid the cancellation of our work due to duplication
 * * @author FREDRICK WAMPAMBA 		18/U/ETD/10056/PD
 * * @author MARK LUWAGA 			18/U/ETD/183/GV
 * * @author SHARON AKAO 			18/U/ETD/10120/PD
 * * @author REBECCA NABAGESERA 	18/U/ETD/176/GV
 * * @author LORNA MARIA ABIGABA 	18/U/ETD/10077/PD
 * * @author EMMANUEL EKIRAPA 		18/U/ETD/178/GV
 * * @author RASHID SSEMPIJJA 		19/U/ETD/17722/PD
 * * @author EVA NAMBASA 			18/U/ETE/10157/PE
 */
public class Stage2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //creating of the object for the Scanner class 
		
		int no_of_students = 2;
		System.out.println("Enter marks for only (2) two students"); //displaying message to the java console
		String full_name[] = new String[no_of_students];	//creating an array of strings to store the students' names
		float[][] marks = new float[no_of_students][4];		//creating an array of floats to store the students' marks
		
		for(int i = 0; i < no_of_students; i++) { //first iteration for one student details
			System.out.println("Enter Student "+(i+1)+": Full Name:");
			full_name[i] = input.next(); //prompting user input
			for(int a = 0; a < 4; a++) { //second or nested for loop to attain the marks for all the students.
				System.out.println("Enter Mark"+(a+1)+":"); //displaying marks
				marks[i][a] = input.nextFloat(); //prompting user input
			}
		}
		
		student student1 = new student(full_name[0], 0, 0, marks[0]); //creating an object of the student class (Invoking of the constructor)
		student1.calcAverage(); // accessing the calcAverage function to calculate the average
		student1.totalAggregates(); //accessing the total aggregates function to calculate total aggregates
		student1.printReport(); //accessing the printReport function to print the students report
		
		student student2 = new student(full_name[1], 0, 0, marks[1]); //creating an object of the student class (Invoking of the constructor)
		student2.calcAverage();	// accessing the calcAverage function to calculate the average
		student2.totalAggregates();//accessing the total aggregates function to calculate total aggregates
		student2.printReport();//accessing the printReport function to print the students report
		
		input.close(); //closing the object for the scanner class
	}

}
