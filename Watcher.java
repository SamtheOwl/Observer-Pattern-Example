import java.util.ArrayList;
import java.util.List;

public class Watcher
{
	private List <BroadcastStation> listOfAddedStations = new ArrayList<BroadcastStation>();
	private List <String> listOfMessages = new ArrayList<String>();
	private List <String> tempListOfMessages = new ArrayList<String>();
	
	private String nameOfWatcher;
	
	public Watcher(String inputNameOfWatcher)
	{
		this.nameOfWatcher = inputNameOfWatcher;
	}
	
	public void addStation(BroadcastStation inputNameOfStation)
	{
		this.listOfAddedStations.add(inputNameOfStation);
	}
	
	public void removeStation(BroadcastStation inputNameOfStation)
	{
		this.listOfAddedStations.remove(inputNameOfStation);
	}
	
	public void getMessage(List <String> inputList)
	{
		this.tempListOfMessages = inputList;
	}
	
	//This method also transfers the messages from the temp list to the main list then clears the temp list.
	public void showMessage()
	{
		for(String tempMessage : tempListOfMessages)
		{
			System.out.print("");
			System.out.println(tempMessage);
			System.out.print("");
			listOfMessages.add(tempMessage);
		}
		
		tempListOfMessages.clear();
	}
	
	public String getNameofWatcher()
	{
		return this.nameOfWatcher;
	}
	
	public String getNumberOfStations()
	{
		return listOfAddedStations.size() + "";
	}
	
	public String toString()
	{
		String output;
		
		int count = listOfAddedStations.size();
		
		if(count == 1)
		{
			output = "This is Watcher " + nameOfWatcher + " and I'm currently following "
					+ listOfAddedStations.size() + "station!";
		}
		
		else
		{
			output = "This is Watcher " + nameOfWatcher + " and I'm currently following "
					+ listOfAddedStations.size() + "stations!";
		}
		
		return output;
	}
}
