<?php
require_once 'account.php';
require_once 'car.php';
require_once 'uberX.php';
require_once 'uberPool.php';

$uberX = new UberX("ASD123", new Account("Andres Herrera", "AND4356"), "Chevy", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("QWE345", new Account("Andresa Fiti", "AND4356"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>