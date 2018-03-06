import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public class Driver {

	private static final int numMutants = 134;
//	private static final int numMutants = 0;
	private static final int numReq = 7;
	private static final int numTC =5;
//	private static final int numTC =25;
	private static boolean embraer = false;//true;
	private static ArrayList<String> uniqueEmbraerVectors = new ArrayList<String>();
	
	private static Class SUTClass = null;
	private static Object SUT = null;
	
	public static void main(String[] args) {
		GregorianCalendar start = new GregorianCalendar();
		StringBuffer buffer = new StringBuffer();
		
		try {
			ArrayList<Integer> killed = new ArrayList<Integer>();
			ArrayList<Integer> alive = new ArrayList<Integer>();
			
//			for (int i=0; i<=numMutants; i++) {
			for (int i=1; i<=numMutants; i++) {
				buffer.append("---------------------------------------------\n");
				buffer.append("Processing file " + i + "\n");			
		
				System.out.print(i + " ");
				
				if ( i == 0 ) {
					Driver.SUTClass = Class.forName("PC");
				} else {
					Driver.SUTClass = Class.forName("PC" + i);
				}
				
				boolean the_left_priority_button = false;
				boolean the_right_priority_button = false;
				boolean the_left_command = false;
				boolean the_right_command = false;
				
				boolean aliveMutant = true;
				for (int k=1; k<=Driver.numReq; k++) {
					if (!aliveMutant) {
						break;
					}
					for (int j=1; j<=Driver.numTC; j++) {
						if (!aliveMutant) {
							break;
						}
						
						Driver.SUT = Driver.SUTClass.getConstructor().newInstance();						
						
						BufferedReader file = null; 
						String fileerror = "";
						if (!embraer) {
							String filename = "tcs/tc_REQ0";
							if (k >= 10) {
								filename += k;
							} else {
								filename += "0" + k;
							}
							filename += "_" + j + ".csv";
							
//							String filename = "C:/Users/Samanta/workspace/VMDFRS/test/output/reps_170/sim_";
//							filename += j + "/TC.csv";
							fileerror = filename;
//							System.out.println(filename);
							try {
								file = new BufferedReader(new FileReader(new File(filename)));
							} catch (Exception e) {
								continue;
							}
						} else {
							file = new BufferedReader(new FileReader(new File("tc-embraer2.csv")));
						}
						
						String line = null;
						
						while ((line = file.readLine()) != null) {
							if (!line.contains(";")) {
								continue;
							}
							
							String tokens[] = line.split(";");							
							
							if (tokens[0].startsWith("TIME")) {
								continue;
							}
							
//							if (!embraer) {
//								Driver.SUT = Driver.SUTClass.getConstructor().newInstance();
//							}
							
							if (!embraer) {
								the_left_command = new Boolean(tokens[1]);
								the_left_priority_button = new Boolean(tokens[2]);
								the_right_command = new Boolean(tokens[3]);
								the_right_priority_button = new Boolean(tokens[4]);
//								the_left_command = new Boolean(tokens[3]);
//								the_left_priority_button = new Boolean(tokens[1]);
//								the_right_command = new Boolean(tokens[4]);
//								the_right_priority_button = new Boolean(tokens[2]);
							} else {
	//							old__m__the_left_priority_button = m__the_left_priority_button;
	//							old__m__the_right_priority_button = m__the_right_priority_button;
	//							
	//							m__the_left_priority_button = new Boolean(tokens[1]);
	//							m__the_right_priority_button = new Boolean(tokens[3]);
	//							m__the_left_command = new Boolean(tokens[4]);
	//							m__the_right_command = new Boolean(tokens[5]);
	//							int output = new Integer(tokens[6]);
	//							
	//							Set<Integer> skip = new HashSet<Integer>();
	//							skip.add(113); skip.add(114); skip.add(115); skip.add(116); skip.add(117); skip.add(118);
	//							skip.add(119); skip.add(120); skip.add(121); skip.add(349); skip.add(376); skip.add(377);
	//							if (skip.contains(j)) {
	//								continue;
	//							}
	//	
	//							String vector = m__the_left_priority_button +"\t"+ m__the_right_priority_button
	//									+"\t"+ m__the_left_command +"\t"+ m__the_right_command +"\t"+
	//									+ output + "\n";
	//							if (!uniqueEmbraerVectors.contains(vector)) {
	//								uniqueEmbraerVectors.add(vector);
	//							}						
							}
							
							if ( !tokens[5].equals("x") ) {
								int the_command_in_control_output = new Integer(tokens[5]);
								Object ret = Driver.SUTClass.getMethod("run",
										boolean.class, boolean.class, boolean.class, boolean.class).
										invoke(Driver.SUT, the_left_priority_button, the_right_command,
												the_left_command, the_right_priority_button);
								int temp = (Integer) ret;
		//						int temp = Driver.SUTClass.getField("c__the_command_in_control_output").getInt(Driver.SUT);
								if ( temp != the_command_in_control_output ) {
//									System.out.println("ERRO1 (TC" + j + "): " + temp + " x " + the_command_in_control_output);
//									System.out.println("ERRO1 (TC" + j + "): " + temp + " x " + the_command_in_control_output);
									System.out.println("ERRO1 (" + fileerror + "): " + temp + " x " + the_command_in_control_output);
									killed.add(i);
									aliveMutant = false;
									System.out.println(line);
//									System.out.println(the_left_priority_button);
//									System.out.println(the_right_priority_button);
//									System.out.println(the_left_command);
//									System.out.println(the_right_command);
//									System.out.println("output="+temp+" ret="+ret);
									break;
								}
							}
						}
						
						file.close();
					}
					
				}
				if ( aliveMutant ) {
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
			
			if(!embraer) {
			    Writer output = new BufferedWriter(new FileWriter("Statistics.txt"));
			    try {
			      output.write( buffer.toString() );
			    }
			    finally {
			      output.close();
			    }
			} else {
			    Writer output = new BufferedWriter(new FileWriter("StatisticsEmbraer.txt"));
			    try {
			      output.write( buffer.toString() );
			    }
			    finally {
			      output.close();
			    }
			    System.out.println(uniqueEmbraerVectors);
			}
		    
		    System.out.println("Finished!");			
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

}
