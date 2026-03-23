// var a=10;
// var b=100;
// console.log(b>=a);
// console.log(b<=a);
// console.log(b==a);
// console.log(b===a);
// console.log(b!=a);
// console.log(b!==a);
// console.log(b>a);
// console.log(b<a);

// example2 

// var a=9;
// console.log(a%2==0?"even":"odd");

// example3 
// var age=19;
// console.log(age>=18?"adult":"minor");

// example4

// var marks=80;
// console.log(marks>=90?"A":marks>=75?"B":marks>=60?"C":marks>=45?"D":"F");

//example5

// var temp=20;
// console.log(temp>30?"Hot":temp>=20&& temp<=30?"warm":temp>=10&&temp<=19?"cool":"cold");

// example 6

// var age=20;
// console.log(age>=0&&age<=12?"child":age>=13&&age<=19?"TEEN":"Adult");


// function greet(){
// console.log("hello");

// }
// greet();

// function showMessage(){
// console.log("This is a message!");
// }

// showMessage();

// function logInfo()
// {
//     console.log("Logging Information…");
    
// }
// logInfo();

// function  startGame()
// {
//     console.log("Game Started!");
//      endGame();
// }
// function  endGame()
// {
//     console.log("Game Over!");
    
// }
// startGame();

// function beginTask()
// {
//     console.log("Task Started");
//      finishTask();
// }
// function  finishTask()
// {
//     console.log("Task Finished");
    
// }
// beginTask();


// 1. How would you define a function that takes two numbers as parameters and returns their sum?

// 2. If you define a function that accepts a string as a parameter, how would you modify it to print the string in uppercase?

// 3. In JavaScript, what happens if you pass an undefined value as an argument to a function that expects a parameter?

// 4. Suppose you have a function that takes an array as a parameter. How would you check inside the function if the array is empty?

// 5. write a function that takes two numbers as parameters and returns their difference.

// 6. Define a function that accepts a name and age as parameters, and returns a string with a greeting like "Hello, [name]! You are [age] years old."

// 7. Write a function that takes a number as a parameter and returns true if the number is a even number, otherwise false


// function sum(a,b)
// {
//     return a+b;
// }
// console.log(sum(10,11));

// function st(name)
// {
//     console.log(name.toUpperCase());
    
// }
// st("udayasri")

// function exam(name )
// {
//  console.log(name);
// }
// exam(undefined);

// function exam1(a,b)
// {
//     return a-b;
// }
//   console.log(exam1(4,2));
  
// function st1(name ,age)
// {
//     return "hello ,[" + name + "]! you are [" + age + " ]years old";
// }
// console.log(st1("udayasri" ,23));
 
// function st2(num)
// {
//     return num%2==0?"true":"flase";
// }
// console.log(st2(4));

	
//  	function getOddNumbers(n) {
//     let odds = [];
//     for (let i = 1; i <= n; i++) {
//         if (i % 2 !== 0) {
//             odds.push(i);
//         }
//     }
//     return odds;
// }

// console.log(getOddNumbers(5));
// console.log(getOddNumbers(10));


//1.          Write an arrow function that takes two parameters, a and b, and returns their sum.
// 2.          Create an arrow function that takes a single parameter name and returns a greeting message: “Hello, {name}!”
// 3.          Write an arrow function that checks if a number is even and returns true if it is, or false otherwise.
// 4.          Write an arrow function that accepts a number and returns true if the number is greater than 10, or false otherwise.
// 5.          Create an arrow function that takes two strings, compares their lengths, and returns the longer string. If both have the same length, return “Equal length.”



// var add=(a,b) => a+b;
//  console.log(add(2,3));
 

// var greet=(greett) => greett;
//  console.log(greet("hello {name}!"))
 

//  var number=(num) => (num%2==0)?"true":"flase";
//  console.log(number(2));

//  var num=(n) => (n>10)?"true":"flase";
//  console.log(num(11));


//  var compare = (str1,str2) => (str1.length>str2.length)? str1 : (str1.length < str2.length)? str2 :"equal length";
//  console.log(compare("hello" ,"udayasri"));

// function greet(name)
// {
//     console.log("hello , [" +name +"]!");
// }
// greet("udaya");

// function sum(callback)

// {
//  console.log(callback(10,20));
// }
// sum ((a,b)=> a+b);

 
// function square(callback)
// {
//     console.log(callback(12));
// }
// square((a)=>a*a);

// function avg(arr)
// {
//     var sum=0;
//     for(var i=0;i<arr.length;i++)
//     {
// sum=sum+arr[i];
//     }
//     return sum/arr.length;
// }
// console.log(avg([10,20,30,40,50]));

