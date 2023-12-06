
public class OrangeHRM_xpath {
	
	String login = "//button[text()=' Login ']";
	String username = "//input[@name='username']";
	String password = "//input[@name='password']";
	String dashboard = "//h6[text()='Dashboard']";
	String invalidCredentials ="//p[text()='Invalid credentials']";
	String required = "(//span[text()='Required'])[1]";
	String admin ="//span[text()='Admin']";
	String pim ="//span[text()='PIM']";
	String pim_actual="//h6[text()='PIM']";
	String leave ="//span[text()='Leave']";
	String leave_actual="//h6[text()='Leave']";
	String time ="//span[text()='Time']";
	String time_actual ="//h6[text()='Time']";
	String adminPage="//h6[text()='Admin'or text()='User Management']";
	String usernameBlank = "(//label[text()='Username']/following::span[text()='Required'])[1]";
    String passwordBlank = "//label[text()='Password']/following::span[text()='Required']";
	
}
