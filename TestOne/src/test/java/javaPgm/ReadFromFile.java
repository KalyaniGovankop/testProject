package javaPgm;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//InputStream inputStream = new URL("https://www.dwsamplefiles.com/?dl_id=176").openStream();
	/*	InputStream inputStream = new URL("file:///F:/Hi.txt").openStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		
		String count1 = bufferedReader.readLine();
		System.out.println(count1);
		
		Long count = bufferedReader.lines().filter(line -> line.contains("general")).count();
		System.out.println("No. of matching words : " + count);*/
		
		URL url = new URL("file:///F:/Hi.txt");
		Scanner s = new Scanner(url.openStream());
		while(s.hasNextLine()) {
			String data = s.nextLine();
			System.out.println(data);
		}
		
	}

}
