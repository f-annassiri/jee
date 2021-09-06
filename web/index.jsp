<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <!-- font awsome-->
        <link rel="stylesheet" href=https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css>
        <style> 
        footer {
                position: fixed;
                 height: 100px;
                bottom: 0;
                 width: 100%;
                }
        </style>
    </head>
    <%@ include file="header.jsp" %>
    <body>
        <form method="post" action="inscrit">
            <fieldset>
                </br></br></br>
                <center> <DIV>
                <legend>Inscription</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>
                </DIV></center>
                </br></br></br>
                <center>
                    <table> 
                        <tr>
                            <td><label for="email">Gmail<span class="requis">*</span></label></label> </td>
                            <td><input type="email" id="nom" name="gmail" value="" size="20" maxlength="20" /></td>
                        </tr>
                        
                        <tr>
                            <td><label for="password">password<span class="requis">*</span></label> </td>
                            <td><input type="password" id="password" name="password" value="" size="20" maxlength="60" /></td>
                        </tr>

                    </table> 
                    </br>
                <input type="submit" value="Inscription" class="sansLabel" />
                <br />
            </fieldset>
            </center>

        </form>
                <br />
            </fieldset>
        </form>
    </body>
    <%@ include file="footer.jsp" %>
</html>
