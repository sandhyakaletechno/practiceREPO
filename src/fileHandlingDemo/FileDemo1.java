package fileHandlingDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader(new File("D://Readme.txt"));
		Scanner sc = new Scanner(reader);
		String line = sc.nextLine();
		while((sc.hasNextLine()))
		{
			System.out.println(line);
			if(line.contains("Technocredits"))
				cnt++;
			
			//line =sc.next();
			line= sc.nextLine();
			System.out.println(line);
		}
		
		System.out.println(cnt);
	}
}
