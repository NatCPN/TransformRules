import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class DriverTISCSP {

	private static final int numMutants = 1127;
//	private static final int numMutants = 0;
	private static final int numReq = 17;
	private static final int numTC = 3;

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
		
				System.out.println(i + " ");
				
				if ( i == 0 ) {
					DriverTISCSP.SUTClass = Class.forName("TIS");
				} else {
					DriverTISCSP.SUTClass = Class.forName("TIS" + i);
				}

				boolean aliveMutant = true;
				for (int k=1; k<=DriverTISCSP.numReq; k++) {
					if (!aliveMutant) {
						break;
					}
					for (int j=1; j<=DriverTISCSP.numTC; j++) {
						if (!aliveMutant) {
							break;
						}
						
						DriverTISCSP.SUT = DriverTISCSP.SUTClass.getConstructor().newInstance();						
				
						int TIME;
						int the_voltage;
						int the_turn_indicator_lever;
						int the_emergency_flashing;
						
						BufferedReader file = null; 
						String filename = "tcs/tc_REQ0";
						if (j >= 10) {
							filename += k;
						} else {
							filename += "0" + k;
						}
						filename += "_" + j + ".csv";

//						String filename = "C:/Users/Samanta/workspace/VMDFRS/test/output/reps_101/sim_";
//						String filename = "D:/Bruno/Mestrado/SCP2016/Revisao_Artigo_SCP/TIS/output/reps_21/sim_";
//						String filename = "D:/Bruno/Mestrado/SCP2016/Revisao_Artigo_SCP/TIS/output/reps_9/sim_";
//						String filename = "D:/Bruno/Mestrado/SCP2016/Revisao_Artigo_SCP/TIS/output/reps_32/sim_";
//						filename += j + "/TC.csv";
						
//						buffer.append("File: " + filename + "\n");
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
							
							String tokens[] = line.split(";");							
							
							if (tokens[0].startsWith("TIME")) {
								continue;
							}
							
							TIME = new Integer(tokens[0]);
//							the_emergency_flashing = new Integer(tokens[1]);
//							the_turn_indicator_lever = new Integer(tokens[2]);
//							the_voltage = new Integer(tokens[3]);
							the_voltage = new Integer(tokens[1]);
							the_turn_indicator_lever = new Integer(tokens[2]);
							the_emergency_flashing = new Integer(tokens[3]);
							
							int expected_the_indication_lights = new Integer(tokens[4]);
							int expected_the_flashing_mode = new Integer(tokens[5]);

							int the_flashing_mode = 0;

							int qtd = 0;
							while (qtd != 1000) {
								Object ret = DriverTISCSP.SUTClass.getMethod("run",
										int.class, int.class, int.class, int.class
										).invoke(DriverTISCSP.SUT,
												TIME, the_emergency_flashing, the_turn_indicator_lever, the_voltage);

//								int retIFn =
//										Driver.SUTClass.getField("ifN").getInt(Driver.SUT);

								int the_indication_lights =
										DriverTISCSP.SUTClass.getField("the_indication_lights").getInt(DriverTISCSP.SUT);
								the_flashing_mode =
										DriverTISCSP.SUTClass.getField("the_flashing_mode").getInt(DriverTISCSP.SUT);
								int the_flashing_timer =
										DriverTISCSP.SUTClass.getField("the_flashing_timer").getInt(DriverTISCSP.SUT);

								int primed_the_indication_lights =
										DriverTISCSP.SUTClass.getField("primed_the_indication_lights").getInt(DriverTISCSP.SUT);
								int primed_the_flashing_mode =
										DriverTISCSP.SUTClass.getField("primed_the_flashing_mode").getInt(DriverTISCSP.SUT);
								int primed_the_flashing_timer =
										DriverTISCSP.SUTClass.getField("primed_the_flashing_timer").getInt(DriverTISCSP.SUT);
								
								if (the_indication_lights == primed_the_indication_lights
										&& the_flashing_mode == primed_the_flashing_mode
										&& the_flashing_timer == primed_the_flashing_timer) {
//									System.out.println("Antes do ERROx:  " + the_indication_lights + "==" + primed_the_indication_lights
//											+" && "+ the_flashing_mode +"=="+ primed_the_flashing_mode
//											+" && "+ the_flashing_timer +"=="+ primed_the_flashing_timer +  " - TIME:" + TIME);
									break;
								} else {
//									System.out.println("Diff:  " + the_indication_lights + "==" + primed_the_indication_lights
//											+" && "+ the_flashing_mode +"=="+ primed_the_flashing_mode
//											+" && "+ the_flashing_timer +"=="+ primed_the_flashing_timer +  " - TIME:" + TIME + " - ifN= " + retIFn);

									if (the_flashing_mode != primed_the_flashing_mode) {
										DriverTISCSP.SUTClass.getField("old_the_flashing_mode").setInt(DriverTISCSP.SUT, the_flashing_mode);
									}
									
									DriverTISCSP.SUTClass.getField("the_indication_lights").setInt(DriverTISCSP.SUT, primed_the_indication_lights);
									DriverTISCSP.SUTClass.getField("the_flashing_mode").setInt(DriverTISCSP.SUT, primed_the_flashing_mode);
									DriverTISCSP.SUTClass.getField("the_flashing_timer").setInt(DriverTISCSP.SUT, primed_the_flashing_timer);									
								}								
								
								qtd++;
							}	
//							DriverTISCSP.SUTClass.getField("old_the_flashing_mode").setInt(DriverTISCSP.SUT, the_flashing_mode);
							
							DriverTISCSP.SUTClass.getField("old_the_voltage").setInt(DriverTISCSP.SUT, the_voltage);
							DriverTISCSP.SUTClass.getField("old_the_turn_indicator_lever").setInt(DriverTISCSP.SUT, the_turn_indicator_lever);
							DriverTISCSP.SUTClass.getField("old_the_emergency_flashing").setInt(DriverTISCSP.SUT, the_emergency_flashing);
							
							int temp1 = DriverTISCSP.SUTClass.getField("the_indication_lights").getInt(DriverTISCSP.SUT);
							if ( temp1 != expected_the_indication_lights ) {
								System.out.println("ERRO1 (TC" + j + ", REQ" + k + "): " + temp1 + " x " + expected_the_indication_lights);
//								System.out.println("ERRO1 (TC" + j + "): " + temp1 + " x " + expected_the_indication_lights);
								killed.add(i);
								aliveMutant = false;
//								System.out.println(line);
								break;
							}
//							} else {
//							System.out.println("TC_VMint" + j);
//							System.out.println("TC" + j);
//						}
							
							int temp2 = DriverTISCSP.SUTClass.getField("the_flashing_mode").getInt(DriverTISCSP.SUT);
							if ( temp2 != expected_the_flashing_mode ) {
								System.out.println("ERRO2 (TC" + j + ", REQ" + k + "): " + temp2 + " x " + expected_the_flashing_mode);
//								System.out.println("ERRO2 (TC" + j + "): " + temp2 + " x " + expected_the_flashing_mode);
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
//				}
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
