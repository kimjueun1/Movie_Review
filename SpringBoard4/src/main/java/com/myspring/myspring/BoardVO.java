package com.myspring.myspring;

import java.util.Date;

public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String director;
	private String actor;
	private String dialogue;
	private String content;
	private boolean recommend;
	//private Date regdate;
	//private int cnt;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDialogue() {
		return dialogue;
	}
	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isRecommend() {
		return recommend;
	}
	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}
//	public Date getRegdate() {
//		return regdate;
//	}
//	public void setRegdate(Date regdate) {
//		this.regdate = regdate;
//	}
	
	
}
