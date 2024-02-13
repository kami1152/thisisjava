package ch15.sec02.exam03;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Board {
	private int    id;
	private String subject;
	private String content;
	private String writer;
	
	public Board(int id) {
		this(id, "", "", "");
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
		if (getClass() != obj.getClass()) {
			if (obj instanceof Integer id) {
				return this.id == id;
			}
			return false;
		}
		Board other = (Board) obj;
		return id == other.id;
	}
	
}