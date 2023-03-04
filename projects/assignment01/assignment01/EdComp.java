package assignment01;

import java.util.Set;
import java.util.TreeSet;

public abstract class EdComp { //Education Component	
	private String major = "Unknown";
	private String name = "Unknown";
	private String title = "Unknown";
	
	public EdComp(String majorIn, String nameIn, String titleIn) {
		major = majorIn;
		name = nameIn;
		title = titleIn;
	}
	// These concrete implementations are for the 
	// concrete EdComp classes, not the decorators
	public Set<String> allCoverage(String topic) {
		return new TreeSet<>();
	}
	public boolean covered(String topic) {
		return false;
	}
	public String getMajor() {
		return major;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
}
