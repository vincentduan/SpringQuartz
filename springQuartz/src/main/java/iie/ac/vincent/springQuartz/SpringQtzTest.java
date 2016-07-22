package iie.ac.vincent.springQuartz;

import java.util.Date;

public class SpringQtzTest {
	private static int counter = 0;
	protected void execute() {
		long ms = System.currentTimeMillis();
		System.out.println("\t\t" + new Date(ms));
		System.out.println("(" + counter++ + ")");
	}
}
