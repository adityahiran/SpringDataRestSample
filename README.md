SpringDataRestSample
====================

Sample web application using Spring Data Rest for having a Restful web service.

To run the Application:
1. Have gradle installed with the Path environment variable set.
2. Download zip file from https://github.com/adityahiran/SpringDataRestSample
3. Extract.
4. Open command line and go to the project's root directory.
5. gradle build.
6. gradle run.

To test the web service:
1. Run the application.
2. Install Postman plugin on Google Chrome.
3. Give the URL (http://localhost:8080/careerskillsandoptions), select the HTTP Request method type (i.e. GET or POST or PUT or DELETE).
4. GET is used to read the resource in JSON.
5. POST is used for adding a record to the resource. Input should have Http content type as application/json. You can set this in the Postman plugin if you click the Headers button.
6. PUT is used to update a record in the resource. For this, use the specific URL you want to update (Ex:http://localhost:8080/careerskillsandoptions/1)
7. DELETE is used for deleting a specific resource.

Note: This setup can be used as a backend for multiple mobile/web clients.




