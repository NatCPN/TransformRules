import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 *
 */
public class Renamer {
	
	private static int[] list = {};	
	
	private static String NEW_FILE_CONTENT = "";
	private static String CLASS_NAME = "";
	private static String DIRECTORY = "";
	
	private static int SEQUENCE = 0;
	
	private static boolean isInList() {
		for (int element : Renamer.list) {
			if (element == Renamer.SEQUENCE) {
				return true;
			}
		}
		return false;
	}	
	
	/**
	 * @param file
	 */
	public static void renameClasses(File file) {
		File[] files = file.listFiles();
		
		for (File child : files) {
			if (!child.isHidden()) {
				if (child.isDirectory()) {
					Renamer.renameClasses(child);
				} else if (child.getName().endsWith(".java")) {
					SEQUENCE = SEQUENCE + 1;
					NEW_FILE_CONTENT = "";
					if (Renamer.isInList()) {
						System.out.println("File " + SEQUENCE
								+ " -> " + child.getAbsolutePath());
					}
					Renamer.buildNewContentFile(child);
					Renamer.writeFile();	
				}
			}
		}
	}
	
	/**
	 * @param file
	 */
	public static void buildNewContentFile(File file) {
		
		try {
			Scanner s = new Scanner(file);
			String line = "";
			String token = "";
			String previous = "";
			String next = "";
			StringTokenizer st = new StringTokenizer("");
			boolean classDefinitionFounded = false;
			
			
			//Read file lines.
			while (s.hasNextLine() && !classDefinitionFounded) {
				
				line = s.nextLine();
				st = new StringTokenizer(line);
				token = "";
				previous = "";
				next = "";
				
				//Read tokens of one line searching for public class token.
				while (st.hasMoreTokens() && !classDefinitionFounded) {
					
					next = st.nextToken();
					
					if (!token.equalsIgnoreCase("")) {
						int index = token.indexOf(" ");
						if (index == -1) {
							index = 0;
						}
						
						previous = token.substring(index, token.length());
						token = previous + " " + next;
					} else {
						token = next;
					}
			
					if (token.trim().equalsIgnoreCase("public class")) {
						classDefinitionFounded = true;
					}
					
					NEW_FILE_CONTENT += next + " ";
				}
				
				if (st.hasMoreTokens()) {
					CLASS_NAME = st.nextToken();
	
					if (CLASS_NAME.trim().endsWith("{")) {
						CLASS_NAME = CLASS_NAME.substring(0, CLASS_NAME.length()-1);
					}
					
					NEW_FILE_CONTENT += CLASS_NAME + SEQUENCE;
				}
				
				NEW_FILE_CONTENT += "\n";
			}
			
			while (s.hasNextLine()) {
				NEW_FILE_CONTENT += s.nextLine() + "\n";
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public static void writeFile() {
		try {
			FileOutputStream fos = new FileOutputStream(
					DIRECTORY.substring(0, DIRECTORY.lastIndexOf("\\")) + "\\output\\" + 
					CLASS_NAME + SEQUENCE + ".java");
			
			fos.write(NEW_FILE_CONTENT.getBytes());
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public static void printHour() {
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.get(GregorianCalendar.HOUR_OF_DAY) + ":" +
				gc.get(GregorianCalendar.MINUTE) + ":" +
				gc.get(GregorianCalendar.SECOND) + ":" +
				gc.get(GregorianCalendar.MILLISECOND));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Renamer.printHour();
//		Renamer.DIRECTORY = "/home/ghpc/Desktop/Bruno/MuJava/result/VM/traditional_mutants";
		Renamer.DIRECTORY = "D:\\Bruno\\Mestrado\\Dissertacao\\Analise_empirica\\Bruno\\MuJava\\result\\VM\\traditional_mutants";
		
		File f = new File(DIRECTORY.substring(0, DIRECTORY.lastIndexOf("\\")) + "\\output\\");
		f.mkdir();
		
		Renamer.renameClasses(new File(DIRECTORY));
		Renamer.printHour();
		
	}

}
