<% page language="java" contentType="text/html; charset=windows-1256"
        pageEncoding="windows-1256"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="windows-1256">
    <title>créer un produit</title>
</head>
<body>
<form action="saveProduit" method="post">
    <pre>
        nom: <input type="text" name="nomProduit">
        prix: <input type="text" name="prixProduit">
        date création : <input type="date" name="date">
        <input type="submit" value="ajouter">
    </pre>

</form>
${msg}
<br/>
<br/>
<a href="ListeProduit">Liste Produits</a>
</body>
</html>