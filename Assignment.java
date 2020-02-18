/**
 * 
 * @author Mason Vischer
 * Purpose: defines the Assignment object to be used in course class
 */
public class Assignment {
	private String title;
	private String description;
	private String topic;
	private int points;
	
	/**
	 * 
	 * @param title
	 * @param description
	 * @param topic
	 * @param points
	 * Purpose: Constructor for Assignment type
	 */
	public Assignment(String title, String description, String topic, int points) {
		this.title = title;
		this.description = description;
		this.topic = topic;
		this.points = points;
	}
	
	/**
	 * 
	 * @return String
	 * Purpose: getter to be used for test cases
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @return String
	 * Purpose: getter to be used for test cases
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @return String
	 * Purpose: getter to be used for test cases
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * 
	 * @return int
	 * Purpose: getter to be used for test cases
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return String
	 * Purpose: return a string that includes the course title, description, and topic
	 */
	public String toString() {
		return this.title+": "+this.description+", covers: "+this.topic;
	}
}