// function  define(str)
// {
//     var vowels="aeiouAEIOU"
//  for(var i=0;i<str.length;i++)
//  {
//     for(var j=0;j<vowels.length;j++)
//     {
// if(str[i]===vowels[j])
// {
//     return true
// }
//     }
//  }
// }

// console.log(define("udayasri")==true?"hello":"hii");

// function temp(tempp)
// {
//     console.log("celscious"+((tempp-32)*(5/9)));
//     console.log("fahrehnheit"+((temp*9/5)+32));
// }
// temp(100);


// function sum(val,callback)
// {
//     callback(val+10);
//     sub(20,a=>console.log(a));

// }


// function sub(val,callback)
// {
//     callback(val-5);
//     mul(15,a=>console.log(a));
// }

// function mul(val,callback)
// {
//     callback(val*2);
//      div(30,a=>console.log(a));
// }

// function div(val,callback)
// {
//     callback(val/2);
   
// }

// sum(10,a=> console.log(a));


// console.log("start");
// setTimeout(() => {
    
//     console.log("first call");
//     }
// , 5000);
// for(i=0;i<=5000;i++)
// {
//     console.log("i");
// }
// setTimeout(() => {
//      console.log("second call");
// }, 3000);

// const URL="https://dummyjson.com/todos";
// fetch(URL).then(res=>res.json()).then(data=>
// {
// var count=0;
// for(let i=0;i<data.todos.length;i++)
// {
    
//     console.log(data.todos[i].userId);
//        console.log(data.todos[i].todo);

   
// }
// })

// const URL="https://pokeapi.co/api/v2/pokemon/ditto";
// fetch(URL).then(res=>res.json()).then(data=>
// {
// for(let i=0;i<data.abilities.length;i++)
// {
//     console.log(data.abilities[i]);
// }
// for(let i=0;i<data.forms.length;i++)
// {
//     console.log(data.forms[i]);
// }
// })

// async function fetchdata()
// {
//  let res=await fetch("https://fakestoreapi.com/products")
//  let data=await res.json();
//  let container=document.getElementsByClassName("container")[0];
//  data.forEach(obj => {
//     let p=document.createElement("p")
//     p.innerHTML=`
//     <h3>Id: ${obj.id}</h3>
//     <p>price: ${obj.price}</p>
//     <p>Description : ${obj.description}</p>
//     <img src= '${obj.image}'>
//     `
//     container.append(p)
//  });
// }
// fetchdata();

// async function fetdata()
// {
//    let res=await fetch("https://dummyjson.com/todos")
//    let data=await res.json();
//     getdata(data.todos);
// }
// function getdata(todo)
// {
//   let container=document.getElementsByClassName("container")[0]
//   todo.forEach(obj => {
//    let p=document.createElement("p")
//    p.innerHTML=`
//    <h3>Id: ${obj.id}</h3>
//    <p> todo:${obj.todo}</p>
//    <p> completed:${obj.completed}</p>
//    `
//     container.append(p)
//   });
 
// }
// fetdata();


// async function fetchdata()
// {
//    let res=await fetch("https://dummyjson.com/quotes")
//    let data= await res.json()
//  getdata(data.quotes,data)
// }
// function getdata(quote,data)
// {
//  let container=document.getElementsByClassName("container")[0]
//       container.innerHTML = `
//         <h2>Total: ${data.total}</h2>
//         <h3>Skip: ${data.skip}</h3>
//         <hr>
//     `;
//     container.innerHTML=`
//        <h3>Limit: ${data.limit}</h3>
//     `;
//  quote.forEach(obj => {
//    let p=document.createElement("p")
//    p.innerHTML=`
//    <h1 style="color:red">id:${obj.id}</h1>
//     <i> <u>quote:${obj.quote}</u></i>
//    `
//    container.append(p)
//  });
// }
// fetchdata();

// async function fetchdata()
// {
//    let res=await fetch("https://jsonplaceholder.typicode.com/photos")
//    let data=await res.json()
//    getdata(data)
// }
// function getdata(data)
// {
//    let div=document.getElementsByClassName("container")[0]
//    data.forEach(obj => {
//      let p=document.createElement("p")
//      p.innerHTML=
//      `
// <h1>albumId:${obj.albumId}</h1>
// <h2>id:${obj.id}</h2>

//      `
//        div.append(p)
//    });
 
// }
// fetchdata()

 async function fetchdata()
{
   let res=await fetch("https://pokeapi.co/api/v2/pokemon/ditto")
   let data=await res.json()
   console.log(data)
   getdata(data.abilities)
}
function getdata(data)
{
   let div=document.getElementsByClassName("container")[0]
   data.forEach(obj => {
     let p=document.createElement("p")
     p.innerHTML=
     `
<h1>name:${obj.ability.name}</h1> 
<p>url:${obj.ability.url}</p>

  `
       div.append(p)
   });
 
}
fetchdata()
