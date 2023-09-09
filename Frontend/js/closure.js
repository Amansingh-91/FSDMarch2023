console.log("Closure");

// let counter = 0;

// const incCounter = ()=>{
//     counter = counter +1;
//     console.log(counter);
// }

// incCounter();
// incCounter();
// counter = 10;//
// incCounter();
// incCounter();

const counter = ()=>{
    let count = 0;//lexical
    return () =>{
        count = count +1;
        console.log(count);
    }
}

let incCount=counter();

incCount();
incCount();
incCount();

console.log("hiii");
incCount();


