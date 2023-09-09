console.log("Dom manuplation");

// selecting the single element on dom

const headingOne = document.querySelector("h1.night");
console.log(headingOne);
console.log(headingOne.innerHTML);
console.log(headingOne.innerText);


// electing the multiple element on dom
const allPara = document.querySelectorAll(".night");
console.log(allPara);

// perform Manuplation

// adding or removing css

headingOne.style.backgroundColor = "yellow";
headingOne.style.border = "none";

console.log(allPara[1]);
allPara[1].style.backgroundColor = "white";
// allPara[1].removeAttribute("backgroundColor");

// adding or removing elements to the dom

// selecting the parent on dom
// heading one will be our parent

// create the element
// const a = document.createElement("a");
// a.innerText = "Click me";
// a.href = "https://www.google.com";

// // add element to the parent
// headingOne.appendChild(a);

headingOne.innerHTML += `<a href="https://www.google.com">Click Me</a>`;

console.log(headingOne.innerHTML);
console.log(headingOne.innerText);

// removing the element

allPara[1].remove();

// adding or removing classes

const body = document.querySelector("body");
body.classList.add("dark");

headingOne.classList.remove("night");



// Events

// if we want to perform some side efffect to that event
// we will use event listeners
const generateRandomColor = ()=>{
const randomColor = Math.floor(Math.random()*16777215).toString(16);
  return "#" + randomColor;
  
}

const handleMouseOver =(event)=>{
    console.log(event);
    event.target.style.backgroundColor = generateRandomColor();

}
headingOne.addEventListener("mouseover",handleMouseOver);

// selecting element

const myHeading = document.querySelector("#myheading");

const handleClick = (e)=>{
    headingOne.style.color = generateRandomColor();
}

myHeading.addEventListener("click",handleClick);