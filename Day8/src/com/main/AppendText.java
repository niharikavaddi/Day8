package com.main;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileWriter;

/**
 * Write a Java program to append text to an existing file
 * 
 * @author Lakhsmi Neeharika
 *
 */
public class AppendText {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BufferedWriter bufferedWriter = null;
		DataInputStream dataInputStream = null;
		try {
			bufferedWriter = new BufferedWriter(
					new FileWriter("C:\\Users\\vasuvaddi123\\Desktop\\HCL\\test.txt", true));
			System.out.println("Enter Data");
			dataInputStream = new DataInputStream(System.in);
			bufferedWriter.write(dataInputStream.readLine());
			bufferedWriter.write(" ");
			bufferedWriter.close();
			System.out.println("Done!");
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			bufferedWriter = null;
			dataInputStream = null;
		}

	}

}
