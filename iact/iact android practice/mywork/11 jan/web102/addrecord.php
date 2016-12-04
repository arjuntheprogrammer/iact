<?php
$id=$_POST["id1"];
$name=$_POST["name1"];
mysql_connect("localhost","root","")or die(mysql_error());
mysql_select_db("web101")or die(mysql_error());
$qry="insert into details (id,name) values ('$id','$name')";
mysql_query($qry)or die(mysql_error());
?>