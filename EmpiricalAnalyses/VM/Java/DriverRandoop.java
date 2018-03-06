import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class DriverRandoop {

	private static Class<?> SUTClass = null;
	private static Object SUT = null;
	
//	public static junit.framework.Test suite() {
//		return new junit.framework.JUnit4TestAdapter(RandoopTest.class);
//	}
	
	public static void main(String[] args) throws IOException {
		int i = new Integer(args[0]);
		boolean killed = false;
		
		try {
			System.out.print(i + " ");
			
			if ( i == 0 ) {
				DriverRandoop.SUTClass = Class.forName("randoop.RandoopTest");
			} else {
				DriverRandoop.SUTClass = Class.forName("randoop" + i + ".RandoopTest");
			}

//			TestRunner runner = new TestRunner();
//			Test test = (Test) DriverRandoop.SUTClass.getMethod("suite").invoke(DriverRandoop.SUT);
//			TestResult result = runner.doRun(test, false);

			Result result = JUnitCore.runClasses(DriverRandoop.SUTClass);
			
			if (!result.wasSuccessful()) {
				killed = true;
//				System.out.println("ERROR FOUND");
			} else {
				killed = false;
			}
			
			Writer output = new BufferedWriter(new FileWriter("Statistics" + i + ".txt"));
		    try {
//			  System.out.println("output.write");
		      output.write("" + killed);
		    }
		    finally {
		      output.close();
//			  System.out.println("output.close");
		    }					
		} catch (Exception e) {
			System.out.println(e.getCause());
//			System.out.println("catch Exception");
		}
	}

}
