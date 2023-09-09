const body = document.querySelector(".container");
console.log(body);
const div = document.querySelector(".child");
console.log(div);
body.addEventListener("mousemove",(e)=>{
    // console.log(e);
    div.style.left = `${e.clientX}px`;
    div.style.top = `${e.clientY}px`;
    
})
