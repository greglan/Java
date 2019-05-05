package examples;
import java.io.*;


/**
 * This class demonstrate the use of files in Java
 */
public class FileExample {
	/**
	 * Text files only
	 * @param filename
	 */
	private static void fileWriterExample(String filename) {
		try {
			// Assume default encoding.
			FileWriter fileWriter =	new FileWriter(filename);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter bufferedWriter =	new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			bufferedWriter.write("Hello there,");
			bufferedWriter.write(" here is some text.");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writing");
			bufferedWriter.write(" the text to the file.");

			// Always close files.
			bufferedWriter.close();
		}
		catch(IOException e) {
			System.out.println("Error writing to file '" + filename + "'");
			e.printStackTrace();
		}
	}

	/**
	 * Text files only
	 * @param filename
	 */
	private static void fileReaderExample(String filename) {
		String line;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader =	new FileReader(filename);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Unable to open file '" + filename + "'");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Error reading file '"	+ filename + "'");
			e.printStackTrace();
		}
	}


	/**
	 * Works on all files
	 * @param filename
	 */
	private static void fileOutputStreamExample(String filename) {

	}

	/**
	 * Works on all files
	 * @param filename
	 */
	private static void fileInputStreamExample(String filename) {

	}

	public static void main(String[] args) {
		fileWriterExample("file_test.txt");
		fileReaderExample("file_test.txt");
	}
}
