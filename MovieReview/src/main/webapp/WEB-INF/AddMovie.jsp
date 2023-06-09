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
<title>AddMovie</title>
</head>

<body class="container">
<nav style="--bs-breadcrumb-divider: url(&#34;data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='8' height='8'%3E%3Cpath d='M2.5 0L1 1.5 3.5 4 1 6.5 2.5 8l4-4-4-4z' fill='currentColor'/%3E%3C/svg%3E&#34;);" aria-label="breadcrumb">
  <ol class="breadcrumb fs-2 fw-bold">
    <li class="breadcrumb-item"><a href="MovieBox" >Movies</a></li>
    <li class="breadcrumb-item active" aria-current="page">New Movie</li>
  </ol>
</nav>

	<form action="AddMovie" method="post">
	<div class="row g-3 align-items-center">
		<div class="col-auto">
			<label for="title" class="col-form-label">Title</label>
		</div>
		<div class="col-auto">
			<input type="text" name="title" class="form-control"
				aria-describedby="titleInput">
		</div>
	</div>
	<div class="row g-3 align-items-center">
		<div class="col-auto">
			<label for="year" class="col-form-label">Year</label>
		</div>
		<div class="col-auto">
			<input type="text" name="year" class="form-control"
				aria-describedby="yearInput">
		</div>
	</div>
	 <button type="submit" class="btn btn-secondary">Add</button>
	 </form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>

</html>