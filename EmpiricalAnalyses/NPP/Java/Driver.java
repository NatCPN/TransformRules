import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Driver {

//	private static final int numMutants = 0;
	private static final int numMutants = 319;
	private static final int numReq = 11;
//	private static final int numTC = 5;
	private static final int numTC = 36;

	private static Class SUTClass = null;
	private static Object SUT = null;
	
	public static void main(String[] args) throws IOException {
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
					Driver.SUTClass = Class.forName("NPP");
				} else {
					Driver.SUTClass = Class.forName("NPP" + i);
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
				
						boolean the_reset_button;
						boolean the_blockage_button;
						int the_water_pressure;
						
						BufferedReader file = null; 
//						String filename = "tcs/TC";
//						filename +=  j + ".csv";
//						String filename = "tcs/tc_REQ0";
//						if (k >= 10) {
//							filename += k;
//						} else {
//							filename += "0" + k;
//						}
//						filename += "_" + j + ".csv";
						
						String filename = "C:/Users/Samanta/workspace/VMDFRS/test/output/reps_142/sim_";
						filename += j + "/TC.csv";
						
//						System.out.println(filename);
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
//							System.out.println(line);
							
							String tokens[] = line.split(";");							
							
							if (tokens[0].startsWith("TIME")) {
								continue;
							}
							
//							the_reset_button = new Boolean(tokens[1]);
//							the_blockage_button = new Boolean(tokens[2]);
//							the_water_pressure = new Integer(tokens[3]);
							the_reset_button = new Boolean(tokens[3]);
							the_blockage_button = new Boolean(tokens[1]);
							the_water_pressure = new Integer(tokens[2]);
							
							int expected_c__the_safety_injection_mode = new Integer(tokens[4]);

//							System.out.println("*" + line);
							
							int qtd = 0;
							while (qtd != 1000) {
								Object ret = Driver.SUTClass.getMethod("run",
										boolean.class, int.class, boolean.class
										).invoke(Driver.SUT,
												the_blockage_button,
												the_water_pressure, the_reset_button);									

								int primed_the_safety_injection_mode =
										Driver.SUTClass.getField("primed_the_safety_injection_mode").getInt(Driver.SUT);
								boolean primed_the_overridden_mode =
										Driver.SUTClass.getField("primed_the_overridden_mode").getBoolean(Driver.SUT);
								int primed_the_pressure_mode =
										Driver.SUTClass.getField("primed_the_pressure_mode").getInt(Driver.SUT);

								int the_safety_injection_mode =
										Driver.SUTClass.getField("the_safety_injection_mode").getInt(Driver.SUT);
								boolean the_overridden_mode =
										Driver.SUTClass.getField("the_overridden_mode").getBoolean(Driver.SUT);
								int the_pressure_mode =
										Driver.SUTClass.getField("the_pressure_mode").getInt(Driver.SUT);
								
								if (primed_the_safety_injection_mode == the_safety_injection_mode
										&& primed_the_overridden_mode == the_overridden_mode
										&& primed_the_pressure_mode == the_pressure_mode) {
//									System.out.println(primed_the_safety_injection_mode + " - " + the_safety_injection_mode + " - " + 
//											 primed_the_overridden_mode + " - " + the_overridden_mode + " - " + 
//											 primed_the_pressure_mode + " - " + the_pressure_mode); 
									break; 
								} else {
									Driver.SUTClass.getField("old_the_pressure_mode").setInt(Driver.SUT, the_pressure_mode);

									Driver.SUTClass.getField("the_safety_injection_mode").setInt(Driver.SUT, primed_the_safety_injection_mode);
									Driver.SUTClass.getField("the_overridden_mode").setBoolean(Driver.SUT, primed_the_overridden_mode);
									Driver.SUTClass.getField("the_pressure_mode").setInt(Driver.SUT, primed_the_pressure_mode);
								} 
														
								qtd++;
							}	
							
							Driver.SUTClass.getField("old_the_blockage_button").setBoolean(Driver.SUT, the_blockage_button);
							Driver.SUTClass.getField("old_the_water_pressure").setInt(Driver.SUT, the_water_pressure);
							Driver.SUTClass.getField("old_the_reset_button").setBoolean(Driver.SUT, the_reset_button);							
							
							int temp1 = Driver.SUTClass.getField("the_safety_injection_mode").getInt(Driver.SUT);
							if ( temp1 != expected_c__the_safety_injection_mode ) {
//								System.out.println("ERRO2 (TC" + j + ", REQ" + k + "): " + temp1 + " x " + expected_c__the_safety_injection_mode);
								System.out.println("ERRO3 (TC" + j + "): " + temp1 + " x " + expected_c__the_safety_injection_mode);
								killed.add(i);
								aliveMutant = false;
//								System.out.println(line);
								break;
							}
							
//							boolean expected_c__the_overriden_mode = new Boolean(tokens[5]);
							boolean expected_c__the_overriden_mode = new Boolean(tokens[6]);
							boolean temp2 = Driver.SUTClass.getField("the_overridden_mode").getBoolean(Driver.SUT);
							if ( temp2 != expected_c__the_overriden_mode ) {
//								System.out.println("ERRO2 (TC" + j + ", REQ" + k + "): " + temp2 + " x " + expected_c__the_overriden_mode);
								System.out.println("ERRO2 (TC" + j + "): " + temp2 + " x " + expected_c__the_overriden_mode);
								killed.add(i);
								aliveMutant = false;		
//								System.out.println(line);
								break;
							}							
							
//							int expected_c__pressure_mode = new Integer(tokens[6]);
							int expected_c__pressure_mode = new Integer(tokens[5]);
							int temp3 = Driver.SUTClass.getField("the_pressure_mode").getInt(Driver.SUT);
							if ( temp3 != expected_c__pressure_mode ) {
//								System.out.println("ERRO2 (TC" + j + ", REQ" + k + "): " + temp3 + " x " + expected_c__pressure_mode);
								System.out.println("ERRO1 (TC" + j + "): " + temp3 + " x " + expected_c__pressure_mode);
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
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

}
