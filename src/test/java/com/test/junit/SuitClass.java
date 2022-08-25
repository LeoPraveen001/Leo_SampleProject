package com.test.junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunitSample.class, JunitSample2.class, JunitSample3.class, })
public class SuitClass {
	@Test
	public void junitMethod() {
		Result r = JUnitCore.runClasses(Suite.class);
		// Failure Count
		int failureCount = r.getFailureCount();
		System.out.println("Failure Count" + failureCount);
		// Ignore count
		int ignoreCount = r.getIgnoreCount();
		System.out.println("ignore count" + ignoreCount);
		int runCount = r.getRunCount();
		System.out.println("RunCount" + runCount);
		long runTime = r.getRunTime();
		System.out.println("Run time" + runTime);
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}

	}
}
