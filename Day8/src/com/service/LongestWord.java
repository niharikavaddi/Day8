package com.service;

import java.io.FileReader;
import java.io.IOException;

public class LongestWord {
	public String findLongest(FileReader file) throws IOException {
		String result = "";
		StringBuffer str = new StringBuffer("");
		int data;
		while ((data = file.read()) != -1) {
			if ((char) data != ' ') {
				str.append((char) data);
			} else {
				if (str.length() > result.length()) {
					result = str.toString();
				}
				str.delete(0, str.length());
			}
		}
		if (str.length() > result.length())
			return str.toString();
		else
			return result;

	}
}
