package assignment01;

//package assignment01;
import java.util.List;
public class CS320 extends EdCompDecorator {
	public CS320(String major, EdComp nextIn) {
		super(major, "CS320", "Advanced Computer Architecture", nextIn);
	}
	List<String> getTopicsCovered() {
		return List.of("cpu clock cycles", "ALU", "carry lookahead buffer", "caches", 
				"branch prediction", "page tables", "TLB", "virtual addressing", 
				"physical addressing");
	}
}