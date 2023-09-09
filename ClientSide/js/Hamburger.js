const button = document.querySelector("button");
const menu =  document.querySelector("div");
const closeMenu = document.querySelector("span");
button.addEventListener("click",(e)=>{
    menu.classList.remove("hide");
    button.classList.add("hide");
})

closeMenu.addEventListener("click",e=>{
    menu.classList.add("hide");
    button.classList.remove("hide");
})