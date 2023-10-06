package iVote;

public class VotingService {
	private Student[] students;
	private Question Q;
	private int A = 0, B = 0, C = 0, D = 0;
	private int right = 0, wrong = 0;
	private int Correct = 0;

	public VotingService(Student[] students, Question Q) { 
		this.students = students;
		this.Q = Q;
		
		if (Q.isMultipleChoice()) // checks to see if question is multiple or single choice every run :D
			checkMultiple(); 
		else 
			checkSingle();
	}
	
	public void checkMultiple() {  //checks student choice & adds it
		for (Student stu : students) {
			if (stu.getAnswerA().compareTo("True") == 0){
				A++;
			}
			if (stu.getAnswerB().compareTo("True") == 0){
				B++;
			}
			if (stu.getAnswerC().compareTo("True") == 0){
				C++;
			}
			if (stu.getAnswerD().compareTo("True") == 0){
				D++;
			}
			if (stu.getCorrect().compareTo("True") == 0){ //checks to see how many people get it correct
				Correct++;
			}
		}
		
		printInitial();
		printResults();
	}
	
	public void checkSingle() {
		for (Student stu : students) { //checks student choice & adds it
			if (stu.getAnswerA().compareTo("True") == 0){
				right++;
			}
			else
				wrong++;
		}
		
		printInitial();
		printResults();
	}
	
 
	
	public void printInitial() {
		System.out.println("\niVote Simulation Start");
		System.out.println("Question: " + Q.Example() +  "\n" + Q.question());
	}
	
	//Prints statistics base on amt of students and type of question
	public void printResults() { //change into calcResults
		if (Q.isMultipleChoice()) {
			System.out.println("Students' Results for Multiple choice questions" + "\n-----------------------------------------------");
			System.out.println("A: " + A);
			System.out.println("B: " + B);
			System.out.println("C: " + C);
			System.out.println("D: " + D);
			System.out.println("\nNumber of students who partcipated: " + (students.length));
			System.out.println("Correct Answer:	-> " + Q.answer() + "\n");
			System.out.println("# of people correct: " + Correct);
			System.out.println("% correct:" + (((double)Correct/(double)students.length)*100) + "%");
		}
		
		else {
			System.out.println("Students' Results for Single choice questions" + "\n----------------------------------------------");
			System.out.println("True: " + right);
			System.out.println("False: " + wrong);
			System.out.println("\nNumber of students who partcipated: " + (students.length));
			System.out.println("Correct Answer:	-> " + Q.answer() + "\n");
			System.out.println("# of people correct: " + right);
			System.out.println("% correct:" + (((double)right/(double)students.length)*100) + "%");
		}
	}
}