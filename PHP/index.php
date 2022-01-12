<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$uberX = new UberX("AMS123", new Account("Juan villamizar", "123456"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("ASD123", new Account("Juan villamizar", "123456"), "Chevrolet", "Sedan");
$uberPool->printDataCar();
?>