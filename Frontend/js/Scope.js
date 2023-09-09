greet();
console.log("Scope of variable");


// const x = 10; // block scope

// // if(x === 10){
// //     console.log(x);
// //     let y = 20;
// // }
// // console.log( y);

const myScope = ()=>{
    let x = 10;
    if(x === 10){
        var y = 20; //function scope
    }
    console.log(y);
}
myScope()
// console.log(y);

// Hoisting

function greet(){
    console.log("hello");
}