// normal function

// call

greet();

// declare and define function
function greet(){
    // var i =10;
    console.log("Hello Friend");
}




// // function with parameter 

// function greetWithName(name = "jhon",time = "evening" ){
//     console.log(`Hello ${name},good ${time}`);
// }

// greetWithName();

// // function with return

// function sumOfTwoNumber(num1 = 0 , num2 = 0){
    //     return num1 + num2;
    // }

    // const sum = sumOfTwoNumber(1,10);
// console.log(sum);


// function as an expression

// const  x = 10;

// const greet = function (){
//     console.log("Hello Friends");
// }

// greet();
// greetWithName();

// const greetWithName = function (name = "jhon",time = "evening"){
//     console.log(`Hello ${name},good ${time}`);
    
// }
// greetWithName();


// hoisting 

// var const let

// scope 

// functional scope

var variableDemo = function (){
    // var k ;
    let i = 10 ;
    const j = 20; // block scope //non changable, constant
    console.log(k);
    if(true){
        i =20;
        console.log(i);
        var k = 15;
        let z = 20;
    }
    // console.log(z);
}
// console.log(k);

variableDemo();

// if(true){
//     var d = 55;
// }

// console.log(d);

// arrow function

const greetWithName = (name = "aman",time="evening") =>{

    console.log(`Hello ${name},good ${time}`);

}

greetWithName("jim");

const sumOfTwoNumber = (num1,num2) => num1 + num2;

console.log(sumOfTwoNumber(12,15));

// closure

// const func1 = ()=>{
//     console.log("func 1");
//     const func2 =()=>{
//         console.log("func 2");
//     }
//     func2();
// }

// func1()

const Counter = ()=>{
    let count = 0;
    const incCount = ()=>{
        count += 1;
        console.log(count);
    }
    console.log(count,"complete");
    return incCount;
}

const inCount = Counter();
inCount();
inCount();
inCount();
inCount();
