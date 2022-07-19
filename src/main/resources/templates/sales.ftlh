<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table {
            font-size: 30px;
            background: darkgray;
            height: 10px;
            width: 10px;
            padding: 10px;
            border: 3px solid black;
            border-spacing: 10px 1px;
            border-collapse: collapse;
        }
        caption {
            padding: 10px 0;
            font-size: 35px;
        }
        th, th, td {
            border: 2px solid black;
            height: 10px;
            width: 10px;
            padding: 10px;
        }
    </style>
</head>
<body>
<h1>TechIndustry</h1>
<table>
    <caption>Данные о продажах</caption>
    <tr>
        <th>Id</th>
        <th>Price</th>
        <th>dataFrom</th>
        <th>dataTo</th>
    </tr>
    <#list sales as sales>
    <tr>
        <td>${sales.id}</td>
        <td>${sales.price}</td>
        <td>${sales.dataFrom}</td>
        <td>${sales.dataTo}</td>
    </tr>
    </#list>
</table>
</body>
</html>