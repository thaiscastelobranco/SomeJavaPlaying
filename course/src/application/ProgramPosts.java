package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.CommentsPosts;
import entities.Posts;

public class ProgramPosts {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		CommentsPosts c1 = new CommentsPosts("Have a nice trip!");
		CommentsPosts c2 = new CommentsPosts("Wow that`s awesome!");
		Posts p1 = new Posts(sdf.parse("21/06/2018 13:05:44"),
										"Traveling to New Zealand",
										"I'm going to visit this amazing country",
										12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		CommentsPosts c3 = new CommentsPosts("Good night");
		CommentsPosts c4 = new CommentsPosts("May the Force be with you");
		Posts p2 = new Posts(sdf.parse("28/07/2018 23:14:19"),
										"Good night guys",
										"See you tomorrow",
										5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
