<html>
<body>

<table>
    <thead>
        <th>Roll Number</th>
        <th>Name</th>
        <th>Age</th>
    </thead>
    <tbody>
        <g:each in="${students}" var="student">
            <tr>
                <td>${student.rollNumber}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
            </tr>
        </g:each>
    </tbody>
</table>
</body>
</html>