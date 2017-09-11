import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
	private List <BroadcastStation> listOfStations = new ArrayList<BroadcastStation>();
	private List <Watcher> listOfWatchers = new ArrayList<Watcher>();
	
	public static void main(String [] args)
	{
		//Creating stations and watchers to test
		int numOfStations; numOfWatchers;
		
// 		Scanner input = new Scanner(System.in);
		
// 		System.out.println("How many broadcast station do you want to create for this test?");
// 		numOfStations = input.nextInt();
		
// 		System.out.println("How many watchers do you want to create for this test?");
// 		numOfWatchers = input.nextInt();
		
// 		for(int i = 0; i < numOfStations; i++)
// 		{
// 			BroadcastStation createStation = new BroadcastStation("Broadcast Station " + (i + 1));
// 			listOfStations.add(createStation);
// 		}
		
// 		System.out.println(numOfStations + "broadcast stations created.");
		
// 		for(int i = 0; i < numOfWatchers; i++)
// 		{
// 			Watcher createWatcher = new Watcher("Watcher " + (i + 1));
// 			listOfWatchers.add(createWatcher);
// 		}
		
// 		System.out.println(numOfWatchers + "watchers created.");
		
		numOfStations = 1;
		numOfWatchers = 2;
		
		BroadcastStation stationOne = new BroadcastStation("Broadcast Station " + 1);
		listOfStations.add(stationOne);
		
		Watcher watcherOne = new Watcher("Watcher " + 1);
		listOfWatchers.add(watcherOne);
		
		Watcher createWatcherTwo = new Watcher("Watcher " + 2);
		listOfWatchers.add(watcherTwo);
		
		System.out.println(numOfStations + "broadcast stations created.")
		System.out.println(numOfWatchers + "watchers created.");
		
		watcherOne.addStation(stationOne);
		watcherTwo.addStation(stationOne);
		
		stationOne.addWatcher(watcherOne);
		stationOne.addWatcher(watcherTwo);
		
		stationOne.setMessage("Testing: First message.");
		stationOne.push();
		
		watcherOne.getMessage();
		watcherTwo.getMessage();
		
		watcherOne.showMessage():
		watcherTwo.showMessage();
	}
}
