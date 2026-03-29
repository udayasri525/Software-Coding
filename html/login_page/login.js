

// async function getting()
// {
     
//   try{
//     let res=  await fetch("http://localhost:3000/deatils",{method:"GET"})
//   let data=await res.json()
//   console.log(data)
//   }catch(error)
//   {
//     console.log(error)
//   }
// }

async function posting()

{
    let em=document.getElementById("email").value
    let pass=document.getElementById("password").value
     if (!em || !pass) {
    alert("Please fill all fields");
    return;}
    else{
    data={
    email:em,
    password:pass 
}
    }
  try{
    let res=  await fetch("http://localhost:3000/deatils",
        {
            method:"POST",
            headers:
            {
                "content-type":"application/json"
            },
             body: JSON.stringify(data)
        }
    )
  if(res.ok)
  {
    alert("data added successfully")
  }
  }catch(error)
  {
    console.log(error)
  }
}
document.getElementById("subbtn").addEventListener("click", function(e) {
  e.preventDefault();
//   getting();
  posting();
});

async function check()
{
    let email=document.getElementById("email").value;
    let password=document.getElementById("password").value;
    let res=await fetch("http://localhost:3000/deatils")
    let data=await res.json()
    let user=data.find((obj)=>
    {
        return obj.email===email && obj.password===password;
    }
    );
     if (user) {
    alert("Login Success");
  } else {
    alert("Invalid Email or Password");
  }
}
document.getElementById("logbtn").addEventListener("click", function(e) {
  e.preventDefault();
  check();
});