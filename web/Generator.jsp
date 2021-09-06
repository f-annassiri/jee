
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap core CSS -->
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
    </style>
  </head>


  <header id="header">


      
        
  <nav class="navbar navbar-light" style="background-color:#EFEEEE;">
        <span class="navbar-text"> 
             <% String gmail=(String) session.getAttribute("gmail");%>
             
            <h5>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp; hello&nbsp; <%=gmail%></h5></span>
            <a class="form-inline" href="login.jsp">
               <%  request.getSession().invalidate(); %>
    <button class="btn btn-outline-primary " type="submit">Déconexion </button>
  </a>
</nav>
    
</header>

  <body class="bg-light">
    <div class="container">
  <div class="py-5 text-center">
    <h2> formulaire d'adehsion </h2>
  </div>

  <div class="row">
    <div class="col-md-4 order-md-2 mb-4">
    
      <h5 class="mb-3">Service d'assurance</h5>
      </h5> 
      <ul class="list-group mb-3">
  
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">Service 1 </h6>
            <small class="text-muted">Brief description</small>
          </div>
          <span class="text-muted">250 Dh </span>
        </li>
        <li class="list-group-item d-flex justify-content-between lh-condensed">
          <div>
            <h6 class="my-0">service 2  </h6>
            <small class="text-muted"> il contient l'assurence sur la centé , les jeux ..</small>
          </div>
          <span class="text-muted">300 Dh </span>
        </li>
        <li class="list-group-item d-flex justify-content-between bg-light">
          <div class="text-success">
            <h6 class="my-0">Promo : tous les Service </h6>
            <small> un assemblage des meilleure service d'assurence pour vos enfants </small>
          </div>
          <span class="text-success">500 Dh</span>
        </li>
      </ul>
    </div>


    <div class="col-md-8 order-md-1">
      <h5 class="mb-3">Données tuteur </h5><hr class="mb-4">

      
      <form class="needs-validation" novalidate  method="post" action="generator">
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="firstName">First name</label>
            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid first name is required.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label for="lastName">Last name</label>
            <input type="text" class="form-control" id="lastName" name="lasttName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid last name is required.
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="firstName">Email </label>
            <input type="email" class="form-control" id="email" name="email" value="<%=gmail%>" >
            <div class="invalid-feedback">
              Please enter a valid email address for shipping updates.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label for="lastName">telephone : </label>
            <input type="tel" class="form-control" id="tele" name="tele" placeholder="0663309217" value="" required>
            <div class="invalid-feedback">
              phone number is required.
            </div>
          </div>
        </div></br>

        <h5 class="mb-3">Données d'autre parent </h5>        
         <hr class="mb-4">
         <div class="row">
          <div class="col-md-6 mb-3">
            <label for="firstName">First name <span class="text-muted">(Optional)</span></label>
            <input type="text" class="form-control" name="nomt" id="firstName" placeholder="" value="" required>
          </div>
          <div class="col-md-6 mb-3">
            <label for="lastName">Last name <span class="text-muted">(Optional)</span></label>
            <input type="text" class="form-control" name="prenomt" id="lastName" placeholder="" value="" required>
          </div>
        </div>

        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="firstName">Email <span class="text-muted">(Optional)</span></label>
            <input type="email" class="form-control" name="emailt" id="email" placeholder="you@example.com">
          </div>
          <div class="col-md-6 mb-3">
            <label for="lastName">telephone : <span class="text-muted">(Optional)</span></label>
            <input type="tel" class="form-control" name="telet" id="tele" placeholder="0663309217" value="" required>
          </div>
        </div>
        <hr class="mb-4">

        <h5 class="mb-3">Add ur child number  </h5>
        <div class="row" id="nb_cnt">
            
            <input type="number" id="number" name="nbef"/>

            <button type="button" class="btn btn-secondary"onclick="generate()">+</button>
        </div>
        <div class="row"  id="container">
        </div>
        <hr class="mb-4">
        <div class="custom-control custom-checkbox">
            <input type="checkbox" class="custom-control-input" id="1">
          <label class="custom-control-label" for="1">J’ai lu et accepte les garanties du contrat d’assurance<span class="text-muted">(Obligatoire)</span></label>
        </div>
        <div class="custom-control custom-checkbox">
          <input type="checkbox" class="custom-control-input" id="2">
          <label class="custom-control-label" for="2">Je souhaite recevoir les informations concernant l’association</label>
        </div>
        <div class="custom-control custom-checkbox">
          <input type="checkbox" class="custom-control-input" id="3">
          <label class="custom-control-label" for="3">Je souhaite être parents délégués au conseil d’école</label>
        </div>
     
        <hr class="mb-4">
        <button class="btn btn-primary btn-lg btn-block"  id="submit" disabled="true"  type="submit">Continue </button>
      </form>
    </div>
  </div>

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2019-2020  BISD1</p>
  
  </footer>
</div>
<script>
  function generate()
  {
      var n = document.getElementById("number").value;
      var container = document.getElementById("container");
      document.getElementById("nb_cnt").style.display = "none";
      for(var i = 1; i <= n; i++)
      {
          container.innerHTML += '<h5 class="mb-3"></br> Données Enfant  </h5>\n\<hr class="mb-4"><div class="row">\n\
  <div class="col-md-6 mb-3">\n\
    <label for="firstName">First name</label>\n\
    <input type="text" class="form-control" id="firstName" placeholder=""  name="nom'+i+'"  value="" required>\n\
    <div class="invalid-feedback">\n\
      Valid first name is required.\n\
    </div>\n\
  </div>\n\
  <div class="col-md-6 mb-3">\n\
    <label for="lastName">Last name</label>\n\
    <input type="text" class="form-control" id="lastName" placeholder=""   name="prenom'+i+'"  value="" required>\n\
    <div class="invalid-feedback">\n\
      Valid last name is required.\n\
    </div>\n\
  </div>\n\
    <div class="col-md-6 mb-3">\n\
      <label for="country">Niveaux scolaire </label>\n\
      <select class="custom-select d-block w-100" name="niveau'+i+'" id="Niveaux" required>\n\
        <option value="">Choose...</option>\n\
        <option>Premaire</option>\n\
        <option>Secondaire</option>\n\
        <option>college</option>\n\
      </select>\n\
      <div class="invalid-feedback">\n\
        Please select a valid Niveaux.\n\
      </div>\n\
    </div>\n\
    <div class="col-md-6 mb-3">\n\
        <label for="country">Offre dassurance </label>\n\
        <select class="custom-select d-block w-100"  name="service'+i+'" id="Niveaux" required>\n\
          <option value="">Choose...</option>\n\
          <option value="500">Service1</option>\n\
          <option value="600">Service2</option>\n\
          <option value="55">Promo</option>\n\
        </select>\n\
      <div class="invalid-feedback">\n\
        Please provide a valid state.\n\
      </div>\n\
    </div>\n\
  </div></br><hr class="mb-4">' ;
      }
  }
</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="/web/WEB-INF/js/bootstrap.bundle.min.js" integrity="sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm" crossorigin="anonymous"></script>
        <script src="form-validation.js"></script>
        <script>
    $('#1').click(function(){
    if($(this).is(':checked')){
        $('#submit').removeAttr("disabled");
        
    }else {
        $('#submit').attr("disabled", "true");
    }

});
</script>
  </body>
</html>

