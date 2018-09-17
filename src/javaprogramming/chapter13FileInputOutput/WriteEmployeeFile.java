package javaprogramming.chapter13FileInputOutput;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class WriteEmployeeFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Path file = Paths.get("C:\\Users\\kleys\\OneDrive\\EclipseWorkSpace\\WriteEmployeeFile.txt");
		String[] array = new String[4];
		String s = "";
		String delimiter = ", ";
		String response = null;
		int id, hours;
		String name;
		double payRate, gross, total = 0;
		final int QUIT = 999;
		
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			System.out.print("Enter employee ID number >>> ");
			id = input.nextInt();
			while(id != QUIT) {
				System.out.print("Enter name for employee #" + id + " >>> ");
				input.nextLine();
				name = input.nextLine();
				System.out.print("Enter pay rate >>> ");
				payRate = input.nextDouble();
				System.out.print("Hours worked >>> ");
				hours = input.nextInt();
				s = id + delimiter + name + delimiter + payRate + delimiter + hours;
				writer.write(s, 0, s.length());
				writer.newLine();
				System.out.print("Enter next ID number or " + QUIT + " to quit >>> ");
				id = input.nextInt();
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Message: " + e);
		}
		
		try {
			System.out.print("Would you like to see the report? (yes/no) >>> ");
			response = input.next();
			input.nextLine();
			if(Character.toLowerCase(response.charAt(0)) == 'y') {
				InputStream in = new BufferedInputStream(Files.newInputStream(file));
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				s = reader.readLine();
				
				System.out.println("\nSimple report:");
				while(s != null) {
					System.out.println(s);
					s = reader.readLine();
				}
				
				System.out.println("\nAdvanced report:");
				while(s != null) {
					array = s.split(delimiter);
					id = Integer.parseInt(array[0]);
					name = array[1];
					payRate = Double.parseDouble(array[2]);
					hours = Integer.parseInt(array[3]);
					gross = payRate * hours;
					System.out.println("ID #" + id + "   " + name + "   " + "£" + payRate + "   " + "£" + gross);
					total += gross;
					s = reader.readLine();
				}
				reader.close();
			}
			
		} catch (Exception e) {
			System.out.println("Message2: " + e);
		}
		finally {
			System.out.println("    Total gross payroll is £" + total);
		}
	}

}
