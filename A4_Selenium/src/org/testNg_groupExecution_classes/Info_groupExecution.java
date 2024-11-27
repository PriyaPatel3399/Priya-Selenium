package org.testNg_groupExecution_classes;

public class Info_groupExecution
{
	/*======Group Execution Classes=======
	 
	 launch the testcases as per diff groups, by using groups helper attribute of testNG classes---Ex.(groups = "india")

	 create class
	 select it togather--right click--testNg--convert to testNg
	 testNg class will be create give path inside project/suite_xml_files/classname---give dif. name to class from the top, nd finish
	 created file  it  shown at the last of the project
	 open class created by using testNg nd
	 first add groups tag after <test> tag, then inside it give <run> tag, then inside it give <include> tag with groupname
	 to avoid any perticular gruops to run, use <exclude> tag at the place of include
	 we can add multiple include nd exclude tags
	   save it nd run that class to do group excution---runbutton downkey--run as--TestNg suite


	 Ex. <test thread-count="5" name="Test">
				<groups>
					<run>
						<include name = "groupName"> </include>
						<exclude name = "groupName"> </exclude>
					</run>
				</groups>
				<class____________>
	 
****  exclude groups ******
to avoid any perticular gruops to run, use exclude at the place of include
	 */
}
