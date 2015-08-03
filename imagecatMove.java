import java.io.*;
import java.util.Scanner;

public class imagecatMove extends imagecatProwl
{
	public static void copyFile(File json,File index)
			throws IOException
			{
			InputStream input = null;
			OutputStream output = null;
				try 
				{
					input = new FileInputStream(json);
					output = new FileOutputStream(index,true);
					byte[] buf = new byte[1024];
					int length;
					while ((length = input.read(buf)) > 0)
					{
						output.write(buf,0, length);
					}
				} 
				finally 
				{
					input.close();
					output.close();
				}
			}
	public static boolean checkJson(File jsonCheck)
	{
		if (jsonCheck.isFile() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static boolean checkIndex(File indexCheck)
	{
		if (indexCheck.isFile() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
