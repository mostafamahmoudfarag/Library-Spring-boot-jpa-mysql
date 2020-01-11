<%@ taglib uri="http://www.springframework.org/tags" prefix="" %>
<%@ page import="java.util.List,com.mostafa.library.model.Book"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>LMS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Books</a></li>
      <li><a href="addnewbook">new Book</a></li>
  
    </ul>
  </div>
</nav>
  
<div class="container">
 <table class="table">
    <thead>
      <tr>
        <th>id</th>
        <th>Author Name</th>
        <th>Book Name</th>
        <th>Purchase Date</th>
        <th>Edit</th>
        <th>Delete</th>
        
      </tr>
    </thead>
    <tbody>
     <%
 
    List<Book> l=(List<Book>)request.getAttribute("books");
     for(int i=0;i<l.size();i++)
       {
    	 out.print("<tr>");
    	 out.print("<td>");
    	 out.print(l.get(i).getId());
    	 out.print("</td>");
    	 out.print("<td>");
    	 out.print(l.get(i).getAuthor_name());
    	 out.print("</td>");
    	 
    	 out.print("<td>");
    	 out.print(l.get(i).getBook_name());
    	 out.print("</td>");
    	 
    	 out.print("<td>");
    	 out.print(l.get(i).getPurchase_date());
    	 out.print("</td>");
    	 out.print("<td>");
    	 out.print("<a href=update/"+l.get(i).getId()+">E</a>");
    	 out.print("</td>");
    	 out.print("<td>");
    	 out.print("<a href=delete?id="+l.get(i).getId()+">D</a>");
    	 out.print("</td>");
    	 out.print("</tr>");
        }
     
   
     %>
    </tbody>
  </table>
</div>











</body>
</html>