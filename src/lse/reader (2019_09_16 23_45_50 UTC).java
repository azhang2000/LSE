package lse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class reader {
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter docsFile name");
		String docsFile = sc.nextLine();
		System.out.println("Enter noisefile name");
		String noiseFile = sc.nextLine();
		
		LittleSearchEngine search = new LittleSearchEngine();
		search.makeIndex(docsFile,noiseFile);
		
		ArrayList <String> top5 = new ArrayList<String>();
		top5=search.top5search("red", "orange");
		
		for(String s: top5)
		{
			System.out.println(s);
		}
	}
}
