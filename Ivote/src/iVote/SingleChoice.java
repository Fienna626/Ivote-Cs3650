package iVote;

// displays random single choice questions
public class SingleChoice implements Question {
	private String Q = "default";
	private String a = "Is the approach to interface more suitable when it comes to inheritance?";
	private String Ans = "default";
	
	
	public String question() {
		return Q;
	}
	
	public String Example() {
		return a;
	}
		
	public String answer() {
		return Ans;
	}
	
	public String correct() {
		return Ans;
	}
	
	public void setQuestion(String Q) {
		this.Q = Q;
	}
	
	public void setAnswer(String Ans) {
		this.Ans = Ans;
	}
	
	public boolean isMultipleChoice() {
		return false;
	}
	
	public boolean isSingleChoice() {
		return true;
	}
}