package com.main;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Write a Java program to read first 3 lines from a file
 * 
 * @author Lakshmi Neeharika
 *
 */
public class FirstThreeLines {

	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("C:\\Users\\vasuvaddi123\\Desktop\\javatest.txt");
			bufferedReader = new BufferedReader(fileReader);
			for (int i = 0; i < 3; i++) {
				System.out.println(bufferedReader.readLine());
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			fileReader = null;
			bufferedReader = null;
		}

	}

}
