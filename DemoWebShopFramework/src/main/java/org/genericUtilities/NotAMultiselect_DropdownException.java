package org.genericUtilities;
/**
 * This class is used to create custom exception, when we try to use methods of multi-select dropdown, for any single-select dropdown
 */
public class NotAMultiselect_DropdownException extends RuntimeException
{
	//constructor to pass exception message to its parent, where exception occured
	public NotAMultiselect_DropdownException(String s)
	{
		super(s);
	}
}
