
public class UpDrawing implements IDrawTree {

	@Override
	public void drawTree(int numOfLayers) {
		for (int i = numOfLayers-1; i >=0; i--)
		{
			for (int j = numOfLayers - i; j >=1 ; j--)
			{
				System.out.print(" ");
			}	
	 
			for (int j = numOfLayers ; j >= numOfLayers- 2 * i; j--)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
