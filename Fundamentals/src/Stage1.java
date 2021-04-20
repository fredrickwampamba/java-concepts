/**
 *  * packages from the Java that are to be used
 */
import java.util.Scanner; // importing the Scanner inbuilt package into the project
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
public class Stage1 {

	/**
	 * @param stud_Mark(float)
	 * returns grade(String)
	 * static --- can be accessed without having an instance of the class
	 */
	
	public static String grading(float stud_Mark) {
		String assigned_grade;							//variable declaration to hold grade
		if(stud_Mark >= 80 && stud_Mark <= 100) {		// range 80 - 100
			assigned_grade = "A";
		}else if(stud_Mark >= 75 && stud_Mark < 80) {	// range 75 - 80
			assigned_grade = "B+";
		}else if(stud_Mark >= 70 && stud_Mark < 75) {	// range 70 - 74
			assigned_grade = "B";
		}else if(stud_Mark >= 65 && stud_Mark < 70) {	// range 65 - 70
			assigned_grade = "C+";
		}else if(stud_Mark >= 60 && stud_Mark < 65) {	// range 60 - 64
			assigned_grade = "C+";
		}else if(stud_Mark >= 55 && stud_Mark < 60) {	// range 55 - 59
			assigned_grade = "D+";
		}else if(stud_Mark >= 50 && stud_Mark < 55) {	// range 50 - 55
			assigned_grade = "D";
		}else if(stud_Mark >= 0 && stud_Mark < 50) {	// range 0 - 50
			assigned_grade = "F";
		}else {											//for any mark out of range of 0 - 100
			assigned_grade ="X";
		}
		return assigned_grade; //returning the grade 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);			//creating object from the Scanner class
		
		System.out.println("Enter the number of students"); //Displaying message
		int no_of_students = input.nextInt();				//prompting user for input using scanner object created
		
		String first_name[] = new String[no_of_students];	//creating array of objects of the String class
		String last_name[] = new String[no_of_students];	//creating array of objects of the String class
		float marks[] = new float[no_of_students];			//creating array of objects of the float class
		
		for(int i = 0; i < no_of_students; i++) {
			System.out.println("Enter Student "+(i+1)+" First Name:");		//Displaying message
			first_name[i] = input.next();									//prompting user input
			System.out.println("Enter Student "+(i+1)+" Last Name:");		//displaying message
			last_name[i] = input.next();									//prompting user input
			System.out.println("Enter Student "+(i+1)+" marks:");			//displaying message 
			marks[i] = input.nextFloat();									//prompting user input
		}
		
		input.close();														//closing the Scanner class object
		
		Object[][] table = new String[no_of_students+1][];					//creating object to store an array of strings
		table[0] = new String[] {"Number", "First Name", "Last Name", "Mark", "Grade"}; // to be used as heading for the marks (pushing into the array)
		
		for(int b = 0; b < no_of_students; b++) {		//for loop iterations
			int a = b+1;
			table[a] = new String[] {Float.toString(a), first_name[b], last_name[b], Float.toString(marks[b]), grading(marks[b])}; //populating the array with marks and other details
		}
		
		for (Object[] row : table) {		//iteration to display marks from the created array
			System.out.format("%-15s%-15s%-15s%-15s%-15s%n", row); //displaying marks, printing them using format function in the system.out class
		}
		
		double sum = 0.0d, standardDeviation = 0.0d;		//variables for sum and standard deviation
		int length = marks.length;							//getting number of elements in the array
		
		for(double num : marks) {							//for each loop to calculate the array sum
			sum += num;
		}
		
		double mean = sum/length;							//calculation for mean marks.
		
		System.out.println("The Mean of the marks: "+ mean);	//printing the mean marks
		
		for(double num : marks) {							//for each loop to do some part of the standard deviation
			standardDeviation += Math.pow(num-mean, 2);
		}
		
		System.out.println("The Standard Deviation of the marks: "+ Math.sqrt(standardDeviation/length)); // calculating and printing out the standard deviation
	}
}
