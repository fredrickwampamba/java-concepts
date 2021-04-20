import java.util.InputMismatchException; //importation of the input mis match exception
import java.util.Scanner; // importation of the scanner class
import javax.swing.JFrame; // importation of the Jframe class for windowing
import javax.swing.JOptionPane; // importation of the JOptionPane class

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
public class Stage4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  //creating object from the scanner class
		int no_of_students, d = 0;
		try { // try block for getting the number of students
			do {
				no_of_students = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Students",1)); // displaying the swing JoptionPane and converting attained text to int
			}while(no_of_students < 0);
		}catch(InputMismatchException e) { // catch block in case the exception occurs
			no_of_students = Integer.parseInt(JOptionPane.showInputDialog("Invalid Entry, please enter a positive number(Integer)",1));
		}
		
		seniorStudent obj[] = new seniorStudent[no_of_students]; // creating an array of objects from the seniorStudent class
		student obj1[] = new student[no_of_students];// creating an array of objects from the student class
		for(int i = 0; i < no_of_students; i++) {
			obj[i] = new seniorStudent(); // populating the array with the objects
			
			String student_name;
			try { // try block for getting the student name
				student_name = JOptionPane.showInputDialog("Enter "+(i+1)+" Student Name","name"); // displaying the window from the swing joptionpane to get the student name
			}catch(InputMismatchException e) {
				student_name = JOptionPane.showInputDialog("Enter "+(i+1)+" Student Name","name");
			}
			
			String index_number;
			try {
				index_number = JOptionPane.showInputDialog("Enter "+(i+1)+" Student Index No.","Index number");
			}catch(InputMismatchException e) {
				index_number = JOptionPane.showInputDialog("Enter "+(i+1)+" Student Name","Index Number");
			}
			
			int class_name;
			try {
				do {
					class_name = Integer.parseInt(JOptionPane.showInputDialog("Enter the Student Class: ie 1 , 2 , 3 ...",0));
				}while(class_name < 1);
			}catch(InputMismatchException e) {
				class_name = Integer.parseInt(JOptionPane.showInputDialog("Invalid Entry, please enter a number(Integer) ie 1 , 2 , 3 ...",0));
			}
			
			obj[i].getdetails(student_name,class_name,index_number);
			
			if(obj[i].getClassName() >4 && obj[i].getClassName() < 8) { // if P5 and above, enter such marks
				float eng[] = new float[4];
				try {
					do {
						eng[0] = Float.parseFloat(JOptionPane.showInputDialog("Enter spelling marks",0));
					}while(!(eng[0] >= 0 && eng[0] <= 100));
				}catch(InputMismatchException e) {
					eng[0] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				try {
					do {
						eng[1] = Float.parseFloat(JOptionPane.showInputDialog("Enter Grammar marks",0));
					}while(!(eng[1] >= 0 && eng[1] <= 100));
				}catch(InputMismatchException e) {
					eng[1] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				try {
					do {
						eng[2] = Float.parseFloat(JOptionPane.showInputDialog("Enter Poetry marks",0));
					}while(!(eng[2] >= 0 && eng[2] <= 100));
				}catch(InputMismatchException e) {
					eng[2] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				obj[i].englishMarks(eng);
				
				float sstMa[] = new float[4];
				
				try {
					do {
						sstMa[0] = Float.parseFloat(JOptionPane.showInputDialog("Enter History marks",0));
					}while(!(sstMa[0] >= 0 && sstMa[0] <= 100));
				}catch(InputMismatchException e) {
					sstMa[0] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				try {
					do {
						sstMa[1] = Float.parseFloat(JOptionPane.showInputDialog("Enter Civics marks",0));
					}while(!(sstMa[1] >= 0 && sstMa[1] <= 100));
				}catch(InputMismatchException e) {
					sstMa[1] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				try {
					do {
						sstMa[2] = Float.parseFloat(JOptionPane.showInputDialog("Enter Geography marks",0));
					}while(!(sstMa[2] >= 0 && sstMa[2] <= 100));
				}catch(InputMismatchException e) {
					sstMa[2] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				obj[i].sstMarks(sstMa);
				
				float scie[] = new float[4];
				
				try {
					do {
						scie[0] = Float.parseFloat(JOptionPane.showInputDialog("Enter Biology marks",0));
					}while(!(scie[0] >= 0 && scie[0] <= 100));
				}catch(InputMismatchException e) {
					scie[0] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				
				try {
					do {
						scie[1] = Float.parseFloat(JOptionPane.showInputDialog("Enter Physics marks",0));
					}while(!(scie[1] >= 0 && scie[1] <= 100));
				}catch(InputMismatchException e) {
					scie[1] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				obj[i].scienceMarks(scie);
				
				float mathMark;
				try {
					do {
						mathMark = Float.parseFloat(JOptionPane.showInputDialog("Enter Mathematics marks",0));
					}while(!(mathMark >= 0 && mathMark <= 100));
				}catch(InputMismatchException e) {
					mathMark = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, please enter a number between 0 - 100",0));
				}
				obj[i].mathMarks(mathMark);
			}else { //if below P5
				float[] marks = new float[4];		//creating an array of floats to store the students' marks
				
				for(int g = 0; g < 4; g++) { //second or nested for loop to attain the marks for all the students.
					try { // try block to get for each marks
						do {
							marks[g] = Float.parseFloat(JOptionPane.showInputDialog("Enter mark "+(g+1),0));
						}while(!(marks[g] >= 0 && marks[g] <= 100));
					}catch(InputMismatchException e) {
						System.out.println("Invalid Entry, please enter a number between 0 - 100");
						marks[g] = Float.parseFloat(JOptionPane.showInputDialog("Invalid Entry, Enter mark "+(g+1),0));
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
			if(!(obj[i].getClassName() < 5)) {
				JOptionPane.showMessageDialog(new JFrame(), ((seniorStudent) obj[i]).getReportMessage()); // getting the message in case of senior student and printing it in the JoptionPane window
			}else {
				JOptionPane.showMessageDialog(new JFrame(), ((student) obj1[counter]).getReportMessage()); // getting the message in case of student and printing it in the JoptionPane window
				counter +=1;
			}
		}
		input.close(); // closing the scanner object to free and save memory

	}

}
