package org.genericUtilities;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author priya
 * 
 * This class is used to perform java actions
 */
public class Java_Utility implements FrameworkConstants
{
	/**
	 * This method is used to get brandomNumber, for that we have to pass boundry in int formate
	 * @param boundry[int]
	 * @return ramdomNumber [int]
	 */
	public int giveRamdomNumber(int boundry)
	{
		Random random = new Random();
		return random.nextInt(boundry);
	}
	public static String timeStamp()
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replaceAll(":", "-");
		return timeStamp;
	}
}
