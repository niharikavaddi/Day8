package com.service;

import java.io.FileReader;
import java.io.IOException;

public class PatternDisplay {
	public int[] seachPattern(FileReader fileReader, String[] data) throws IOException {
		StringBuffer pattern = new StringBuffer();
		int num;
		int[] result = new int[data.length];
		while ((num = fileReader.read()) != -1) {
			pattern.append((char) num);
		}
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < (pattern.length() - data[i].length()); j++) {
				if (data[i].equalsIgnoreCase((pattern.substring(j, j + data[i].length())))) {
					count++;
				}
			}
			result[i] = count;
			count = 0;
		}
		return result;
	}
}
