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



var add=(a,b) => a+b;
 console.log(add(2,3));
 

var greet=(greett) => greett;
 console.log(greet("hello {name}!"))
 

 var number=(num) => (num%2==0)?"true":"flase";
 console.log(number(2));

 var num=(n) => (n>10)?"true":"flase";
 console.log(num(11));


 var compare = (str1,str2) => (str1.length>str2.length)? str1 : (str1.length < str2.length)? str2 :"equal length";
 console.log(compare("hello" ,"udayasri"));