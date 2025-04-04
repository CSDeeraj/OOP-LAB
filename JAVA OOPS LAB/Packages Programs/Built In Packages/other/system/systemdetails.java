package systeminfo;
import java.lang.management.ManagementFactory;

public class systemdetails {
	public static void main(String[] args) {
		long uptime = ManagementFactory.getRuntimeMXBean().getUptime();
		System.out.println("system uptime in milliseconds: " + uptime);
	}
}