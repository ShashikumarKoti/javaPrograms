package com.skoti.learning.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddStringToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter= null;
		BufferedWriter bufferedWriter = null;
		PrintWriter printWriter= null;
	try {	
		fileWriter = new FileWriter("S:\\Learning\\javaPrograms\\javaPrograms\\Strings\\input.txt");
		bufferedWriter = new BufferedWriter(fileWriter);
		printWriter = new PrintWriter(bufferedWriter);
		
		 //Bringing cursor to next line
		printWriter.println();
		
		printWriter.println("Shashi: 2379813");
		printWriter.println("ShashiHCL: 51617688");
	}catch(IOException e) {
		
	}finally {
		printWriter.close();
		bufferedWriter.close();
		fileWriter.close();
	}
		
	}

}
