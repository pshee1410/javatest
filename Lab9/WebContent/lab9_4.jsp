<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${sachs==null}">
    <c:redirect url="/lab9_4" />
</c:if>

<!DOCTYPE html>
<html><head><title>Lab 9.4</title></head>
<body>
<table width="100%">
   <tr valign='top'><td bgcolor="#c0c0c0" width="20%"><%@include file='sidebar.jsp'%></td>
      <td><table width="100%">
         <tr><td><%@include file='header.jsp'%></td></tr>
         <tr><td>
         <!-- Content -->    
         <h2>Lab 9.4</h2>
         <h3>Danh mục sách</h3>
                 <table cellspacing="0" cellpadding="5">
                 <tr bgcolor="#c0c0c0">
                     <th>Stt</th>
                     <th>Mã sách</th>
                     <th>Tựa đề</th>
                     <th>Giá</th>
                     <th>&nbsp;</th>
                 </tr>
                 <c:forEach var="sach" items="${sachs}" >
                     <c:set var="stt" value="${stt + 1}"/>
                     <tr>
                         <td>${stt}</td>
                         <td>${sach.maSach}</td>
                         <td>${sach.tuaDe}</td>
                         <td>${sach.gia}</td>
                     </tr>    
                 </c:forEach>                                 
                 </table><p>
         <!-- End -->    
        </td></tr>
         <tr><td><%@include file='footer.jsp'%></td></tr>
         </table>
      </td>
   </tr>
</table>
</body></html>
