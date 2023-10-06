package iVote;

public interface Question {
	public String question();
	public String Example();
	public String answer();
	public String correct();
	public void setQuestion(String Q);
	public void setAnswer(String Ans);
	public boolean isMultipleChoice();
	public boolean isSingleChoice();
}