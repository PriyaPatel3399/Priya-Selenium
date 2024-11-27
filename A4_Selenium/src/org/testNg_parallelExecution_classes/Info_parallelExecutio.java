package org.testNg_parallelExecution_classes;

public class Info_parallelExecutio 
{
	/*===Paralle Execution===
	 * launch the classes at one time only, parallely
	 1) we can run, multiple testcase as per classes then use parallel= "classes"
	 2) we can run, multiple testcase as per testcase then use parallel = "methods",change threadcount as per no of methods
	 3) we can use  parallel ="true"---work same as --parallel = "methods",
	
	 create classes
	 select it togather--right click--testNg--convert to testNg
	 testNg class will be create give path inside project/suite_xml_files/classname---give dif. name to class from the top, 
	 give--parallel mode as classes--nd finish
	 created file  it  shown at the last of the project
	 open class nd run that class to do batch excution---runbutton downkey--run as--TestNg suite
	 
	1) for parallel execution-----in creating testNg class when we are giving name nd path of testNg class
	    we can give parallel = "classes" in created class of batch exe as--<test thread-count="5" name="Test" parallel = "classes">
	    
	 */


}
