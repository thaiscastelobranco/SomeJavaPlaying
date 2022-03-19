package entities;

public class CommentsPosts {
	private String text;
	
	public CommentsPosts() {
	}
	
	public CommentsPosts(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
