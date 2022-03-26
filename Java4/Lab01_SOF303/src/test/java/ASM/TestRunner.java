package ASM;
import java.util.Iterator;

import org.junit.runner.Result;

import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
public class TestRunner {
	public static void main(String[] args) {
		JUnitCore runnerCore= new JUnitCore();
		Result result=runnerCore.run(TestSuite.class);
		System.out.println("Run test: "+ result.getRunCount());
		System.out.println("Failed: "+ result.getFailureCount());
		System.out.println("Ignored test: "+ result.getIgnoreCount());
		System.out.println("Success: "+ result.wasSuccessful());
	}
}
