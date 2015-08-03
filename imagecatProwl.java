import java.io.*;

public class imagecatProwl extends imagecatMoveWindow
{
	
		public static void runner() throws IOException
		{
			
		if (imagecatMove.checkJson(jsonIn)==true && imagecatMove.checkIndex(indexIn)==true)
		{
			imagecatMove.copyFile(jsonIn, indexIn);
		//	System.out.println("Transfer Completed");
			after1 = 1;
			
		}
		else
		{
		//	System.out.println("File locations are incorrect or do not exsist.");

			if (imagecatMove.checkJson(jsonIn)==false)
			{
		//		System.out.println("Json file location specified is not a file, check file and try again.");
				after1 = 2;
			}
			if (imagecatMove.checkIndex(indexIn)==false)
			{
		//		System.out.println("Index file location specified is not a file, check file and try again.");
				after1 = 2;
			}
		}
		
		
		}
		
}
