package javaPgm;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java IO - We use BufferedInputStream to read and FileOutputStream to write to the local file
		  try {
		        try (
		      
		        		BufferedInputStream in = new BufferedInputStream(new URL("file:///F:/Hi.txt").openStream());
		        //	FileOutputStream fileOutputStream = new FileOutputStream("pkslow.io.html")) {
		        		FileOutputStream fileOutputStream = new FileOutputStream("F:\\")) {
		            byte dataBuffer[] = new byte[1024];
		            int bytesRead;
		            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
		                fileOutputStream.write(dataBuffer, 0, bytesRead);
		                
		                System.out.println("Download complete");
		            }
		        } catch (Exception e) {
		            // handle exception
		        }
		    } catch (Exception e) {
		        throw new RuntimeException(e);

		    }
		
	}

}
