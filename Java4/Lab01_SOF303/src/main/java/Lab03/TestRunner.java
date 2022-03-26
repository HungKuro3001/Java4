package Lab03;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ErrorCollectorExample.class);
		System.out.println ("run tests: " + result.getRunCount ());
		System.out.println ("failed tests: " + result.getFailureCount ());
		System.out.println ("ignored tests: " + result.getIgnoreCount ()) ;
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result=="+result.wasSuccessful());
	}
}
