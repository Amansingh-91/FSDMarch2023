const first = document.querySelector(".first");
const second = document.querySelector(".second");

first.addEventListener("click",(e)=>{
   console.log("first");
   if(first.childNodes[1].textContent === "some text"){
       first.childNodes[1].textContent = "Random Text";

   }
   else{
    first.childNodes[1].textContent = " some text";
   }
});


second.addEventListener("click",(e)=>{
    e.stopPropagation();
    console.log("second");

 });