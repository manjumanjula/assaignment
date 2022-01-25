package lastone;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class TestCases {

	Patient p = new Patient();
	BusinessLogic b = new BusinessLogic();
	GitDownloadFiles g = new GitDownloadFiles();
	
	
	@Test
	public void billTest() {

		int Sbill = Integer.parseInt(GitDownloadFiles.temp[2]);
		p.setBill(Sbill);
		int bill = b.totalBill(p);
		assertEquals(67890, bill);

	}

	@Test
	public void doctorTest() {
		p.setDoctor(GitDownloadFiles.temp[0]);
		String doctor = b.doctorName(p);
		assertEquals("Manjula", doctor);

	}



	@Test
	public void medicineTest() {
		p.setDoctor(GitDownloadFiles.temp[1]);
		String medicine = b.doctorName(p);
		assertEquals("Polo 650", medicine);

	}

}
