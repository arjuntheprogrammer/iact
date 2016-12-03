<?php 

$txt1 = "Learn PHP";
$txt2 = "W3Schools.com";
$x = 5;
$y = 4;
echo "<br>";

echo "<h2>$txt1</h2>";
echo "<br>";
echo "Study PHP at $txt2<br>";
echo $x + $y;
echo "<br>";



$x = 5985;
echo ("$x");
echo "<br>";

var_dump($x);

echo "<br>";
$x = 10.365;
var_dump($x);
echo "<br>";

$cars = array("Volvo","BMW","Toyota");
var_dump($cars);



class Car {
    function Car() {
        $this->model = "VW";
    }
}

// create an object
$herbie = new Car();
echo "<br>";
echo "<br>";
echo "<br>";
// show object properties
echo $herbie->model;

echo "<br>";
echo "<br>";


$x = "Hello world!";
echo "<br>";

var_dump($x);
echo "<br>";

$x = null;
var_dump($x);
echo "<br>";
echo "<br>";

echo strlen("Hello world!"); // outputs 12
echo "<br>";
echo "<br>";

echo str_word_count("Hello world!"); // outputs 2


echo "<br>";
echo "<br>";

echo strrev("Hello world!"); // outputs !dlrow olleH


echo "<br>";
echo "<br>";
echo strpos("Hello world!", "world"); // outputs 6



echo "<br>";
echo "<br>";

echo str_replace("world", "Dolly", "Hello world!"); 

echo "<br>";
echo "<br>";

define("GREETING", "Welcome to W3Schools.com!");
echo GREETING;

echo "<br>";
echo "<br>";
////////////////////////
$favcolor = "red";

switch ($favcolor) {
    case "red":
        echo "Your favorite color is red!";
        break;
    case "blue":
        echo "Your favorite color is blue!";
        break;
    case "green":
        echo "Your favorite color is green!";
        break;
    default:
        echo "Your favorite color is neither red, blue, nor green!";
}


echo "<br>";
echo "<br>";


$t = date("H");

if ($t < "10") {
    echo "Have a good morning!";
} elseif ($t < "20") {
    echo "Have a good day!";
} else {
    echo "Have a good night!";
}

echo "<br>";
echo "<br>";

$x = 1; 

while($x <= 5) {
    echo "The number is: $x <br>";
    $x++;
} 


echo "<br>";
echo "<br>";
for ($x = 0; $x <= 10; $x++) {
    echo "The number is: $x <br>";
}


echo "<br>";
echo "<br>";

function sum($x, $y) {
    $z = $x + $y;
    return $z;
}

echo "5 + 10 = " . sum(5, 10) . "<br>";
echo "7 + 13 = " . sum(7, 13) . "<br>";
echo "2 + 4 = " . sum(2, 4);

echo "<br>";
echo "<br>";

$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");

foreach($age as $x => $x_value) {
    echo "Key=" . $x . ", Value=" . $x_value;
    echo "<br>";
}

echo "<br>";
echo "<br>";

$cars = array("Volvo", "BMW", "Toyota");
$arrlength = count($cars);

for($x = 0; $x < $arrlength; $x++) {
    echo $cars[$x];
    echo "<br>";
}

echo "<br>";
echo "<br>";
$numbers = array(4, 6, 2, 22, 11);
sort($numbers);


echo "<br>";
echo "<br>";

$numbers = array(4, 6, 2, 22, 11);
rsort($numbers);

echo "<br>";
echo "<br>";
$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
asort($age);


echo "<br>";
echo "<br>";

$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
ksort($age);

echo "<br>";
echo "<br>";

$myfile = fopen("a1.php", "r") or die("Unable to open file!");
// Output one character until end-of-file
while(!feof($myfile)) {
  echo fgetc($myfile);
}
fclose($myfile);

echo "<br>";
echo "<br>";

$myfile = fopen("a1.php", "r") or die("Unable to open file!");
echo fread($myfile,filesize("a1.php"));
fclose($myfile);

echo "<br>";
echo "<br>";

$myfile = fopen("write.txt", "w") or die("Unable to open file!");
$txt = "Mickey Mouse\n";
fwrite($myfile, $txt);
$txt = "Minnie Mouse\n";
fwrite($myfile, $txt);
fclose($myfile);

echo "<br>";
echo "<br>";
?>