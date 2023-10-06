package iVote;

// represents student broncoID arrangement
public class Student {
	
	private String broncoID;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String ans;
	
	public Student() {
		this.broncoID = " ";
		this.answerA = " ";
		this.answerB = " ";
		this.answerC = " ";
		this.answerD = " ";
		this.ans = " ";
	}
	
	//setters
	public void setID(String broncoID) {
		this.broncoID = broncoID;
		//System.out.println(broncoID);
	}
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
		//System.out.println(answerA);
	}
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
		//System.out.println(answerB);
	}
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
		//System.out.println(answerC);
	}
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
		//System.out.println(answerD);
	}
	public void setCorrect(String ans) {
		this.ans = ans;
	}
	
	//Getters
	public String getID() {
		return broncoID;
	}
	public String getAnswerA() {
		return answerA;
	}
	public String getAnswerB() {
		return answerB;
	}
	public String getAnswerC() {
		return answerC;
	}
	public String getAnswerD() {
		return answerD;
	}
	public String getCorrect() {
		return ans;
	}
}