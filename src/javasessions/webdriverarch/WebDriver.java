package javasessions.webdriverarch;

public interface WebDriver {
	
	// This interface simulates the real world webdriver interface
	// present in the selenium library and tries to show
	// that "Why webdriver should be an Interface or not a class or an Abstract class? (INTERVIEW QUESTION)
    
	// ANS:
	// What is a webdriver in real world? 
	// A webdriver is just a logical entity that can
	// provide a set of rules on how the specific browsers should be launched
	// and what actions user can perform like click, send keys etc. It
	// cannot and must not take any decision on actual implementation.
	
	// Now, its the actual browser driver's responsibility to provide
	// an implementation of those rules on how to launch
	// a browser, how to perform user actions like click, send keys etc.
	// because every browser driver is provided by different companies/vendors like
	// Google provides Chrome, Mozilla provides Firefox, Apple provides safari,
	// Microsoft provides Edge / IE etc. every browser has it's 
	// own implementation. So, it's the actual browser driver that 
	// should have the logic not the logical webdriver that just defines the rules.
	// So, WebDriver should be an interface to just provide overall idea about
	// the functionalities (Abstraction).
	
	// But we can achieve Abstraction by creating
	// webdriver as an Abstract class also. Then
	// why to design it as an interface only?
	// Because webdriver cannot decide what functionalities
	// to implement and how to implement them at all in the real world
	// as it is just a logical entity.
	// So, every feature of the webdriver will be differently implemented for
	// each and every browser. That is why it is the browser driver
	// class's responsibility to implement each and every feature in their own way.
	// Hence, webdriver should not contain even a single implementation of any
	// feature (as it cannot decide). That is why it is designed as an interface not
	// an Abstract class (because abstract class could provide implementations to some features).
	
	// ADVANTAGE of having webdriver as an interface:
	// All child classes implementing the interface can use exactly
	// same set of methods and implement in their own way. In that way
	// webdriver will not have to implement the logic for any of the
	// user action like launch browser, click element, send keys etc. for
	// every different browser. Moreover, it shouldn't do so as it's
	// not webdriver's responsibility to implement anything.
	
	public void findElement(String ele);
	public void click();
	public void sendKeys();
	public void quit();
}
