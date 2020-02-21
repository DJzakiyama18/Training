<?php require_once("humanData.php") ?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
   <?php
    echo "{$yamazaki->name}{$yamazaki->age}<br>";
   ?>
<?php foreach($humans as $human): ?>
    <p><?php echo "名前は{$human->name}です" ?></p>
    <p><?php echo "年齢は{$human->age}です" ?></p>
<?php endforeach ?>
</body>

</html>