package assignment01;

import java.util.List;
public class CS373 extends EdCompDecorator {
	public CS373(String major, EdComp nextIn) {
		super(major, "CS373", "Automata Theory and Formal Languages", nextIn);
	}
	List<String> getTopicsCovered() {
		return List.of("NFA", "DFA", "PDA", "turing machines", "decidability", "reduceability",
				"regular languages", "context-free languages", "turing recognizeable languages",
				"co-turing recognizeable languages", "pumping lemma", "automata constructions",
				"turing machine constructions", "rice's theorem");
	}
}