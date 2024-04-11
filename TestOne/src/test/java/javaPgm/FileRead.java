package javaPgm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class FileRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fileName = "F:\\Hi.txt";
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String nn = br.readLine();

		System.out.println(nn);

		String line;
		while ((line = br.readLine()) != null) {
			// process the line
			System.out.println(line);
		}
		br.close();
	}

}
