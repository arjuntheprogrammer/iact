<?php
mysql_connect("127.0.0.1","root","")or die('Could not connect:<br><br>' .mysql_error());
mysql_select_db("web101")or die('database not found:<br><br>' .mysql_error());
$result=mysql_query("SELECT * FROM details")or die("Query Problem<br><br>".mysql_error());
while(($row=mysql_fetch_array($result))>0)
{  
$output[]=$row;
}
print(json_encode($output));
mysql_close();
?>