document.getElementById("registration-button").addEventListener("click",function (e){
    e.preventDefault();
    const userDto = {
        firstName: document.getElementById("fname").value,
        lastName:document.getElementById("lname").value,
        email:document.getElementById("email").value,
        password:document.getElementById("password").value
    }

    fetch(`http://localhost:8080/users`,{
        method:"POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userDto)
    })
        .then(r=>{
            if(r.ok){
                r.json().then(user=> {
                    localStorage.setItem("userData", JSON.stringify(user));

                    window.location.href="home.html";
                });
            } else {
                window.location.href="registration.html";
            }
        })


})