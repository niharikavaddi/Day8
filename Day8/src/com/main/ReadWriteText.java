package com.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Write a Java program to write and read a plain text fil
 * 
 * @author Lakshmi Neeharika
 *
 */
public class ReadWriteText {
	public static void main(String[] args) {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		Scanner scanner = null;
		try {
			fileWriter = new FileWriter("C:\\Users\\vasuvaddi123\\Desktop\\javatest.txt");
			scanner = new Scanner(System.in);
			System.out.println("Enter data:");
			String str = scanner.nextLine();
			for (int i = 0; i < str.length(); i++)
				fileWriter.write(str.charAt(i));
			fileWriter.flush();
			fileReader = new FileReader("C:\\Users\\vasuvaddi123\\Desktop\\javatest.txt");
			int data = 0;
			while ((data = fileReader.read()) != -1) {
				System.out.print((char) data);
			}
			fileReader.close();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			fileReader = null;
			fileWriter = null;
			scanner.close();
			scanner = null;
		}

	}

}
