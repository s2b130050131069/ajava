
4.12 Time Updater in Servlet
----------------------------
In this program we are going to make one program on servlet which will keep on updating the time in every second and the result will be displayed to you.
To make this servlet firstly we need to make a class named TimeUpdater.  The name of the class should be such that it becomes easy to understand what the program is going to do. Call the method getWriter() method of the response object which will return a PrintWriter object. Use the method getHeader() of the response object to add a new header. We can also use setHeader() in place of getHeader(). The setHeader() method overrides the previous set header. Now by using the PrintWriter object display the result on the browser.


![1](https://cloud.githubusercontent.com/assets/16989820/13329068/ffd6eed2-dc17-11e5-9a82-e3537ba7339f.PNG)
![2](https://cloud.githubusercontent.com/assets/16989820/13329067/ff020f8c-dc17-11e5-8cfd-95169c5d4620.PNG)
