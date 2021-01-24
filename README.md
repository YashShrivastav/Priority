# Priority
Assignment Task For Tatsam


#Port Details
SpringBoot Server: Tomcat:9090
ReactJs port:3001

#Database
1. Priority - > id (primary), PriorityId, PriorityName, Priority, Satisfaction
2. User - > userId, username, password
3. Login -> userName, password, role, Priority

#FrontEnd
1. Home -> The home pages contains the information of the application and tells in one sentence what this application is expected to perform

2. View All Priority -> Any user could visit and watch thier list of priority displayed in descending order as higher number translates to more priority

3. Update Priority -> Admin could update the name of the priority in the database,
                 Whereas a user could update the value for the priorityValue and Satisfaction for a particular Priority(Connection, RelationShips ....)

4. Modify Priority -> Admin could Delete or Add Priority to the DataBase

all these functionalities could could be performed in the frontEnd which is designed in ReactJS and would be reflected in backend on the platform on MySQl

#NOTE

I tried to use Login Form and show values for each user and their corresponding value but due to time constrain I decided to skip that,
THE APPLICATION BY DEFAULT RUN FOR USER who can view the list of priortity and could modify the value for the proided options
For Using the Application as Admin the url needs to be passed an Atribute of role
localhost://9090/view-priority?role=admin (This link is for Admin)

An Admin could update the name for any priority, and could delete them also.
