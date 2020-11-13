package com.main;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Write a java program to record the player details into the file. Get the
 * player details name, teamName and number of matches played from the user and
 * write those information in a comma seperated format (CSV).
 * 
 * @author Lakshmi Neeharika
 *
 */
public class PlayerDetails {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DataInputStream dataInputStream = null;
		FileOutputStream outputStream = null;
		File file = null;
		try {
			file = new File("C:\\Users\\vasuvaddi123\\Desktop\\HCL\\test.csv");
			file.createNewFile();
			char c = ',';
			System.out.println("File Created");
			outputStream = new FileOutputStream(file);
			dataInputStream = new DataInputStream(System.in);
			System.out.println("Player's Name: ");
			outputStream.write(dataInputStream.readLine().getBytes());
			outputStream.write(c);
			System.out.println("Player's Team Name: ");
			outputStream.write(dataInputStream.readLine().getBytes());
			outputStream.write(c);
			System.out.println("No. of Matches: ");
			outputStream.write(Integer.parseInt(dataInputStream.readLine()));
			outputStream.write(c);
			System.out.println("Updated successfully");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			dataInputStream = null;
			outputStream = null;
			file = null;
		}

	}

}
