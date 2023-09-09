
// select element on dom

// used to select single element on dom
const h1 = document.querySelector(".second");

console.log(h1);

// select multiple elements on dom

// const allP= document.querySelectorAll("p");
// console.log(allP);

// const allh1 = document.getElementsByTagName("h1");
// console.log(allh1);

// element content manuplation

// h1.innerText = "Aman Saini"

const para2 = document.querySelector("#para2");

// Add the content

console.log(para2.innerText);
console.log(para2.textContent);
// replace
para2.innerText = para2.innerText + "humans are amazing being"

// change the html
para2.innerHTML = "<a href='#'>i am new html</a>";

// selecting 

const div = document.querySelector("#demo");

const newheading = document.createElement('h1');

newheading.textContent = "New Div Heading";

div.appendChild(newheading);

const names = ["Aman","Divya","Dharam"];

names.forEach((name)=>{
    const newElement = document.createElement('h1');
    newElement.textContent = name;
    div.appendChild(newElement);
})


// delete the element

// first select the element

// then

div.parentElement.removeChild(div);


// adding style

// select the element 

// h1.setAttribute("style","color:red;font-size:50px")



// h1.setAttribute("style","color:yellow");

h1.style.color = "yellow";

h1.style.fontSize = "50px";

h1.style.color = "red";

h1.style.fontSize = "";


