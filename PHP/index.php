<?php
require_once 'Account.php';
require_once 'Car.php';

$car = new Car('ASD123', new Account("Andres Hernandez", "HELL333"));
$car->printCar();
?>