package lastone;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class GitFileRead {

	public static final String delimiter = ",";

	public static String[] read(String csvFile) {
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String[] tempArr;
			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				
				/*System.out.println(tempArr[0]);
				System.out.println(tempArr[1]);
				System.out.println(tempArr[2]);*/
				
				return tempArr;
				
			}
			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
	
		}
		return null;
		
	
	}

}
