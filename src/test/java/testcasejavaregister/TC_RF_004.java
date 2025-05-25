package testcasejavaregister;

import java.util.Date;

import org.testng.annotations.Test;





public class TC_RF_004 {
	
	@Test
	
	//make email dyanamic 
	public void date() {
		
		Date emailsample = new Date();
		String email = emailsample.toString();
		System.out.println(email);
		String cemail = email.replace(" ", "");
		System.out.println(cemail);
		String femail = cemail.replaceAll(":", "");
		System.out.println(femail);

	}

	@Test
	
		public String datee() {
			
			//Date emailsample = ;
			return new Date().toString().replace(" ", "").replaceAll(":", "")+"@gmail.com";

		}

}
