package ch15.sec02.exam01;

import java.util.Objects;

public class Board {
	private int    id;
	private String subject;
	private String content;
	private String writer;
	
	public Board(int id, String subject, String content, String writer) {
		super();
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public Board(int i) {
		this(i, "", "", "");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}