import java.util.ArrayList;
import java.util.List;

public class BroadcastStation
{
	private List <String> archiveOfMessages = new ArrayList<String>();
	private List <String> listOfMessages = new ArrayList<String>();
	private List <Watcher> listOfAddedWatchers = new ArrayList<Watcher>();
	
	private String nameOfStation, message;
	
	public BroadcastStation(String inputNameOfStation)
	{
		this.nameOfStation = inputNameOfStation;
	}
	
	public void addWatcher(Watcher inputNameOfWatcher)
	{
		this.listOfAddedWatchers.add(inputNameOfWatcher);
	}
	
	public void removeWatcher(Watcher inputNameOfWatcher)
	{
		this.listOfAddedWatchers.remove(inputNameOfWatcher);
	}
	
	public void setMessage(String inputMessage)
	{
		this.message = inputMessage;
		listOfMessages.add(message);
	}
	
	public void push()
	{
		if(listOfAddedWatchers.size() < 1)
		{
			System.out.println("Currently there is noone to broadcast to.");
		}
		
		if(listOfMessages.size() < 1)
		{
			System.out.println("Currently there is no message to broadcast.");
		}
		
		else
		{
			int count = 0;
			
			for(int i = 0; i < listOfAddedWatchers.size(); i++)
			{
				Watcher watcherZero = listOfAddedWatchers.get(i);
				watcherZero.getMessage(listOfMessages);
				count++;
			}
			
			if(count == 1)
			{
				System.out.println("Pushed all messages to " + count + "watcher.");
			}
			
			else
			{
				System.out.println("Pushed all messages to " + count + "watchers.");
			}
			
			count = 0;
			
			archive();
			purge();
		}
	}
	
	public void archive()
	{
		int count = 0;
		
		for(int i = 0; i < listOfMessages.size(); i++)
		{
			archiveOfMessages.add(listOfMessages.get(i));
			count++;
		}
		
		if(count == 1)
		{
			System.out.println("Archived " + count + "message.");
		}
		
		else
		{
			System.out.println("Archived " + count + "messages.");
		}
	}
	
	public void purge()
	{
		listOfMessages.clear();
	}
	
	public String getNameOfStation()
	{
		return this.nameOfStation;
	}
	
	public String getNumberOfArchivedMessages()
	{
		return archiveOfMessages.size() + "";
	}
	
	public String getNumberOfMessages()
	{
		return listOfMessages.size() + "";
	}
	
	public String getNumberOfWatcherss()
	{
		return listOfAddedWatchers.size() + "";
	}
	
	public String toString()
	{
		return "This is Broadcast Station " + nameOfStation + ".";
	}
}
