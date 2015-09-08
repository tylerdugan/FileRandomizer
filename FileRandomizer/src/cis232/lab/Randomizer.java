package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		ArrayList<String> random = new ArrayList<>();
		
		//Fills first ArrayList
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}
		
		int original = lines.size();
		
		//Random Object
		Random ranNum = new Random();
		
		for(int i = 0; i < original; i++){
			int num = ranNum.nextInt(lines.size());
			String name = lines.get(num);
			
			//Write to new Array
			random.add(name);
			
			//Remove from lines ArrayList
			lines.remove(num);			
		}

		//For testing purposes, output all the lines
		for(String line : random){
			System.out.println(line);
		}
		
		input.close();
	}

}
