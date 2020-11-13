package com.main;

import java.io.FileReader;
import java.io.IOException;

import com.service.LongestWord;

/**
 * Write a Java program to find the longest word in a text file
 * 
 * @author Lakshmi Neeharika
 *
 */
public class LongestWordMain {

	public static void main(String[] args) {
		FileReader fileReader = null;
		LongestWord longestWord = null;
		try {
			fileReader = new FileReader("C:\\Users\\vasuvaddi123\\Desktop\\HCL\\test.txt");
			longestWord = new LongestWord();
			System.out.println("Longest: " + longestWord.findLongest(fileReader));
			fileReader.close();
		} catch (IOException e) {
			System.err.println(e.toString());
		} finally {
			fileReader = null;
			longestWord = null;
		}

	}

}
