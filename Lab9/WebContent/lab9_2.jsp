<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><title>Lab 9.2</title></head>
<body>
<table width="100%">
   <tr valign='top'><td bgcolor="#c0c0c0" width="20%"><%@include file='sidebar.jsp'%></td>
      <td><table width="100%">
         <tr><td><%@include file='header.jsp'%></td></tr>
         <tr><td>
         <!-- Content -->        
         <h3>Lab 9.2</h3>
         <form action='./lab9_2' method='post'>
             <table>
                 <tr><th bgcolor="#c0c0c0" colspan="2">Thông tin loại sách</th></tr>
                 <tr><td>Mã loại:</td><td><input name='ma_loai'/></td>
                 <tr><td>Tên loại:</td><td><input name='ten_loai'/></td>            
             </table><p>
             <input type='submit' name="action" value='Add'>
         </form><p>
             
           <c:if test="${sessionScope.success!=null}">
                <div style="color: green">${sessionScope.success}</div>
                <c:remove var="success" />
           </c:if>    
                
            <c:if test="${sessionScope.error!=null}">
                <div style="color: red">${sessionScope.error}</div>
                <c:remove var="error" />
           </c:if>  
         <!-- End -->    
        </td></tr>
         <tr><td><%@include file='footer.jsp'%></td></tr>
         </table>
      </td>
   </tr>
</table>
</body></html>
