package javaprogramming.chapter13FileInputOutput;

import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;

public class PathDemo3 {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		
		Path filePath = Paths.get("C:" + fs.getSeparator() + "Java" + fs.getSeparator() + "Chapter13" + fs.getSeparator() + "Data.txt");
		//Path filePath = Paths.get("C:" + fs.getSeparator() + "Users" + fs.getSeparator() + "kleys" + fs.getSeparator() + "OneDrive" + fs.getSeparator() + "EclipseWorkSpace" + fs.getSeparator() + "JavaProgramming" + fs.getSeparator() + "src" + fs.getSeparator() + "Chapter13FileInputOutput" + fs.getSeparator() + "FileOut.txt");
		
		System.out.println("Path is " + filePath.toString());
		
		try
		{
			filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
			System.out.println("File can be read and executed");
		}
		catch (IOException e)
		{
			System.out.println("File cannot be used for this application.");
		} 
	}
}