<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>



   <form:form  modelAttribute="newProduct"   method="POST">
         <table>
            <tr>
               <!-- <td>Enter Product Id</td> -->
               <td><spring:message code="spring.form.label.productId"></spring:message>
               <td><form:input path="productId" /></td>
            </tr>
            <tr>
               <!-- <td>Enter Product Name</td> -->
                 <td><spring:message code="spring.form.label.name"></spring:message>
               <td><form:input path="name" /></td>
            </tr>
            <tr>
               <td>Enter Product Category</td>
               <td><form:select path="category" >
                    <form:option value="medicine"  label="Medicine"  />
                    <form:option value="FMCG"  label="FMCG"  />
                    <form:option value="cosmetics"  label="Cosmetics"  />
               </form:select></td>
            </tr>
            <tr>
               <td>Enter Product Manufacturer</td>
               <td><form:input path="manufacturer" /></td>
            </tr>
            
            <tr>
               <td>Enter Product Price</td>
               <td><form:input path="unitPrice" /></td>
            </tr>
            <tr>
               <td>Enter Product Description</td>
               <td><form:textarea path="description" cols="'10" rows="5" /></td>
            </tr>
            <tr>
               
               <td><input type="submit" value="Save" /></td>
            </tr>
         </table>
    </form:form>



</body>
</html> --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>



   <form:form  modelAttribute="newProduct"   method="POST">
         <table>
            <tr>
               <!-- <td>Enter Product Id</td> -->
               <td><spring:message code="spring.form.label.productId"></spring:message>
               <td><form:input path="productId" /></td>
            </tr>
            <tr>
               <!-- <td>Enter Product Name</td> -->
                 <td><spring:message code="spring.form.label.name"></spring:message>
               <td><form:input path="name" /></td>
            </tr>
            <tr>
               <td>Enter Product Category</td>
               <td><form:select path="category" >
                    <form:option value="medicine"  label="Medicine"  />
                    <form:option value="FMCG"  label="FMCG"  />
                    <form:option value="cosmetics"  label="Cosmetics"  />
               </form:select></td>
            </tr>
            <tr>
               <td>Enter Product Manufacturer</td>
               <td><form:input path="manufacturer" /></td>
            </tr>
            
            <tr>
               <td>Enter Product Price</td>
               <td><form:input path="unitPrice" /></td>
            </tr>
            <tr>
               <td>Enter Product Description</td>
               <td><form:textarea path="description" cols="'10" rows="5" /></td>
            </tr>
            <tr>
               
               <td><input type="submit" value="Save" /></td>
            </tr>
         </table>
    </form:form>



</body>
<section>
<div class="pull-left">
<a href="?language=en">English</a><a href="?language=en">Hindi</a>
</div>
</section>
</html>