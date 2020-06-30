 $(document).ready(function() {

    $('#empolyees').DataTable({
        "ajax": {
            //"url": "data/test.json", //put your RESTfull controll End-point here 
            "url": "http://localhost:7070/api/employees", 
            "dataSrc": "", //this is important since ajax response expects data:[{}]
        },
        "columns": [
                    {"data": "id"}, 
                    {"data": "firstName"}, 
                    {"data": "lastName"}, 
                    {"data": "email"}
                ]
    });

 });