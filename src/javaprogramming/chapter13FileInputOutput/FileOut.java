package javaprogramming.chapter13FileInputOutput;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\kleys\\OneDrive\\EclipseWorkSpace\\JavaProgramming\\src\\Chapter13FileInputOutput\\FileOut.txt");
		String s = "Kleyton Soares";
		byte[] data = s.getBytes();
		OutputStream output = null;
		
		try {
			output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			output.write(data);
			output.flush();
			output.close();
		}
		catch (Exception e) {
			System.out.println("Message: " + e);
		}
	}
}
