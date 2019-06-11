package fileHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindFreqOfWord {
	static int cnt =0;
	public static void findMatchingWord(String line, String word)
	{
		String[] temp = line.split(" ");
		
		for(String currentWord : temp)
		{
			if(currentWord.contains(word) && !currentWord.equals(word))
			{
				currentWord = currentWord.replace(".", " ").replace(",", " ").replace("!", " ");
				String[] tempSplit = currentWord.split(" ");
				for(String s : tempSplit){
					if(s.equals(word))
						cnt++;
				}
			}
			if(currentWord.equals(word))
				cnt++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter word ");
		Scanner sc = new Scanner(System.in);
		String findWord = sc.next();
		File file = new File("D://Readme.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line= br.readLine();
		while((line != null))
		{
			if(line.contains("Technocredits"))
				findMatchingWord(line,"Technocredits");
			
			line= br.readLine();
		}
		System.out.println(cnt);
	}
}
