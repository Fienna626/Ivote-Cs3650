package iVote;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//To the professor: I coded this at 3 am. I made it so the question type is randomized everytime the program runs. Goodluck.
 
public class SimulationDriver {
	//random variable
	private static Random r = new Random();
	private static Student students[];
	private static Question Q;
	
	
	// main method
	public static void main(String[] args) {
		students = createStudents(); //gemerate students
		int num = r.nextInt((100-1)+1) + 1; //sorta 50% chance :D
		
		// Randomized Question type per run
		if (num % 2 == 0) { //if even
			Q = new MultipleChoice(); //generate multiple choice question
			multiple();
		}
		else { //if odd
			Q = new SingleChoice(); //generate single choice question
			single();
		}
		
		VotingService v = new VotingService(students, Q);
	}
	
	private static void multiple() { // answers for multiple choice
		Q.setQuestion("                Pick the right multiple choice answer.\n");

		//Start of randomizing the answer for multipleChoice
		int realA = r.nextInt(2); // randomizes answer
		int realB = r.nextInt(2);
		int realC = r.nextInt(2);
		int realD = r.nextInt(2);

		String Astr = "";
		String Bstr = "";
		String Cstr = "";
		String Dstr = "";

		if (realA == 1) { // makes real answer to string
			Astr = "A";
		}
		if (realB == 1) {
			Bstr = "B";
		}
		if (realC == 1) {
			Cstr = "C";
		}
		if (realD == 1) {
			Dstr = "D";
		}
		
		String[] strAr2 = {Astr, Bstr, Cstr, Dstr};
		Q.setAnswer(Arrays.toString(strAr2)); // setter for answer
		 // End

		 // Start of Generating Student answers
		for (Student stu : students) { // assigning answer for student
			int A = r.nextInt(2); //randomizes student answer
			int B = r.nextInt(2);
			int C = r.nextInt(2);
			int D = r.nextInt(2);

			if(A % 2 == 0)
			{
				stu.setAnswerA("True");
			}
			if(B % 2 == 0)
			{
				stu.setAnswerB("True");
			}
			if(C % 2 == 0)
			{
				stu.setAnswerC("True");
			}
			if(D % 2 == 0)
			{
				stu.setAnswerD("True");
			}
		// End 

		// Comparing student answers to real answers
			if (realA == A && realB == B && realC == C && realD == D){
				stu.setCorrect("True");
			}
		}
	}
	
	private static void single() { // output for single choice
		Q.setQuestion("                Determine if the following is true or false.\n");
		Q.setAnswer("True");
		
		int index = 0;
		for (Student stu: students) { // randomizes true/false answer
			index = r.nextInt(3);
			if (index % 2 == 0)
				stu.setAnswerA("True");
			else
				stu.setAnswerB("False");
		}
	}
	
	// generate number of student users
	private static Student[] createStudents() {
		int numOfStudents = r.nextInt(100-20) + 20; // generate between 20 - 100 students
		Student students[] = new Student[numOfStudents];

		for (int i = 0; i < numOfStudents; i++) { // puts the ID into students[i]
			students[i] = new Student();
		}
		
		List<String> users = new ArrayList<>(); // maintains student ID
		//Debug: System.out.println("Student IDs: \n------------");
		for (Student stu : students) { // traverse array and assign each student a user name
			stu.setID(Integer.toString(r.nextInt(999999999-100000000) + 100000000));
			while (users.contains(stu.getID())) { // make sure there are no duplicates
				stu.setID(Integer.toString(r.nextInt(999999999-100000000) + 100000000));
			}
			users.add(stu.getID());
		}
		return students;
	}
}