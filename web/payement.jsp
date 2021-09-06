
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap core CSS -->
     <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/navbar/">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

    p {
  color: white;
     }
</style>

  </head>

       <% String gmail=(String) session.getAttribute("gmail");%>



  </div>

   
  <nav class="navbar navbar-light" style="background-color:#EFEEEE;">
        <span class="navbar-text"> 
            <h5>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp; hello&nbsp; <%=gmail%></h5></span>
  <form class="form-inline">
    <button class="btn btn-outline-primary " type="submit">Déconexion </button>
  </form>
</nav>
       

  <body class="bg-light">
    <div class="container">
        </br></br>
    </br>


    <div class="col-md-8 order-md-1">
      <h5 class="mb-3"> Vos enfant & vos services  </h5><hr class="mb-4"></h5> 
      <ul class="list-group mb-3">
  
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Enfant  1 </h6>
            <small class="text-muted">Brief description</small>
          </div>
        </li>
       
        <li class="list-group-item d-flex justify-content-between bg-light">
          <div class="text-success">
            <h6 class="my-0">prix  :  </h6>
          </div>
        </li>
      </ul>
    </div>
        <hr class="mb-4">

        <h5 class="mb-3">Payment</h5>
         <form class="needs-validation" novalidate  method="post" action="generator">
        <div class="d-block my-3">
          <div class="custom-control custom-radio">
            <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked required>
            <label class="custom-control-label" for="credit">Credit card</label>
          </div>
          <div class="custom-control custom-radio">
            <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required>
            <label class="custom-control-label" for="debit">Par especes <div class="custom-control custom-radio">
          </div>
        </div>
        
          </div>
     

        <hr class="mb-4">
        <button class="btn btn-primary btn-lg btn-block" type="submit">generer recu d'inscription  </button>
        
      </form>

              
          </div></div>
      </form>
    </div>
       </div></div>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2019-2020  BISD1</p>
  
  </footer>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="/web/WEB-INF/js/bootstrap.bundle.min.js" integrity="sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm" crossorigin="anonymous"></script>
        <script src="form-validation.js"></script>

  </body>
</html>

