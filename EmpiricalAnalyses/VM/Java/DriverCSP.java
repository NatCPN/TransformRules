import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class DriverCSP {

	private static final int numMutants = 283;
//	private static final int numMutants = 0;
	private static final int numReq = 5;
	private static final int numTC = 5;

	private static Class SUTClass = null;
	private static Object SUT = null;
	
	public static void main(String[] args) throws IOException {
		GregorianCalendar start = new GregorianCalendar();
		StringBuffer buffer = new StringBuffer();
		
		try {
			ArrayList<Integer> killed = new ArrayList<Integer>();
			ArrayList<Integer> alive = new ArrayList<Integer>();
			
			for (int i=1; i<=numMutants; i++) {
//			for (int i=0; i<=numMutants; i++) {
				buffer.append("---------------------------------------------\n");
				buffer.append("Processing file " + i + "\n");			
		
				System.out.print(i + " ");
				
				if ( i == 0 ) {
					DriverCSP.SUTClass = Class.forName("VM");
				} else {
					DriverCSP.SUTClass = Class.forName("VM" + i);
				}

				boolean aliveMutant = true;
				for (int k=1; k<=DriverCSP.numReq; k++) {
					if (!aliveMutant) {
						break;
					}
					for (int j=1; j<=DriverCSP.numTC; j++) {
						if (!aliveMutant) {
							break;
						}
						
						DriverCSP.SUT = DriverCSP.SUTClass.getConstructor().newInstance();						
				
						float TIME;
						boolean the_coffee_request_button;
						boolean the_coin_sensor;
						
						BufferedReader file = null; 
//						String filename = "tcs/TC";
//						String filename = "tcs/TC_VMint";
						String filename = "tcs/tc_REQ0";
						if (k >= 10) {
							filename += k;
						} else {
							filename += "0" + k;
						}
						filename += "_" + j + ".csv";
//						filename += j + ".csv";
						buffer.append("File: " + filename + "\n");			
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
								Object ret = DriverCSP.SUTClass.getMethod("run",
										boolean.class, boolean.class, float.class
										).invoke(DriverCSP.SUT,
												the_coffee_request_button, the_coin_sensor, TIME);								

								int the_system_mode =
										DriverCSP.SUTClass.getField("the_system_mode").getInt(DriverCSP.SUT);
								int the_coffee_machine_output =
										DriverCSP.SUTClass.getField("the_coffee_machine_output").getInt(DriverCSP.SUT);
								float the_request_timer =
										DriverCSP.SUTClass.getField("the_request_timer").getFloat(DriverCSP.SUT);

								int primed_the_system_mode =
										DriverCSP.SUTClass.getField("primed_the_system_mode").getInt(DriverCSP.SUT);
								int primed_the_coffee_machine_output =
										DriverCSP.SUTClass.getField("primed_the_coffee_machine_output").getInt(DriverCSP.SUT);
								float primed_the_request_timer =
										DriverCSP.SUTClass.getField("primed_the_request_timer").getFloat(DriverCSP.SUT);
								
								if (the_system_mode == primed_the_system_mode
										&& the_coffee_machine_output == primed_the_coffee_machine_output
										&& the_request_timer == primed_the_request_timer) {
									break;
								} else {
									DriverCSP.SUTClass.getField("the_system_mode").setInt(DriverCSP.SUT, primed_the_system_mode);
									DriverCSP.SUTClass.getField("the_coffee_machine_output").setInt(DriverCSP.SUT, primed_the_coffee_machine_output);
									DriverCSP.SUTClass.getField("the_request_timer").setFloat(DriverCSP.SUT, primed_the_request_timer);
								}
								
								qtd++;
							}	
							
//							Boolean tempButtonOld = DriverCSP.SUTClass.getField("old_the_coffee_request_button").getBoolean(DriverCSP.SUT);
//							Boolean tempButtonN = DriverCSP.SUTClass.getField("the_coffee_request_button").getBoolean(DriverCSP.SUT);
//							Boolean tempCoinOld = DriverCSP.SUTClass.getField("old_the_coin_sensor").getBoolean(DriverCSP.SUT);
//							Boolean tempCoinN = DriverCSP.SUTClass.getField("the_coin_sensor").getBoolean(DriverCSP.SUT);
							Float tempTimerP = DriverCSP.SUTClass.getField("primed_the_request_timer").getFloat(DriverCSP.SUT);
							Float tempTimerN = DriverCSP.SUTClass.getField("the_request_timer").getFloat(DriverCSP.SUT);
							int tempModeP = DriverCSP.SUTClass.getField("primed_the_system_mode").getInt(DriverCSP.SUT);
							int tempModeN = DriverCSP.SUTClass.getField("the_system_mode").getInt(DriverCSP.SUT);
							int tempOutP = DriverCSP.SUTClass.getField("primed_the_coffee_machine_output").getInt(DriverCSP.SUT);
							int tempOutN = DriverCSP.SUTClass.getField("the_coffee_machine_output").getInt(DriverCSP.SUT);

/*							public int the_system_mode = 1;
							public int the_coffee_machine_output = 0;
							public float the_request_timer = 0;
							
							public int primed_the_system_mode = 1;
							public int primed_the_coffee_machine_output = 0;
							public float primed_the_request_timer = 0;
							
							public boolean old_the_coin_sensor = false;
							public boolean old_the_coffee_request_button = false;
*/							
							
							DriverCSP.SUTClass.getField("old_the_coin_sensor").setBoolean(DriverCSP.SUT, the_coin_sensor);
							DriverCSP.SUTClass.getField("old_the_coffee_request_button").setBoolean(DriverCSP.SUT, the_coffee_request_button);

							int temp1 = DriverCSP.SUTClass.getField("the_system_mode").getInt(DriverCSP.SUT);
							if ( temp1 != expected_the_system_mode ) {
//								System.out.println("ERRO1 (TC" + j + ", REQ" + k + "): " + temp1 + " x " + expected_the_system_mode);
								System.out.println("ERRO1 (TC" + j + "): " + temp1 + " x " + expected_the_system_mode);
								killed.add(i);
								aliveMutant = false;
								System.out.println(line);
//								System.out.println(tempButtonOld + " - " + tempButtonN + " - " + tempCoinOld + " - " + tempCoinN + " - " + tempTimerP + " - " + tempTimerN + " - " + tempModeP + " - " + tempModeN + " - " + tempOutP + " - " + tempOutN);
//								System.out.println(tempTimerP + " - " + tempTimerN + " - " + tempModeP + " - " + tempModeN + " - " + tempOutP + " - " + tempOutN);
								break;
							}
//							} else {
//								System.out.println("TC_VMint" + j);
//								System.out.println("TC" + j);
//							}
							
							int temp2 = DriverCSP.SUTClass.getField("the_coffee_machine_output").getInt(DriverCSP.SUT);
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
			buffer.append(strStart + " x " + strEnd + "\n" );
			buffer.append("Killed = " + KilledPercentual + "% (" + killed.size() + ")\n");
			buffer.append("Alive = " + AlivePercentual + "%\n");
			buffer.append("List = " + alive + "");
			
		    Writer output = new BufferedWriter(new FileWriter("Statistics.txt"));
		    try {
		      output.write( buffer.toString() );
		    }
		    finally {
		      output.close();
		    }			
		    
		    System.out.println("Finished!");			
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

}
