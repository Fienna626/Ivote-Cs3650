package iVote;

// displays random multiple choice questions
public class MultipleChoice implements Question {
	private String Q = "default";
	private String a = "      Which algorithm has O(n^2) notation"; //the question
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
		return true;
	}
	
	public boolean isSingleChoice() {
		return false;
	}

}