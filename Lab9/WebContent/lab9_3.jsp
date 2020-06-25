<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${sessionScope.loais==null}">
    <c:redirect url="/lab9_3" />
</c:if>

<!DOCTYPE html>
<html><head><title>Lab 9.3</title></head>
<body>
<table width="100%">
   <tr valign='top'><td bgcolor="#c0c0c0" width="20%"><%@include file='sidebar.jsp'%></td>
      <td><table width="100%">
         <tr><td><%@include file='header.jsp'%></td></tr>
         <tr><td>
         <!-- Content -->        
         <h3>Lab 9.3</h3>
         <form action='./lab9_3' method='post'>
             <table>
                 <tr><th bgcolor="#c0c0c0" colspan="2">Thông tin loại sách</th></tr>
                 <tr><td>Mã loại:</td><td><input name='ma_loai'/></td>
                 <tr><td>Tên loại:</td><td><input name='ten_loai'/></td>   
                 
             </table><p>
             <input type='submit' name="action" value='Add'>
         </form><p>
           <h3>Loại Sách</h3>
                 <table cellspacing="0" cellpadding="5">
                 <tr bgcolor="#c0c0c0">
                     <th>Stt</th>
                     <th>Mã loại</th>
                     <th>Tên loại</th>                     
                     <th>&nbsp;</th>
                 </tr>
                 <c:forEach var="loai" items="${sessionScope.loais}" >
                     <c:set var="stt" value="${stt + 1}"/>
                     <tr>
                         <td>${stt}</td>
                         <td>${loai.maLoai}</td>
                         <td>${loai.tenLoai}</td>  
                         <td><a href="#">Delete</a></td>
                     </tr>    
                 </c:forEach>  
                 <c:remove var="loais" />
                 </table><p>                     
                                       
         <!-- End -->    
        </td></tr>
         <tr><td><%@include file='footer.jsp'%></td></tr>
         </table>
      </td>
   </tr>
</table>
</body></html>
