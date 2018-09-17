package javaprogramming.chapter13FileInputOutput;

import java.io.*;

public class ScreenOut {

	public static void main(String[] args) {
		String s = "ABCDF";
		byte[] data = s.getBytes();
		OutputStream output = null;
		
		try {
			output = System.out;
			output.write(data); //it writes all the bytes to the output stream from the specified byte array
			output.flush(); //it flushes the output stream; if any bytes are buffered, they will be written
			output.close(); //it closes the output stream and releases any system resources
		}
		catch (Exception e) {
			System.out.println("Message: " + e);
		}
	}
}
