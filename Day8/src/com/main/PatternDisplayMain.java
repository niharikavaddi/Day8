package com.main;

import java.io.FileReader;
import java.util.Scanner;

import com.service.PatternDisplay;

/**
 * Write a java program to read the input character stream and identify patterns
 * provided by the user. As the program output display the number of times the
 * pattern occurred in the input character stream.
 * 
 * Read the character stream from the input file (team.txt) that contains the
 * team names and display the output in the console.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class PatternDisplayMain {

	public static void main(String[] args) {
		Scanner scanner = null;
		FileReader fileReader = null;
		PatternDisplay patternDisplay = null;
		try {
			fileReader = new FileReader("C:\\Users\\vasuvaddi123\\Desktop\\HCL\\team.txt");
			scanner = new Scanner(System.in);
			System.out.println("Enter number of words:");
			int size = scanner.nextInt();
			String[] data = new String[size];
			System.out.println("Enter the strings to be searched: ");
			for (int i = 0; i < size; i++) {
				data[i] = scanner.next();
			}
			patternDisplay = new PatternDisplay();
			int[] result = patternDisplay.seachPattern(fileReader, data);
			for (int i = 0; i < data.length; i++) {
				System.out.println("Word: " + data[i] + ", Count:" + result[i]);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			fileReader = null;
			scanner = null;
			patternDisplay = null;
		}

	}

}
