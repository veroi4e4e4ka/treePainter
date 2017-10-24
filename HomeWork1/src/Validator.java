
public class Validator {
	
	private  InputInfo numOfLayers;
	
	public  void validateNumOfLayers(int numOfLayers1)
	{
		try
		{
			if(numOfLayers1<=0)
			{
				throw (new Exception());
			}
			
		}catch(Exception e)
		{
			System.out.println("Number of layers must be integer >=0");
		}
		
	}
	public void validateDirection(String direction)
	{
		try
		{
			if(!direction.equals("up")&&!direction.equals("down")&&!direction.equals("right")&&!direction.equals("left"))
			{
				throw (new Exception());
			}
			
		}catch(Exception e)
		{
			System.out.println("The value of direction must be left right down or up");
		}
		
	}

}
