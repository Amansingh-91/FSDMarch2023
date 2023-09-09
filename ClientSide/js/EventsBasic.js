const h1 = document.querySelector(".second");
function random(number) {
    return Math.floor(Math.random() * (number + 1));
  }

const handleClick = (e)=>{
    
    const rndCol = `rgb(${random(255)}, ${random(255)}, ${random(255)})`;
  h1.style.backgroundColor = rndCol;
}

h1.addEventListener("mouseover",handleClick);
// call back functions

