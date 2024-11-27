package Maven_Project;

public class Info_Maven {

	/*
	 ####Maven project####
	 
	 ===creation of Maven project===
	 	go to file--new--maven project---select create simple project--next--give gruopid as company name---atifact as project name--finish
	 	new project will be created as M & J in symbol
	 	double click on created project-we get  8 dif folders
	 	
	 	1.	src/main/java--java utilities, element repository
	 	2.	src/main/resources---manualIC.xlsv,KT videos, document
	 	3.	src/test/java---test script--save it with _Test suffix-- Ex.name_Test
	 	4.	src/test/resources---test data
	 	5.	target--reports
	 	6.	pom.xml---depndency,profiling
	 	
	====how to add dependency in Maven====
	 	open pom.xml---add tag as--- <dependencies></dependenceis>  after the version tag--arrange it use  ctrl+shift+F
	 	search mvnrepository.com in crome ---search selenium jar---click on selnium-java--4.19.0 code copy nd paste between dependencis tag
	 	when we paste any dependency code nd save this--it will downlod in folder called as m2 folder of maven project--nd added into library of maven
	 	in this m2 folder---library jar files download from--global mvnrepository--nd store in our local maven repository directly(internaly)
	 	
	=====Maven life cycle===
	 first open pom.xml file---click on run buton--nd select below options
	 	1. mvn clean---use to clean the target folder-repports of privious testscript
	 	2. mvn verify---use to verify all the dependency download properly or not
	 	3. mvn compile---use to compile our java files(scripts)
	 	4. mvn test---use to execute all the test script one by one--- written in src/test/java
	 	
	========Maven Compiler========
	search maven compiler download in crome---dw apache maven--dw binary zip archive--click on first link--itt will start dw
	extract zip from file manager---
	search edit computer variables---nd set environment variables---set mvn compiler bin nd java bin path with path--new--ok
	go to cmd---java -version-----------mvn -version---to check it is working or not
	to run all the script with mvn compiler--go to pom file properties copy,go to that pom in file manager n open cmd from there
	#commands :
	mvn -Dtest=packagename.classname test
	mvn test -Dtest=packagename.classname 
	use cmd like------------------mvn test
	for perticular script use---mvn test -Dtest=org.testscripts.Dhoni_Test
	
	=======Maven Profiling========
	add the plugin code in pom file after dependencies tag
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.2.3</version>
				<configuration>
					<suiteXmlFiles>
						<suiteXmlFile>testng.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
	# if add plugin only then it will run perticular suitexml files only(not _Test classes), to run both use profiling concept
	# When ever Framework contains multiple testing xml files, In order to execute a particular xml via POM.xml , we go for profiling
	# command:  mvn test -P idname   (we have to specify which profile we want to run by giving the id of that particular file)
	#==How to add profiling code==
	<profiles>
		<profile>
			<id>Mi</id>
			<build>
				      copy paste above plugin code here
			</build>
		</profile>
	</profiles>
	
	=====Maven Parameter(parameterization)======

 using Maven parameter, we can pass the data from the command line at the run Time
  mvn -Dtest=MavenParameterTest -Durl=https://www.google.com -Ddata=KGFchapter1 test

public class MavenParameterTest {
	@Test
	public void launchingGoogleUsingParameterization() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String URL=System.getProperty("url");
		driver.get(URL);
		String TESTDATA=System.getProperty("data");
		driver.findElement(By.name("q")).sendKeys(TESTDATA,Keys.ENTER);
	}
}

	 */
	
}
