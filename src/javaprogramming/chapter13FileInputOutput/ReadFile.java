package javaprogramming.chapter13FileInputOutput;

import java.nio.file.*;
import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\kleys\\OneDrive\\EclipseWorkSpace\\JavaProgramming\\src\\Chapter13FileInputOutput\\Test.txt");
		//InputStream input = null;
		
		try {
			//input = Files.newInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(file)));
			String s = null;
			
			while(reader.ready()) {
				s = reader.readLine();
				System.out.println(s);
			}
			//input.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
