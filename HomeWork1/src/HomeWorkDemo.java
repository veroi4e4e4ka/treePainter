import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWorkDemo {
	
	public static void main(String[] args)
	{
		Map<String, IDrawTree> maps=new HashMap<String, IDrawTree>();
		maps.put("down", new DownDrawing());
		maps.put("up", new UpDrawing());
		maps.put("right", new RightDrawing());
		maps.put("left", new LeftDrawing());
		/*HomeWork homeWork= new HomeWork();
		int numOfLayers;*/
		System.out.println("Enter number of layers");
		Scanner sc = new Scanner(System.in);
		int numOfLayers=sc.nextInt();
		Validator validator = new Validator();
		validator.validateNumOfLayers(numOfLayers);
		System.out.println("Enter direction");
		Scanner sc2 = new Scanner(System.in);
		String direction;
		direction=sc2.nextLine();
		sc.close();
		sc2.close();
		
		validator.validateDirection(direction);
		
		IDrawTree tree=maps.get(direction);
		tree.drawTree(numOfLayers);
		/*homeWork.drawTree(numOfLayers, direction);
		//homeWork.downDrawing(5);
		System.exit(0);*/
		
	}

}
