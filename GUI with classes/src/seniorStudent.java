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
public class seniorStudent extends student {
	
	private float[] sst = new float[3]; // sst variable to hold array of floats
	private float[] math = new float[1]; // math variable to hold array of floats
	private float[] english = new float[3]; // english variable to hold array of floats
	private float[] science = new float[2]; // science variable to hold array of floats
	private int total_aggregates;
	
	public void getdetails(String student_name,int class_name, String index_number) {
		this.student_name = student_name; // initializing student name in the student class, inherited
		this.index_number = index_number; // initializing the index number inherited from student class
		this.class_name = class_name; // Initializing the class_name variable inherited from the super class student
	}
	
	public int getClassName() { //method to get the class name
		return this.class_name; // returning the class name
	}
	
	public void sstMarks(float sstMarks[]) { // method to initialize sst marks array
		sst[0]=sstMarks[0];	//Initializing the array through index
		sst[1]=sstMarks[1]; //Initializing the array through index
		sst[2]=sstMarks[2]; //Initializing the array through index
	}
	
	public void mathMarks(float mathMark) { //method to initialize the math marks array
		math[0]=mathMark; //Initializing the array through index
	}
	
	public void scienceMarks(float sciMark[]) { // method to initialize the science marks
		science[0]=sciMark[0]; //Initializing the array through index
		science[1]=sciMark[1];		 //Initializing the array through index
	}
	
	public void englishMarks(float engMark[]) { //method to initialize the english marks array
		english[0]=engMark[0]; //Initializing the array through index
		english[1]=engMark[1]; //Initializing the array through index
		english[2]=engMark[2]; //Initializing the array through index
	}
	
	public float calcAverage(float marks[]) { //method overloading through parameter change.
		//this function also calculates the average of the markks but takes up a float array
		float sum = 0.0f;
		int length = marks.length;
		
		for(double num : marks) {
			sum += num;
		}
		return sum/length; // returning of the average float value
	}
	
	public int totalAggregates(float marks[]) { //method to compute the total aggregates
		this.total_aggregates = 0;
		for(int i = 0; i< marks.length; i++) {
			int gradeAgg = grading(calcAverage(marks)); 
			total_aggregates += gradeAgg;
		}
		return total_aggregates;
	}
	
	private int grading(float stud_Mark) { //method to compute the grading of the marks
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
		return grade; //grade return
	}
	
	public void printReport() { // method to print the report card for the student
		System.out.println("INDEX No.:\t"+this.index_number+"\nSTD NAME:\t"+this.student_name+"\nClass:\tP."+this.class_name);
		float averages[] = new float[4];
		System.out.print("English Marks\t");
		for(int i = 0; i < english.length; i++) {
			System.out.print("Mark:\t"+ english[i]+"\t");
		}
		System.out.println("English AVG: "+calcAverage(english)+"\tGrade: "+grading(calcAverage(english))+"\n");
		averages[0] = calcAverage(english);
		
		System.out.print("SST Marks\t");
		for(int i = 0; i < sst.length; i++) {
			System.out.print("Mark:\t"+ sst[i]+"\t");
		}
		System.out.println("SST AVG: "+calcAverage(sst)+"\tGrade: "+grading(calcAverage(sst))+"\n");
		averages[1] = calcAverage(sst);
		
		System.out.print("Science Marks\t");
		for(int i = 0; i < science.length; i++) {
			System.out.print("Mark:\t"+ science[i]+"\t");
		}
		System.out.println("Science AVG: "+calcAverage(science)+"\tGrade: "+grading(calcAverage(science))+"\n");
		averages[2] = calcAverage(science);
		
		System.out.print("Math Marks\t");
		for(int i = 0; i < math.length; i++) {
			System.out.print("Mark:\t"+ math[i]+"\t");
		}
		System.out.println("Math AVG: "+calcAverage(math)+"\tGrade: "+grading(calcAverage(math))+"\n");
		averages[3] = calcAverage(math);
		
		System.out.println("Total AGG:\t"+this.totalAggregates(averages)+"\nAverage:\t"+calcAverage(averages)+"\n");
	}
	
	public String getReportMessage() { // method to get text to be printed to the jOptionPane
		String message;
		message = "INDEX No.:        "+this.index_number+"\nSTD NAME:        "+this.student_name+"\nClass:        P."+this.class_name+"\n";
		float averages[] = new float[4];
		message += "English Marks        ";
		for(int i = 0; i < english.length; i++) {
			message += "Mark:        "+ english[i]+"        ";
		}
		message += "English AVG: "+calcAverage(english)+"        Grade: "+grading(calcAverage(english))+"\n\n";
		averages[0] = calcAverage(english);
		
		message += "SST Marks        ";
		for(int i = 0; i < sst.length; i++) {
			message += "Mark:        "+ sst[i]+"        ";
		}
		message += "SST AVG: "+calcAverage(sst)+"        Grade: "+grading(calcAverage(sst))+"\n\n";
		averages[1] = calcAverage(sst);
		
		message += "Science Marks        ";
		for(int i = 0; i < science.length; i++) {
			message += "Mark:        "+ science[i]+"        ";
		}
		message += "Science AVG: "+calcAverage(science)+"        Grade: "+grading(calcAverage(science))+"\n\n";
		averages[2] = calcAverage(science);
		
		message += "Math Marks        ";
		for(int i = 0; i < math.length; i++) {
			message += "Mark:        "+ math[i]+"        ";
		}
		message += "Math AVG: "+calcAverage(math)+"        Grade: "+grading(calcAverage(math))+"\n\n";
		averages[3] = calcAverage(math);
		
		message += "Total AGG:        "+this.totalAggregates(averages)+"\nAverage:        "+calcAverage(averages)+"\n\n";

		return message;  // returning the data to be printed
	}

}

