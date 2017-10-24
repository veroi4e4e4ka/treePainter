import java.util.Scanner;

public class InputInfo {
	
	public int getIntValue()
	{
		System.out.println("Enter number of layers");
		Scanner sc = new Scanner(System.in);
		int numOfLayers=sc.nextInt();
		sc.close();
		return numOfLayers;
	}
	
	public String getStringValue()
	{
		System.out.println("Enter direction");
		Scanner sc2 = new Scanner(System.in);
		String direction;
		direction=sc2.nextLine();
		sc2.close();
		return direction;
	}

}
