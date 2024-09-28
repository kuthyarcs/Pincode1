# Pincode1 - Step1 (20 min)   
Open STS (SpringToolSuite) - File-new-SpringStarterProject 
Type: *Maven*  (not Gradle)   
Java version: Java 17  (not Java 21)
Packaging: JAR   
Language: Java  
Package: pkg1   

*Select Dependencies* 
- Spring Web   
- Data JPA   
- MySQL Driver   
- Thymeleaf   

Wait till Project Update is complete" - see bottom right for progress      

Select package *pkg1*. Right Click-new-package - *pkg1.restapi*   

Select *pkg1.restapi*. Right Click-new-class - *TestPincode* (with main method)


**REST API starts**

Select *pkg1.restapi*. Right Click-new-class - *Pincode1Entity* 
Select *pkg1.restapi*. Right Click-new-interface - *Pincode1Repo* 
Select *pkg1.restapi*. Right Click-new-class - *Pincode1Controller* 

Create a file **pincode1.txt** having following content
```
560083,Gottigere,Bangalore,Bangalore,KN,IN
574115,Bantakal,Udupi,Udupi,KN,IN
560100,Electronic City,Bangalore,Bangalore,KN,IN
581346,Malgi,Mundgod,Uttara Kannada,KN,IN
110005,Karolbagh,Central Delhi,Delhi,DL,IN
```
Read the file using    
```
File f1=new File(“pincode1.txt”);
Scanner sc1=new Scanner(f1);
String s1=sc1.nextLine();
```
Split each line and store in a temporary array   
```
String[] arr1=s1.split(“,”);
```
Create 5 ArrrayLists to store each element of each line
```
List<Integer> pincode=new ArrayList<>();
List<String> location=new ArrayList<>();
List<String> town=new ArrayList<>();
List<String> district=new ArrayList<>();
List<String> state=new ArrayList<>();
List<String> country=new ArrayList<>();
```
Take each item of **arr1** and add it to the respective ArrayList
```
pincode.add(arr1[0]);
location.add(arr1[1]);
town.add(arr1[2]);
district.add(arr1[3]);
state.add(arr1[4]);
country.add(arr1[5]);
```
Create a For Loop to read all the 5 lines so that each ArrayList contains 5 items
Now, ask user to input any pincode.  You need to give the corresponding location, town, district, state and country.  Eg.
If input is 560100, then   
	Location: Electronic City   
	Town: Bangalore   
	District: Bangalore   
	State: KN   
	Country:IN   
# Pincode1 - Step2 (30 min)   
Download and install MySQL Community Server https://dev.mysql.com/downloads/   
Download and install MySQL Workbench   
Set user=root, password=root.  Port:3306   
Create database **SMVITM**.  Use **SMVITM**   
Create table **pincode**
```
create database smvitm1;
use smvitm1;
create table pincodes(id bigint primary key auto_increment, pincode bigint, location varchar(50), town varchar(50), district varchar(50), state varchar(3), country varchar(3) default "IN");
insert into pincodes(pincode,location,town,district,state)values
  (560083,"Gottigere","Bangalore","Bangalore","KN"),
  (574115,"Bantakal","Udupi","Udupi","KN"),
  (560100,"Electronic City","Bangalore","Bangalore","KN"),
  (581346,"Malgi","Mundgod","Uttara Kannada","KN"),
  (110005,"Karolbagh","Central Delhi","Delhi","DL");
select * from pincodes;
```
Look for *application.properties* in /Pincode2/src/main/resources/application.properties
Update it with database details. Replace the items in { } with corresponding names. Eg   
database name=smvitm1   
username = user1   
password = XXXXX   
If database is in cloud server, replace {localhost} with {139.162.60.69}  
```
spring.datasource.url:jdbc:mysql://localhost/{database name}
spring.datasource.username:{db username}
spring.datasource.password:{db password}
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update   
```

# Pincode - Step3 - Create getPincode() REST API (40 min)   
# Pincode - Step4 - Deploy JAR file on Cloud Server (20 min)      
# Pincode - Step5 - Create Mobile App for Pincode (60 min)
# Pincode - Step6 - Connect Mobile App to Java REST API URL (20 min)     
# Pincode - Step7 - Build Android APK and share for testing (20 min)   
# Pincode - Step8 - Add Spring Security Auth for Admin (30 min)
# Pincode - Step9 - Create Web Page for Admin using Thymleaf (30 min)   
# Pincode - Step10 - Create addPincode() API for Admin (20 min)
# Pincode - Step11 - Create uploadFile() API for Admin (30 min)
# Pincode - Step12 - Fetch Pincode from external API (30 min)