// syncronous nature
// blockin code
console.log("task1 app1");
console.log("task2 app2");
setTimeout(()=>{
    for(let i =0; i < 100000;i++){
        console.log("hello");
    }
},1);
console.log("task3 app1");
console.log("task4 app4");

// functions passed as parameter are callback
const sumitup = (num1,num2,myfunc)=>{
    return myfunc(num1,num2);
}

console.log(sumitup("Aman","Saini",(a,b)=>a+b));
console.log(sumitup({Name:"Aman"},{Name:"Saini"},(a,b)=>a.Name+b.Name));
console.log(sumitup([1,2,3],[4,5,6],(a,b)=>[...a,...b]));
