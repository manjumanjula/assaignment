package lastone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class GitDownloadFiles {

	static String[] temp;

	public static void main(String[] args) throws InvalidRemoteException, TransportException, GitAPIException {

		String repositoryLink = "https://github.com/manjumanjula/assaignment.git";
		String directory = "C:\\Users\\gari.manjula.SHLX0175\\NewEclipse\\GetGitFiles\\NewFolder";
		Git.cloneRepository().setURI(repositoryLink).setDirectory(new File(directory)).call();
		System.out.println("Successfully downloaded the Book1.csv File!");

		String csvFile = "C:\\Users\\gari.manjula.SHLX0175\\NewEclipse\\GetGitFiles\\NewFolder\\Book1.csv";
		GitFileRead t = new GitFileRead();
		temp = t.read(csvFile);

		Result res = JUnitCore.runClasses(TestSuite.class);
		System.out.println("Total Tests Run are " + res.getRunCount());

		for (Failure f : res.getFailures()) {
			System.out.println("Failure is " + f.toString());
		}
		System.out.println("Total Test Result is " + res.wasSuccessful());

	}

}
