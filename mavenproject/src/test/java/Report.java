
public class Report {
	public void report
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporterType);
	
	ExtentAventReporter avent = new ExtentAventReporter("/user/build/");
	ExtentKlovReporter klov = new ExtentKlovReporter("project", "build");

	ExtentReports extent = new ExtentReports();
	extent.attachReporter(avent);
	extent.attachReporter(klov);

	// or:
	extent.attachReporter(avent, klov);



}
