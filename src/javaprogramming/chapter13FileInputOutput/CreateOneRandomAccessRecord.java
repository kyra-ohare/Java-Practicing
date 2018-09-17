package javaprogramming.chapter13FileInputOutput;

import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;

public class CreateOneRandomAccessRecord {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\kleys\\OneDrive\\EclipseWorkSpace\\JavaProgramming\\src\\Chapter13FileInputOutput\\RandomEmployees.txt");
		String s = "002, Newmann, 12.25" + System.getProperty("line.separator");
		final int RECSIZE = s.length();
		byte[] data = s.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(data);
		FileChannel fc = null;
		
		try {
			fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
			fc.position(2 * RECSIZE);
			fc.write(buffer);
			fc.close();
		}
		catch (Exception e) {
			System.out.println("Error message: " + e);
		}
	}

}
