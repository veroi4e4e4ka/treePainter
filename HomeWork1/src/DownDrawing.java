
public class DownDrawing implements IDrawTree {

	@Override
	public void drawTree(int numOfLayers) {
		for (int i = 0; i < numOfLayers; i++)
		{
			for (int j = 1; j < numOfLayers - i; j++)
			{
				System.out.print(" ");
			}	
	 
			for (int j = numOfLayers - 2 * i; j <= numOfLayers; j++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
