package fileHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		String findWord = "Technocredits";
		File file = new File("D://Readme.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line= br.readLine();
		//String st = reader.read();
		
		int cnt =0;
		while((line != null))
		{
			if(line.contains("Technocredits"))
				cnt++;
			
			line= br.readLine();
		}
		System.out.println(cnt);
	}
}
