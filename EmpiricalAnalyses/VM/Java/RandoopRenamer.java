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
public class RandoopRenamer {
	
	private static String NEW_FILE_CONTENT = "";

	private static String CLASS_NAME = "VM";
	public static String DIRECTORY = "C:\\Users\\Samanta\\workspace\\NAT2TEST_Phases1_2_3_4\\VM";	
	private static int MUTANTS = 283;
	
	private static File file = null;
	private static File[] randoopFiles = new File(DIRECTORY + "/src/randoop/").listFiles();
	
	private static void replicateRandoopClasses() {
		String temp = DIRECTORY + "/src/randoop";
		for (int i=1; i<=MUTANTS; i++) {
			file = new File(temp + i + "/");
			file.mkdir();
			renameClasses(i);
			copyMutant(i);
		}
	}
	
	private static void copyMutant(int i) {
		file = new File(DIRECTORY + "/src/" + CLASS_NAME + i + ".java");
		
		try {
			s = new Scanner(file);
			line = "";
			buffer = new StringBuffer();
			buffer.append("package randoop" + i + ";" + "\n");
			
			while (s.hasNextLine()) {
				line = s.nextLine();
				buffer.append(line + "\n");
			}
			
			NEW_FILE_CONTENT = buffer.toString();
			writeFile(i, CLASS_NAME + i + ".java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	private static void renameClasses(int i) {
		int length = randoopFiles.length;
		for (int j=0; j<length; j++) {
			if (!randoopFiles[j].isHidden()) {
				if (randoopFiles[j].getName().startsWith("RandoopTest")) {
					buildNewContentFile(i, randoopFiles[j]);
					writeFile(i, randoopFiles[j].getName());	
				}
			}
		}
	}
	
	private static Scanner s = null;
	private static String line = null;
	private static StringBuffer buffer = null;
	private static String namePattern = CLASS_NAME + "();";
	private static String newName = null;
	public static void buildNewContentFile(int i, File file) {
		try {
			s = new Scanner(file);
			line = "";
			buffer = new StringBuffer();
			newName = CLASS_NAME + i;
			
			while (s.hasNextLine()) {
				line = s.nextLine();
				if (line.startsWith("package randoop")) {
					buffer.append("package randoop" + i + ";\n");
				} else if (line.endsWith(namePattern)) {
					buffer.append(line.replace(CLASS_NAME, newName));
					buffer.append("\n");
				} else {
					buffer.append(line + "\n");
				}
			}
			
			NEW_FILE_CONTENT = buffer.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private static FileOutputStream fos = null;
	public static void writeFile(int i, String className) {
		try {
			fos = new FileOutputStream(
					DIRECTORY + "/src/randoop" + i + "/" + className);			
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
		RandoopRenamer.printHour();
		replicateRandoopClasses();
		RandoopRenamer.printHour();
	}

}
