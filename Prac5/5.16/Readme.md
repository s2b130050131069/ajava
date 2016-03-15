Java Server Pages (JSP)
=======================

5.16 MVC in JSP
---------------
Write following pages. 
    1. Index.html (as loing controll with one textbox for username and one password box for password, with a submit button) (as view)
    2. LoginServlet.java (as controller only)
    3. LoginService.java (as Business Service)
    4. Success.jsp (as view)

Role of index.jsp is to take input from user and forward it to LoginServlet Servlet controller, LoginServlet Controller will ask LoginService Class which has a business service named `boolean authenticateUser(String, String)` to validate the user. if userId is "admin" and password is "admin" then application will redirect to success.jsp with welcome `<username>` message, otherwise it will be redirected to login.jsp with an error message "invalid username and password". 
