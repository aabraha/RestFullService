 $(document).ready(function() {

     $("#formadd").submit(function(event) {

         event.preventDefault(); //???
         var firstname =  $('#firstname').val();
         var lastname =  $('#lastname').val();
         var email = $('#email').val();

        //  console.log("firstname : " + firstname);
        //  console.log("lastname : " + lastname);
        //  console.log("email : " + email);

         var person = { 
                firstName: firstname,
                lastName: lastname,
                email: email
             };

         $.ajax({
            type: "POST",
            url: "http://localhost:9090/api/employees",
            data: JSON.stringify(person), //==== convert object to json type =====//
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(person){
                // var obj = JSON.parse(person);
                alert("result: "+ person['id']);
                alert("result2: "+ person.id);
            },
            failure: function(errMsg) {
                alert(errMsg);
            }
      });
         
     });

     $('#empolyees').DataTable({
         "ajax": {
            // "url": "data/test.json", //put your RESTfull controll End-point here 
             "url": "http://localhost:9090/api/employees", 
             "dataSrc": "", // by default dataSrc:data
         },
         "columns": [
             { "data": "id" },
             { "data": "firstName" },
             { "data": "lastName" },
             { "data": "email" }
         ]
     });

 });