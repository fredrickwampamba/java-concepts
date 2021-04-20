import java.util.InputMismatchException;
import java.util.Scanner;
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
public class Stage3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creating object of the scanner class
		int no_of_students, d =0;
		try { //try block to try a code that may lead to an exception
			do { //do while loop to attempt 
				System.out.println("Enter Number of Students");
				no_of_students = input.nextInt();
			}while(no_of_students < 0); //while function to validate the do while loop
		}catch(InputMismatchException e) { // catch block to catch InputMismatchEsception
			System.out.println("Invalid Entry, please enter a positive number(Integer)");
			no_of_students = input.nextInt(); // user input prompting to get user input
		}
		
		seniorStudent obj[] = new seniorStudent[no_of_students]; // creating an arrays from the seniorStudent class
		student obj1[] = new student[no_of_students];
		for(int i = 0; i < no_of_students; i++) { //for loop to get student marks, details and class
			obj[i] = new seniorStudent(); // creating an object and storing it in an array at a fixed index
			
			System.out.println("Enter "+(i+1)+" Student Name");
			String student_name;
			try { //try block to get the student name
				student_name = input.next();
			}catch(InputMismatchException e) {
				System.out.println("Enter "+(i+1)+" Student Name");
				student_name = input.next();
			}
			
			System.out.println("Enter "+(i+1)+" Student Index No.");
			String index_number;
			try { //try block to get the student name
				index_number = input.next();
			}catch(InputMismatchException e) {
				System.out.println("Enter "+(i+1)+" Student Name");
				index_number = input.next();
			}
			
			int class_name;
			try { // try block to get the class_name
				do {
					System.out.println("Enter the Student Class: ie 1 , 2 , 3 ...");
					class_name = input.nextInt();
				}while(class_name < 1);
			}catch(InputMismatchException e) {
				System.out.println("Invalid Entry, please enter a number(Integer) ie 1 , 2 , 3 ...");
				class_name = input.nextInt();
			}
			
			obj[i].getdetails(student_name,class_name, index_number);
			
			if(obj[i].getClassName() >4 && obj[i].getClassName() < 8) {
				float eng[] = new float[4]; // creating an array of objects to store english marks
				try { // try block to get spelling marks
					do {
						System.out.println("Enter spelling marks");
						eng[0] = input.nextFloat();
					}while(!(eng[0] >= 0 && eng[0] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					eng[0] = input.nextFloat();
				}
				
				try { // try block to get grammar marks
					do {
						System.out.println("Enter Grammar marks");
						eng[1] = input.nextFloat();
					}while(!(eng[1] >= 0 && eng[1] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					eng[1] = input.nextFloat();
				}
				
				try { //try block to get poetry marks
					do {
						System.out.println("Enter Poetry marks");
						eng[2] = input.nextFloat();
					}while(!(eng[2] >= 0 && eng[2] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					eng[2] = input.nextFloat();
				}
				
				obj[i].englishMarks(eng); //accessing the englishMarks method from the senior student class to get english marks
				
				float sstMa[] = new float[4]; // creating a variable to store an array of float marks for sst
				
				try { //try block to get history marks
					do {
						System.out.println("Enter History marks");
						sstMa[0] = input.nextFloat();
					}while(!(sstMa[0] >= 0 && sstMa[0] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					sstMa[0] = input.nextFloat();
				}
				
				try { // try block to get civics marks
					do {
						System.out.println("Enter Civics marks");
						sstMa[1] = input.nextFloat();
					}while(!(sstMa[1] >= 0 && sstMa[1] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					sstMa[1] = input.nextFloat();
				}
				
				try {//try block to get geography marks
					do { 
						System.out.println("Enter Geography marks");
						sstMa[2] = input.nextFloat();
					}while(!(sstMa[2] >= 0 && sstMa[2] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					sstMa[2] = input.nextFloat();
				}
				
				obj[i].sstMarks(sstMa); // accessing the sstMarks method from the senior student class and passing sst marks to the method as an array
				
				float scie[] = new float[4]; // creating an array of float variables to store science marks
				
				try { //try block to get biology marks
					do {
						System.out.println("Enter Biology marks");
						scie[0] = input.nextFloat();
					}while(!(scie[0] >= 0 && scie[0] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					scie[0] = input.nextFloat();
				}
				
				try { // try block to get physics marks
					do {
						System.out.println("Enter Physics marks");
						scie[1] = input.nextFloat();
					}while(!(scie[1] >= 0 && scie[1] <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					scie[1] = input.nextFloat();
				}
				obj[i].scienceMarks(scie); // accessing scienceMarks method and passing an array of science marks (float type)
				
				float mathMark; // Variable declaration to hold math marks
				try { // try block to get math marks
					do {
						System.out.println("Enter Mathematics marks");
						mathMark = input.nextFloat();
					}while(!(mathMark >= 0 && mathMark <= 100));
				}catch(InputMismatchException e) {
					System.out.println("Invalid Entry, please enter a number between 0 - 100");
					mathMark = input.nextFloat();
				}
				obj[i].mathMarks(mathMark);// accessing mathMarks method
			}else {
				float[] marks = new float[4];		//creating an array of floats to store the students' marks
				
				for(int g = 0; g < 4; g++) { //second or nested for loop to attain the marks for all the students.
					try { // try block to get for each marks
						do {
							System.out.println("Enter mark "+(g+1));
							marks[g] = input.nextFloat();
						}while(!(marks[g] >= 0 && marks[g] <= 100));
					}catch(InputMismatchException e) {
						System.out.println("Invalid Entry, please enter a number between 0 - 100");
						marks[g] = input.nextFloat();
					}
				}
				obj1[d] = new student(student_name, class_name, 0, 0, marks,index_number);
				obj1[d].calcAverage(); // accessing the calcAverage function to calculate the average
				obj1[d].totalAggregates(); //accessing the total aggregates function to calculate total aggregates
				d += 1;
			}
		}
		
		int counter = 0;
		for(int i = 0; i < no_of_students; i++) {
			if(!(obj[i].getClassName() < 5)) { // only p5 and above or senior students get report cards.
				obj[i].printReport(); // accessing the method using the object, it is used to make a report card.
			}else {
				obj1[counter].printReport();
				counter +=1;
			}
		}
		input.close(); // closing the scanner class object to utilize memory
	}

}