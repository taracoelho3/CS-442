package assignment01;

import java.util.List;
import java.util.Set;

public abstract class EdCompDecorator extends EdComp {
	private EdComp next;
	public EdCompDecorator(String major, String name, String title, EdComp nextIn) {
		super(major, name, title);
		next = nextIn;
	}
	public EdComp getNext() {
		return next;
	}
	@Override
	public Set<String> allCoverage(String topic) {
		// after all components in the linked list of decorators
		// and the Student at the end are called, the method will return 
		// all courses that have "topic" in their list of topics covered
		Set<String> temp = next.allCoverage(topic);
		if(this.getTopicsCovered().contains(topic)) temp.add(this.getName());
		return temp;
		
	}
	@Override
	public boolean covered(String topic) {
		// after enough components in the linked list of decorators
		// and the Student at the end are called, the method will return 
		// true or false depending on whether a course has "topic" in 
		// its list of topics covered
		boolean temp = next.covered(topic);
		if(this.getTopicsCovered().contains(topic)) temp = true;
		return temp;
	}
	abstract List<String> getTopicsCovered();
}
