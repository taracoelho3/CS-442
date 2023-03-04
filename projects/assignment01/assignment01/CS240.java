package assignment01;

import java.util.List;
public class CS240 extends EdCompDecorator {
	public CS240(String major, EdComp nextIn) {
		super(major, "CS240", "Data Structures and Algorithms in C++", nextIn);
	}
	List<String> getTopicsCovered() {
		return List.of("classes", "variables", "constants", "functions",
			"assignment", "declaration", "pointers", "reference types", 
			"conditionals", "loops", "parameters", "pass-by-value",
			"copy constructors", "reference parameters", 
			"constant reference parameters", "arrays", "strings", 
			"overloading", "inheritance", "overriding", "templates",
			"standard template library", "file-io", "data structures", 
			"standard algorithms", "graphs", "algorithm analysis");
	}
}
