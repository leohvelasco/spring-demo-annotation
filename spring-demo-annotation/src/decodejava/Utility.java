package decodejava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Utility 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:config.beans.xml");
		
		// When using @Component Annotation, the name of the bean in getBean() method, 
		// should be the lower-case equivalent of class name i.e. "tennis"
		Tennis tennisBean = context.getBean("tennis", Tennis.class); 
		
		// Calling the playTennis() method
		tennisBean.playTennis();
	}
}