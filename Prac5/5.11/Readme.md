Java Server Pages (JSP)
=======================

5.11 JSP JSTL SQL Tags
----------------------
rewrite program 5.4 using SQL tags.

part 2. do following
Create following table:

```sql
create table Students
    (
     id int not null,
     first varchar (255),
     last varchar (255),
     dob date
    );
```

Insert following records: 
```sql
INSERT INTO Students VALUES (100, 'Nirav', 'Baldha', '2002/05/16');
INSERT INTO Students VALUES (101, 'Kaushik', 'Vaghani', '1978/11/28');
INSERT INTO Students VALUES (102, 'Ankit', 'Desai', '1980/10/10');
INSERT INTO Students VALUES (103, 'Ruhi', 'Desai', '1971/05/08');
```

Now let us write a JSP which will make use of `<sql:update>` along with `<sql:param>` and `<sql:dataParam>` to execute a SQL UPDATE statement to update date of birth for Ruhi. Also Display all records on browser.


