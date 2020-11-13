package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a Java program by using BufferedReader class to prompt a user to input
 * his/her name and then the output will be shown
 * 
 * @author Lakshmi Neeharika
 *
 */
public class PrintText {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Name: " + bufferedReader.readLine());
		} catch (IOException e) {
			System.err.println(e.toString());
		} finally {
			bufferedReader = null;
		}

	}

}
