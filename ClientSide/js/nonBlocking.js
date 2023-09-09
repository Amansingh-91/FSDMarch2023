console.log("task1");
console.log("task2");
//non blocking code
// async function 
const myCallback =()=>{
    console.log("data downloaded");
}
                            setTimeout(myCallback,1000);
console.log("task4");

const counter = ()=>{
   let count = 0;
   return ()=>{
    console.log(count);
    count += 1;
   }
}
const inc = counter();
inc();

for (let index = 0; index < 10; index++) {
                                            setTimeout(()=>{
                                                console.log(index);
                                            },index*1000);
    
}
