<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

               <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
               <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
               <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
             <link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Student Already Exists</title>
         <link rel = "icon" href =
                "https://www.nwmissouri.edu/layout/v2019/images/svg/logo-n.svg"
                        type = "image/x-icon">
    </head>
    <body>
        <h1>Student ID ${StudentID} already picked up the mask on ${PickedUpDate} at ${PickedUpPlace} </h1>
       <a href="${pageContext.request.contextPath}/students">Go Back</a>
    </body>
</html>