// const password = document.querySelector("#password");
// const para = document.querySelector("#validatePass");
// const handleEmail = (e)=>{
//     console.log(e.target.value);
//     if(e.target.value.trim().length < 8){
//         para.innerText = "not a valid pass"
//     }
//     else{
//         para.innerText = "";
//     }
// }
// password.addEventListener('keyup',handleEmail);

const form =  document.querySelector("form");

const handleSubmit = (e)=>{
    // e.preventDefault();
    console.log("hello");
}

form.addEventListener("submit",handleSubmit);