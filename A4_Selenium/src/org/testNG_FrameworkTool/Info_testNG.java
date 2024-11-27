package org.testNG_FrameworkTool;

public class Info_testNG
{
/*     *****TestNG----(Test Next Generation)*****
 	
 	==========TestNG Advantages============
 		# it is unit testing framework
 		# used mostly to do unit testing by developer
 	1	# to run multiple testscript as a one batch togather as================== BatchExecution
 	2	# to run multiple testscript in part vise by using multiple Threads as ======  ParallalExecution
 	3	# to run multipleScript in group or filter vise by using Filtering/========== GroupExecution
 	4	# to run test scripts in multiple browsers by passing parameter nd using==== CossBrowserExecution
 	5 # to run multiple testscript in part vise by using multiple test runer as====== DistributiveParallalExecution
 	6	# for report generation of testing
 		
 	=====where we can get TestNG======+
 	1) eclipse market place---in Help
 	2) install new software--in Help
 	3) maven dependency
 	4) install or dw TestNG jar files
 	
 	====How to install TestNG in eclipse=====
 	i) eclipse--Help--Eclipse Marketplace--search TestNG--Install--select all check box--accept permision--nd Confirm--btw give all accept--then Restart now
 	ii) to check installed or not--again go to marketplace nd search it will show--Installed
 	
 	========How to add TestNG in project=========
 	i) project--rightclick--build path--add library--select TestNG--next--finish--library added at the top of the project
 	
 	1) start avoiding main method for execution---main() run jvm
 	2) use non-static method wiich has having ---@Test anotation//@test run testNG
 	   # if any class as one @Test method it called as -------TestNG class,
 	   # method which having @Test anotation called as ---Test Case,
 	   # statements of this method called as --------------------Test Steps
	 
    =======Helper Attributes=========
    1) priority---------------use to  prioritise our testcases---given to methods(Testcase) in int for execution---Ex.@Test(priority = 3)
    				   				    by default priority will be zero, it will execute alphabeticly
   2) invocationCount----use to run testcase for multiple times--given to Testcase---Ex.@Test( invocationCount = 2)
   									    by default invocationCount will be one(1).
   3) threadPoolSize------use to run multiple threads parallely, if invocationCount=3, then use 3 thread which run together as one time
                                        by default threadPoolSize will be one(1),-----Ex.@Test( invocationCount = 3, threadPoolSize = 3)
                                        it work only with invocationCount.
   4) enabled---------------use to disable any perticular testcase,-------Ex. @Test(enabled = false)
   									   by default enabled will be true.
   									   we can use (invocationCount = 0) to disable any testcase
   5) timeOut---------------use to give time limit(into ms) to testcase,------Ex. @Test(timeOut = 9000)
   										if load till given timeout--pass,--- else fail
  6)dependsOnMethods--use to give method dependency to testcase---Ex. @Test(dependsOnMethods = "register")
  										we have to give dependent method/testcase name in String formate
  										to give multiple dependency use--Ex.  @Test(dependsOnMethods = "GT","MI")
  										if we give priority also here, then preference will given to dependsOnMethods
  7) groups-----------------use to give group name to the testcase, for divinding purpose---Ex.(groups = "india")
                                       we can give multiple groups to one testcase--Ex.(groups =( { "india", "csk"} )

   
##Reporter.log()---Reporter is class of testng, which has static method log() 
   								i) Reporter.log(String info)--to give info about test steps--to see in reports
   								ii) Reporter.log(String info, boolean LogToStandardOut)--to give info about teststep, nd to see on console report
            ---to see the reports generated with testNG, refresh project first, then we will see folder named as test-output,
    			In this folder we have emailable-report.html file,by rightclick nd open with browser, we can see the report of our execution
    			
   ======to fail testcase=====
  to fail any testcase perpously-- use Assert.fail();----in testcase from where u want to make it fail
  
  ========Suite Structure========
  *use to do configuration  in testNG class--we have to give basic annotations in BaseClass
  1) @BeforeSuite
  2) @Before Test
  3) @Before Class--------use for launch browser instruction
  4) @Before Method-----use for login instruction
  5) @Test-------------------use for writing logic inside methods
  6) @After Method-------use for logout instruction
  7) @After Class----------use for quit browser instruction
  8) @After  Test
  9) @After Suite
    
   create another class nd extends it with BaseClass
   and in that create @Test methods
   
   ==========Listeners==========
  * use to track out testcases---to give info(moniter) about test case pass, fail,skipped,take ss
   1) ITestListener<I>---create class like MyListeners-- implements with ITestListeners<I> aslo extends BaseClass
   									  go to sources--override/implements---select method to override
   									  Ex. onTestStart()---write logic to get info-------Reporter.log("[Testcase--" + result.getName() + " started]");
   									  Ex. onTestSuccess()---write logic to get info---Reporter.log("[Testcase--" + result.getName() + " success]");
   									  Ex. onTestSkipped()---write logic to get info---Reporter.log("[Testcase--" + result.getName() + " skipped]");
   									  Ex. onTestFailure()---write logic to get info----Reporter.log("[Testcase--" + result.getName() + " failed]");
   									  Ex. onTestFailure()---write logic if testcase fail what to do--takes ss 

   									  then use @Listener(packageName.ClassName.class) anotation before any class to take a track on it
   									  Ex.@Listeners(org.genericUtilities.MyListeners.class)
   									  
   									(ii)  add this tags in xml files of testNg class, to use it for multiple classes
   									  	<listeners>
										<listener class-name="org.generic_Utilities.MyListeners"></listener>
										</listeners>
										
										
   2)ISuiteListener<I>---
   
 */

}
