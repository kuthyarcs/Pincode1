# Pincode1 - Step1
Create a file **pincode1.txt** having following content
```560083,Gottigere,Bangalore,Bangalore,KN,IN
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
# Pincode1 - Step2
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
# Pincode - Step3 - Create REST API    
# Pincode - Step4 - Deploy WAR file on Cloud Server   
# Pincode - Step5 - Create Mobile App for Pincode   
# Pincode - Step6 - Connect Mobile App to Java REST API   
# Pincode - Step7 - Build Android APK and test  
# Pincode - Step8 - Add Spring Security for Admin
# Pincode - Step9 - Create API for Admin to add a pincode
# Pincode - Step10 - Create API for Admin to upload pincode file