package org.testNg_crossBrowserExecution_classes;

public class Info_crossBrowser_Execution
{
	/*=====Cross Browser Execution====
	 
First write cross browser execution logic in one testcase, nd make this method parameter which accepts browserName while execution
after creating testNg xml class of it, then only add @Parameters, or @Optional annotation
use another annotation---@Parameters("browser")----for accept input while execution of testNG class
we can give @Optional("chrome")----in the method formal argument to give parameter, which is optional as default

     create class which have logic method
	 select it --right click--testNg--convert to testNg
	 testNg class will be create give path inside project/suite_xml_files/classname---give dif. name to class from the top, nd finish
	 created file  it  shown at the last of the project
	 open class created by using testNg nd
	 add tag <parameter> under the <test> tag
     save it nd run that class to do group excution---runbutton downkey--run as--TestNg suite

	 	 Ex. <test thread-count="5" name="Test">
	 	 		<parameter name = "browser" value = "chrome"> </parameter>
	 	 
* we can use multiple tesecase nd multiple classes also for cross browser execution
 1) if we want to run all the classes in same browser hten use above logic only,
	  Ex. <test thread-count="5" name="Test">
	 	 		<parameter name = "browser" value = "chrome"> </parameter>
	 
2) if we want to run perticular class with dif. browser, split the class tag nd pass parameter tag btw them
     Ex.    
     <test thread-count="5" name="Test">
    <classes>
      <class name="org.testNg_crossBrowserExecution_classes.Faasos">
			<parameter name ="browser" value ="chrome"> </parameter>
	  </class>
      <class name="org.testNg_crossBrowserExecution_classes.ShariefBhai">
			<parameter name ="browser" value ="edge"> </parameter>
	  </class>
      <class name="org.testNg_crossBrowserExecution_classes.Magicpin">
			<parameter name ="browser" value ="firefox"> </parameter>
	  </class>
    </classes>
  </test> <!-- Test
	 	 	 
**
	 */

}
