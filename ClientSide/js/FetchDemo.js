
// fetch('https://jsonplaceholder.typicode.com/todos/2',{
//     method:"GET",
//     headers:{
//          "foo":"aman"
//     }
// }).then(res =>{
//     console.log(res);
//     return res.json();
// })
// .then(data =>{
//     console.log(data);
// })
// .catch(err=>{
//     console.log(err);
// })

const getData = async(url)=>{
    const res = await fetch(url);
    const data = await res.json();
    console.log(data);
}
