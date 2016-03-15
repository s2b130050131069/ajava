Java Server Pages (JSP)
=======================

5.7 JSP Cookies Example
-----------------------
Cookie Example to Store and Show only 10 values. This cookie example illustrates how you can manage cookie value in your JSP page. This example is saving and displaying cookies and also it is managing cookies size in such manner that if cookie size becomes greater than a limit (e.g 10 in this case), it will automatically deletes the oldest cookie from the list. Cookies age can be set using the following code: 
```javascript
setMaxAge(365*24*60*60)
```
User can add new cookie by entering the cookie name and value from the JSP page. On the form submit event user input will be added into cookie array by the following method: 
```javascript
response.addCookie(`<cookie name>`)
```
We are managing cookies by the cookie age. If the cookie ages is set to zero then it will be deleted. We are using the MaxAge property of the cookie to delete the cookie. To delete any cookie you can set its MaxAge to zero `e.g. MaxAge="0"`. 
```javascript
<% 
   if(cookies.length >=10) 
   { 
      int start=cookies.length-10;
      cookies[start].setMaxAge(0);
      response.addCookie(cookies[start]);
   } 
%>
```
First time when JSP page would run then it looks like that


![sample output11](http://www.roseindia.net/jsp/cookiestart.gif)

As and when we store new values in cookie it will add till 10 values


![sample output11](http://www.roseindia.net/jsp/cookiesave.gif)

as soon as we will add 11th value then first will be deleted.

![sample output11](http://www.roseindia.net/jsp/11thadded.gif)



