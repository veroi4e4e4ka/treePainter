
public class RightDrawing implements IDrawTree {

	@Override
	public void drawTree(int numOfLayers) {
		int temp=numOfLayers;
		for (int i = temp; i > 1; i--)
		{	 
			for (int j =  temp-i; j >= 0; j--)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
	 
	    for (int i = 1; i <= numOfLayers; i++)
		{	 
			for (int j =  0; j <= numOfLayers-i; j++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
