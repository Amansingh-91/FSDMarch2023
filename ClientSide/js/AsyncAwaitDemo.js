// const num = 20;
// const res = fetch("https://jsonplaceholder.typicode.com/todos/1");
// console.log(num);
// console.log(res,"complete");

const getData = async(url)=>{
    const res = await fetch(url);
    // console.log(res);
    let data;
    if(res.status === 200){
        data = await res.json();
    }

    // console.log(data);
    return new Promise((resolve,reject)=>{
        if(data){
            resolve(data);
        }
        else{
            reject("some error occured");
        }
    })
}
getData("https://jsonplaceholder.typicode.com/todos/1").then(data=>{
    console.log(data);
}).catch(err=>{
    console.log(err);
})

