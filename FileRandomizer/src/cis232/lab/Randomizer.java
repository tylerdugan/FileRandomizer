package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}

		//For testing purposes, output all the lines
		for(String line : lines){
			System.out.println(line);
		}
		
		input.close();
	}

}
