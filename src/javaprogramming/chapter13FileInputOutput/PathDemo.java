package javaprogramming.chapter13FileInputOutput;

import java.nio.file.*;

public class PathDemo {
	public static void main(String[] args) {
		Path filePath = Paths.get("C:\\Java\\Chapter13\\Data.txt");
		int count = filePath.getNameCount();
		
		System.out.println("Path is " + filePath.toString());
		System.out.println("File name is " + filePath.getFileName());
		System.out.println("There are " + count + " elements in the file path");
		for(int i = 0; i < count; ++i)
			System.out.println("Element " + (i+1) + " is " + filePath.getName(i));
	}
}
