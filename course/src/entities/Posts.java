package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	// associa��o entre Posts e Comments (seta do UML)
	private List<CommentsPosts> comments = new ArrayList<>();
	//quando � uma cole��o n�o faz m�todo set, mas sim add e remove

	public Posts() {
	}

	public Posts(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<CommentsPosts> getComments() {
		return comments;
	}
	//n�o posso ter um set comum, pois sempre vai gerar nova lista
	//add coment�rio recebendo coment�rio como argumento, 
	//vai na lista de coment�rio e add na lista o coment�rio do argumento do m�todo
	public void addComment(CommentsPosts comment) {
		comments.add(comment);
	}
	//remove coment�rio recebendo coment�rio como argumento, 
	//vai na lista de coment�rio e remove na lista o coment�rio do argumento do m�todo
	public void removeComment(CommentsPosts comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (CommentsPosts c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
