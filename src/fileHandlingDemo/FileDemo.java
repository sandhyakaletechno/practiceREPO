package fileHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/sandhya.txt");
		FileReader reader = new FileReader(file);
		
		/*BufferedReader br = new BufferedReader(reader);
		String st;
		while((st=br.readLine())!=null)
		System.out.println(st);*/
		
		/*int i=0;
		while((i=reader.read())!= -1)
			System.out.print((char)i);*/
		
		

	}

}
