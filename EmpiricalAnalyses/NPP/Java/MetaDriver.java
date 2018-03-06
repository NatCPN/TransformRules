import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;


public class MetaDriver {

//	private static final int numMutants = 0;
	private static final int numMutants = 319;
	
	public static void main(String[] args) {
		GregorianCalendar start = new GregorianCalendar();
		try {		
			InputStream inputStream = null;
			InputStreamReader inputStreamReader = null;
			BufferedReader bufferedReader = null;
			
			for(int i=1; i<=numMutants; i++) {				
				System.out.println(i);
				List<String> command = new ArrayList<String>();
				command.add("java");
				command.add("-cp");
				command.add(".;junit-4.12.jar;hamcrest-core-1.3.jar");
				command.add("DriverRandoop");
				command.add("" + i);
				
				ProcessBuilder pb = new ProcessBuilder(command);
				pb.directory(new File("C:/Users/Samanta/workspace/NAT2TEST_Phases1_2_3_4/NPP/bin/"));
		        Process pr = pb.start();
		        
				inputStream = pr.getInputStream();
				inputStreamReader = new InputStreamReader(inputStream);
				bufferedReader = new BufferedReader(inputStreamReader);
							
//				String line;
//				while ((line = bufferedReader.readLine()) != null)
//				{
//				    System.out.println(line);
//				}
				
//				String s = null;
//				BufferedReader stdError = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
//				System.out.println("Saida de erro:\n");
//				while ((s = stdError.readLine()) != null) {
//					System.out.println(s);
//				}
			}

			ArrayList<Integer> killed = new ArrayList<Integer>();
			ArrayList<Integer> alive = new ArrayList<Integer>();			
			StringBuffer buffer = new StringBuffer();			
			
			Scanner s = null;
			boolean result = false;
			for (int i=1; i<=numMutants; i++) {
				System.out.println("> " + i);				
				buffer.append("---------------------------------------------\n");
				buffer.append("Processing file " + i + "\n");				
				s = new Scanner(new File("bin/Statistics" + i + ".txt"));
				result = Boolean.parseBoolean(s.nextLine());
				s.close();
				if (result) {
					killed.add(i);
				} else {
					alive.add(i);
				}
			}
			
			double KilledPercentual = (((double) killed.size())/numMutants)*100;
			double AlivePercentual = (100-KilledPercentual);
			
			GregorianCalendar end = new GregorianCalendar();
			String strStart = start.get(GregorianCalendar.HOUR_OF_DAY) + ":" +
					start.get(GregorianCalendar.MINUTE) + ":" +
					start.get(GregorianCalendar.SECOND) + ":" +
					start.get(GregorianCalendar.MILLISECOND);			
			String strEnd = end.get(GregorianCalendar.HOUR_OF_DAY) + ":" +
					end.get(GregorianCalendar.MINUTE) + ":" +
					end.get(GregorianCalendar.SECOND) + ":" +
					end.get(GregorianCalendar.MILLISECOND);

			buffer.append("---------------------------------------------\n");
			buffer.append(strStart + " x " + strEnd + "\n");
			buffer.append("Killed = " + KilledPercentual + "% (" + killed.size() + ")\n");
			buffer.append("Alive = " + AlivePercentual + "%\n");
			buffer.append("List = " + alive + "");	
			buffer.append("\nTIME => " + (end.getTimeInMillis() - start.getTimeInMillis()));
			
		    Writer output = new BufferedWriter(new FileWriter("Statistics.txt"));
		    try {
		      output.write(buffer.toString());
		    }
		    finally {
		      output.close();
		    }
		    System.out.println("TIME => " + (end.getTimeInMillis() - start.getTimeInMillis()) + " - Finished!");			
		    System.out.println("Killed = " + KilledPercentual + "% (" + killed.size() + ")\n");			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
