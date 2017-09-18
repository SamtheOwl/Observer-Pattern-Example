import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
	public static void main(String[] args)
	{
      		Subject subject = new Subject();
      	
      		new BroadcastStation(subject);

      		System.out.println("First state change: 15");	
      		subject.setState(15);
      		System.out.println("Second state change: 10");	
      		subject.setState(10);
   	}
}
