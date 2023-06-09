<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>MovieBox</title>
</head>

<body class="container">
	<div class="my-2"><a href="AddMovie" >New Movie</a></div>
	<table class="table table-bordered border-dark">
  <thead>
    <tr>
      <th scope="col">Title</th>
      <th scope="col">Year</th>
      <th scope="col">Avg.Rating</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach begin="0" end="${fn:length(MB.movies)-1}" step="1" var="i">
  
    <tr>
      <td><a href="ReviewBox?id=${MB.movies.get(i).id}" >${MB.movies.get(i).title}</a></td>
      <td>${MB.movies.get(i).year}</td>
      <td>
      		<c:choose>
				<c:when test="${MB.movies.get(i).aveRating == 0}">
					N/A <br>
				</c:when>
				<c:otherwise>
					${MB.movies.get(i).aveRating} <br>
				</c:otherwise>
			</c:choose>
      </td>
    </tr>
    
  </c:forEach>
  </tbody>
</table>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>

</html>