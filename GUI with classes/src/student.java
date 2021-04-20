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
public class student {
	protected String student_name; //field to be accessed in the subclasses too
	protected String index_number;//field to be accessed in the subclasses too
	protected int class_name;//field to be accessed in the subclasses too
	private float marks[];
	protected float sst;//field to be accessed in the subclasses too
	protected float math;//field to be accessed in the subclasses too
	protected float english;//field to be accessed in the subclasses too
	protected float science;//field to be accessed in the subclasses too
	
	public float average_mark;
	protected int total_aggregates;//field to be accessed in the subclasses too
	
	public student() { // constructor with out the parameter
		//this constructor does nothing
	}
	
	public student(String student_name, int class_name, float average, int total_aggregate, float marks[], String index_number){ //Parameterized constructor
		this.student_name = student_name; // assigning of value to field
		this.marks = marks; // assigning of value to field
		this.index_number = index_number; // assigning of value to field
	}
	
	public float calcAverage() { //method to calculate average
		float sum = 0.0f;
		int length = marks.length;
		
		for(double num : marks) {
			sum += num;
		}
		return average_mark = sum/length; // returning the average
	}
	
	public int totalAggregates() { //method to get total aggregates
		this.total_aggregates = 0;
		for(int i = 0; i< marks.length; i++) {
			int gradeAgg = grading((int) marks[i]);
			total_aggregates += gradeAgg;
		}
		return total_aggregates; // returning the total aggregates
	}
	
	protected int grading(int stud_Mark) { // grading method
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
		return grade; //returned grade
	}
	
	public void printReport() { //method for printing the report
		System.out.println("INDEX No.:\t"+this.index_number+"\nSTD NAME:\t"+this.student_name);
		for(int i = 0; i< marks.length; i++) {
			System.out.print("Mark:\t"+(int) marks[i]);
			System.out.println("\tGrade:\t"+grading((int) marks[i]));
		}
		System.out.println("Total AGG:\t"+this.total_aggregates+"\nAverage:\t"+this.average_mark+"\n");
	}
	
	protected String getReportMessage() { // method to get report card text to e printed
		String message;
		message = "INDEX No.:        "+this.index_number+"\nSTD NAME:        "+this.student_name;
		for(int i = 0; i< marks.length; i++) {
			message += "Mark:        "+(int) marks[i];
			message += "        Grade:        "+grading((int) marks[i]);
		}
		message += "Total AGG:        "+this.total_aggregates+"\nAverage:        "+this.average_mark+"\n";
		return message; // returning the message
	}
	
}
