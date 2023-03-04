package assignment01;

public class CourseDriver {
	public static void main(String[] args) {
		EdComp test = new Student("CS", "J Smith", "Junior");
		test = new CS140(test.getMajor(),test);
		test = new CS240(test.getMajor(),test);
		test = new CS373(test.getMajor(),test);
		test = new CS320(test.getMajor(),test);
		System.out.println(test.allCoverage("arrays")); 
		System.out.println(test.allCoverage("templates"));
		System.out.println(test.allCoverage("operating systems"));
		System.out.println(test.allCoverage("NFA"));
		System.out.println(test.allCoverage("caches"));
		System.out.println(test.covered("arrays"));
		System.out.println(test.covered("templates"));
		System.out.println(test.covered("operating systems"));
		System.out.println(test.covered("pumping lemma"));
		/* OUTOUT IS
		 [CS140, CS240]
		 [CS240]
		 []
		 true
		 true
		 false 
		 */
		/* NEWOUT IS
		 [CS140, CS240]
		 [CS240]
		 []
		 [CS373]
		 [CS320]
		 true
		 true
		 false
		 true
		 */
	}
}
