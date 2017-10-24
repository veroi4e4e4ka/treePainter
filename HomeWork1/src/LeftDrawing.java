
public class LeftDrawing implements IDrawTree {

	@Override
	public void drawTree(int numOfLayers) {
		int temp=numOfLayers;
		for (int i = temp; i > 1; i--)
		{	
			for(int k=i-2; k>=0;k--)
			{
				System.out.print(" ");
			}
			for (int j =  temp-i; j >= 0; j--)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
	 
	    for (int i = 1; i <= numOfLayers; i++)
		{	 
	    	for(int k=0; k<=i-2;k++)
			{
				System.out.print(" ");
			}
			for (int j =  0; j <= numOfLayers-i; j++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
