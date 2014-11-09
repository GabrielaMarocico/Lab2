package ip.tema.stringpackages;

/**
 * 
 * @author gby 
 * 
 * Class StringClass
 * 
 */

public class StringClass {
	String content;

	/**
	 * Default constructor
	 */
	public StringClass() {
		content = "No content here.Please write something.";
	}

	/**
	 * Constructor with parameter
	 * 
	 * @param cont
	 *            - initialize the content
	 */
	public StringClass(String cont) {
		content = cont;
	}

	/**
	 * Print function is used to display the information from content field
	 */
	public void print() {
		System.out.println(this.content);
	}

	/**
	 * Gets the value of Content
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content field with the value given as parameter
	 * 
	 * @param content
	 *            - new value of content
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
