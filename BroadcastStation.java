import java.util.ArrayList;
import java.util.List;

public class BroadcastStation extends Observer
{
	public BroadcastStation(Subject subject)
	{
      		this.subject = subject;
      		this.subject.attach(this);
   	}

   	@Override
   	public void update()
	{
      		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState())); 
   	}
}
