import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Driver {

//	private static final int numMutants = 283;
	private static final int numMutants = 0;
	private static final int numReq = 5;
	private static final int numTC = 32;

	private static Class SUTClass = null;
	private static Object SUT = null;
	
	public static void main(String[] args) throws IOException {
		GregorianCalendar start = new GregorianCalendar();
		StringBuffer buffer = new StringBuffer();
		
		try {
			ArrayList<Integer> killed = new ArrayList<Integer>();
			ArrayList<Integer> alive = new ArrayList<Integer>();
			
//			for (int i=1; i<=numMutants; i++) {
			for (int i=0; i<=numMutants; i++) {
				buffer.append("---------------------------------------------\n");
				buffer.append("Processing file " + i + "\n");			
		
				System.out.print(i + " ");
				
				if ( i == 0 ) {
					Driver.SUTClass = Class.forName("VM");
				} else {
					Driver.SUTClass = Class.forName("VM" + i);
				}

				boolean aliveMutant = true;
//				for (int k=1; k<=Driver.numReq; k++) {
//					if (!aliveMutant) {
//						break;
//					}
					for (int j=1; j<=Driver.numTC; j++) {
						if (!aliveMutant) {
							break;
						}
						
						Driver.SUT = Driver.SUTClass.getConstructor().newInstance();						
				
						float TIME;
						boolean the_coffee_request_button;
						boolean the_coin_sensor;
						
						BufferedReader file = null; 
//						String filename = "tcs/tc_REQ0";
//						if (k >= 10) {
//							filename += k;
//						} else {
//							filename += "0" + k;
//						}
//						filename += "_" + j + ".csv";

//						String filename = "tcs/TC";
//						filename += j + ".csv";
//						String filename = "C:/Users/Samanta/workspace/VMDFRS/test/output/TC.csv";

						String filename = "C:/Users/Samanta/workspace/VMDFRS/test/output/reps_101/sim_";
						filename += j + "/TC.csv";
						
//						buffer.append("File: " + filename + "\n");			
						System.out.println(filename);
						try {
							file = new BufferedReader(new FileReader(new File(filename)));
						} catch (Exception e) {
							continue;
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
							
							TIME = new Float(tokens[0]);
							the_coffee_request_button = new Boolean(tokens[1]);
							the_coin_sensor = new Boolean(tokens[2]);
							
							int expected_the_system_mode = new Integer(tokens[3]);
							int expected_the_coffee_machine_output = new Integer(tokens[4]);
							
							
							int qtd = 0;
							while (qtd != 1000) {
								Object ret = Driver.SUTClass.getMethod("run",
										boolean.class, boolean.class, float.class
										).invoke(Driver.SUT,
												the_coffee_request_button, the_coin_sensor, TIME);								

								int the_system_mode =
										Driver.SUTClass.getField("the_system_mode").getInt(Driver.SUT);
								int the_coffee_machine_output =
										Driver.SUTClass.getField("the_coffee_machine_output").getInt(Driver.SUT);
								float the_request_timer =
										Driver.SUTClass.getField("the_request_timer").getFloat(Driver.SUT);

								int primed_the_system_mode =
										Driver.SUTClass.getField("primed_the_system_mode").getInt(Driver.SUT);
								int primed_the_coffee_machine_output =
										Driver.SUTClass.getField("primed_the_coffee_machine_output").getInt(Driver.SUT);
								float primed_the_request_timer =
										Driver.SUTClass.getField("primed_the_request_timer").getFloat(Driver.SUT);
								
								if (the_system_mode == primed_the_system_mode
										&& the_coffee_machine_output == primed_the_coffee_machine_output
										&& the_request_timer == primed_the_request_timer) {
									break;
								} else {
									Driver.SUTClass.getField("the_system_mode").setInt(Driver.SUT, primed_the_system_mode);
									Driver.SUTClass.getField("the_coffee_machine_output").setInt(Driver.SUT, primed_the_coffee_machine_output);
									Driver.SUTClass.getField("the_request_timer").setFloat(Driver.SUT, primed_the_request_timer);
								}
								
								qtd++;
							}	
							
							Driver.SUTClass.getField("old_the_coin_sensor").setBoolean(Driver.SUT, the_coin_sensor);
							Driver.SUTClass.getField("old_the_coffee_request_button").setBoolean(Driver.SUT, the_coffee_request_button);

							int temp1 = Driver.SUTClass.getField("the_system_mode").getInt(Driver.SUT);
							if ( temp1 != expected_the_system_mode ) {
//								System.out.println("ERRO1 (TC" + j + ", REQ" + k + "): " + temp1 + " x " + expected_the_system_mode);
								System.out.println("ERRO1 (TC" + j + "): " + temp1 + " x " + expected_the_system_mode);
								killed.add(i);
								aliveMutant = false;
//								System.out.println(line);
								break;
							}
//							} else {
//								System.out.println("TC_VMint" + j);
//								System.out.println("TC" + j);
//							}
							
							int temp2 = Driver.SUTClass.getField("the_coffee_machine_output").getInt(Driver.SUT);
							if ( temp2 != expected_the_coffee_machine_output ) {
//								System.out.println("ERRO2 (TC" + j + ", REQ" + k + "): " + temp2 + " x " + expected_the_coffee_machine_output);
								System.out.println("ERRO2 (TC" + j + "): " + temp2 + " x " + expected_the_coffee_machine_output);
								killed.add(i);
								aliveMutant = false;		
//								System.out.println(line);
								break;
							}							
						}
						file.close();
					}
//				}
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
			
		    Writer output = new BufferedWriter(new FileWriter("Statistics.txt"));
		    try {
		      output.write( buffer.toString() );
		    }
		    finally {
		      output.close();
		    }			
		    
		    System.out.println("Finished!");			
		    System.out.println("TIME => " + (end.getTimeInMillis() - start.getTimeInMillis()) + " - Killed = " + KilledPercentual + "% (" + killed.size() + ")\n");
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

}
