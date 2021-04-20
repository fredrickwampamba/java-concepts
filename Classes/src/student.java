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
/*class student definition*/
public class student {
	private String student_name;	//field for student_name
	private String index_number;	//field for index number (to be automatically generated when the constructor is invoked)
	private float marks[];			//field for marks (array)
	public float average_mark;		//average for the student
	public int total_aggregates;	//field for the total aggregates
	
	public student(String student_name, float average, int total_aggregate, float marks[]){		//constructor for the class Student
		this.student_name = student_name;		//initializing student name field
		this.marks = marks;						//initializing array for the marks field
		this.index_number = "18/U/"+Double.toString(Math.floor(Math.random()*100)); // initializing the index number, auto generation of the index number
	}
	
	public float calcAverage() { //function to calculate the average marks
		float sum = 0.0f;
		int length = marks.length;
		
		for(double num : marks) { //for each loop to compute the sum of the marks in an array
			sum += num;
		}
		return average_mark = sum/length;  //returning float of the average marks
	}
	
	public int totalAggregates() { // function to calculate the total aggregates
		this.total_aggregates = 0;
		for(int i = 0; i< marks.length; i++) {
			int gradeAgg = grading((int) marks[i]); // populating the aggregates array
			total_aggregates += gradeAgg;
		}
		return total_aggregates; //total aggregates returning (Int)
	}
	
	private int grading(int stud_Mark) {		//function to compute and return the grading scale
		int grade;
		if(stud_Mark > 80 && stud_Mark <= 100) {
			grade = 1;
		}else if(stud_Mark >= 75 && stud_Mark < 80) {
			grade = 2;
		}else if(stud_Mark >= 70 && stud_Mark < 75) {
			grade = 3;
		}else if(stud_Mark >= 60 && stud_Mark < 70) {
			grade = 4;
		}else if(stud_Mark >= 55 && stud_Mark < 60) {
			grade = 5;
		}else if(stud_Mark >= 50 && stud_Mark < 55) {
			grade = 6;
		}else if(stud_Mark >= 45 && stud_Mark < 50) {
			grade = 7;
		}else if(stud_Mark >= 40 && stud_Mark < 45) {
			grade = 8;
		}else if(stud_Mark >= 0 && stud_Mark < 40) {
			grade = 9;
		}else {
			grade = 9;
		}
		return grade; //grading scale returning (int)
	}
	
	public void printReport() { // function to print the report card for the student.
		System.out.println("INDEX No.:\t"+this.index_number+"\nSTD NAME:\t"+this.student_name);
		for(int i = 0; i< marks.length; i++) {
			System.out.print("Mark:\t"+(int) marks[i]);
			System.out.println("\tGrade:\t"+grading((int) marks[i])); // populating the aggregates array
		}
		System.out.println("Total AGG:\t"+this.total_aggregates+"\nAverage:\t"+this.average_mark+"\n");
	}
}
