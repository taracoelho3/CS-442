package assignment01;
//package assignment01;
import java.util.List;
public class CS140 extends EdCompDecorator {
	public CS140(String major, EdComp nextIn) {
		super(major, "CS140", "Programming with Objects and Data Structures", nextIn);
	}
	List<String> getTopicsCovered() {
		return List.of("classes", "variables", "constants", "methods",
				"assignment", "declaration", "conditionals", "loops",
				"parameters", "overloading", "inheritance", "overriding", "arrays",
				"lists", "maps", "sets", "streams", "file-io", "data structures");
	}
}
