package string;

/**
 * 
 * @author gby
 * class stringClass which contains 1 member of type String 
 * functions for get and set 
 * 2 constructors 
 * 1 function for printing an object
 * 
 */

public class StringClass {
	String content;

	public StringClass() {
		content = "No content here.Please write something.";
	}

	public StringClass(String cont) {
		content = cont;
	}

	public void print() {
		System.out.println(this.content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
