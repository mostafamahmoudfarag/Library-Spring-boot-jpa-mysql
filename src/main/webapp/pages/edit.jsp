<style>
input{
margin-bottom: 10px}
</style>
<center>
<form action="/save">
  <label>Id </label><br>
  <input type="text" name=id value="${book.id}" ><br>
  <label>Book name</label><br>
  <input type="text" name=book_name value="${book.book_name }"><br>
  <label>Author name</label><br>
  <input type="text" name=author_name value="${book.author_name }"><br>
<label>Date</label><br>
  <input type="date" name=purchase_date  class="form-control"  value=${book.purchase_date }><br>  
  <input type="submit">
 
</form>
</center>