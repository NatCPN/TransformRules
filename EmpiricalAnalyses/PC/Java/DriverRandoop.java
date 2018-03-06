import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.textui.TestRunner;

public class DriverRandoop {

	private static Class SUTClass = null;
	private static Object SUT = null;
	
	public static void main(String[] args) throws IOException {
		int i = new Integer(args[0]);
		boolean killed = false;
		
		try {
			System.out.print(i + " ");
			
			if ( i == 0 ) {
				DriverRandoop.SUTClass = Class.forName("randoop.RandoopTest");
			} else {
				DriverRandoop.SUTClass = Class.forName("randoop" + i + ".RandoopTest");
//				suiteRun = "randoop" + i + ".RandoopTest.class";
			}
//			Class suiteRun = DriverRandoop.SUTClass;
			
//			TestRunner runner = new TestRunner();
//			Test test = (Test) DriverRandoop.SUTClass.getMethod("suite").invoke(DriverRandoop.SUT);
////			TestResult result = runner.doRun(test, false);
//			TestResult result = runner.run(test);
			
			Result result = JUnitCore.runClasses(DriverRandoop.SUTClass);
			
//			System.out.println(result.wasSuccessful() + " - Tempo: " + result.getRunTime() + " - Falhas: " + result.getFailureCount());
//			System.out.println(result.wasSuccessful() + " - Erros: " + result.errorCount() + " - Falhas: " + result.failureCount());
			
			if (!result.wasSuccessful()) {
				killed = true;
				System.out.println("ERROR FOUND");
			} else {
				killed = false;
			}
			
		    Writer output = new BufferedWriter(new FileWriter("Statistics" + i + ".txt"));
		    try {
//			      output.write(DriverRandoop.SUTClass.getName());
		    	output.write("" + killed);
//		    	output.write("" + killed + result.wasSuccessful() + " - Tempo: " + result.getRunTime() + " - Falhas: " + result.getFailureCount() + DriverRandoop.SUTClass.getName() + result);
		    }
		    finally {
		      output.close();
		    }
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}

}
