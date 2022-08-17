package decodejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tennis 
{
	
	public void playTennis() 
	{
		System.out.println("Hello World! Do you like Tennis?");
	}

}