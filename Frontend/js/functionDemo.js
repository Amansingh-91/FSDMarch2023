console.log("Function Demo");

// creating a function in Js

// normal way for creating function

// greeting();

// function greeting(){
//     console.log("Hello World");
// }

// // calling function
// greeting();

// // function with parameters

// function greetingWithName(name,age){
//     console.log(`Hello ${name}, Good Evening`);
//     console.log(age);
//     // console.log("Hello " + name +", Good Evening");
// }

// greetingWithName("Aman",27);

// // undefined variable

// // let age ; //undefined

// // console.log(age);


// // function with default value for parameter

// function greetingWithNameDefault(name = "Jhon"){
//     console.log(`Hello ${name}, Good Evening`);
// }

// greetingWithNameDefault("Rahul")

// function as expression

// const greeting = function(){
//     console.log("Hello World");
// }

// greeting();
// greetingWithName("Rahul");

let greetingWithName = function(name="jhon"){
    console.log(`Hello ${name}, Good Evening`);
}

greetingWithName("Rahul");

// arrow function

const greeting = () => {
    console.log("Hello World");
}

greeting();

// function with return 

// function sumTwoNumber (num1,num2){
//     return num1 + num2;
// }

// const sumTwoNumber  = function(num1,num2){
//     return num1 + num2;
// }

const sumTwoNumber = (num1,num2) => num1+num2;
