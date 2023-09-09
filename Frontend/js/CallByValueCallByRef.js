console.log("call by value");

let a = 10;
let b = 20;

const swap = (x,y)=>{
    console.log("before swap in function ",x,y);
    let c =  x;
    x = y;
    y = c;
    console.log("after swap infunction ",x,y);
}

console.log("before swap outside function ",a,b);

swap(a,b);

console.log("after swap outside function ",a,b);


// call by refrence

console.log("call by ref");
// object and array are refernece type
const obj = {
    a :10,
    b :20, 
}
// const x = obj;
// x.z = 30;
// console.log(obj);

const swapByRef = (obj)=>{
    console.log("before swap in function ",obj.a,obj.b);
   
    
    let c =  obj.a;
    obj.a = obj.b;
    obj.b = c;
    console.log("after swap infunction ",obj.a,obj.b);
}


console.log("before swap outside function ",obj.a,obj.b);

swapByRef(obj);

console.log("after swap outside function ",obj.a,obj.b);


