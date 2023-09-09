const shape = document.querySelector(".shape");
const time = document.querySelector("span");
const superdiv = document.querySelector(".super");
const startApp = (e) => {
  superdiv.classList.remove("hide");
  var start = Date.now();
  const calculateTime = (e) => {
    const stopTime = Date.now();
    // console.log(stopTime - start);
    const totalTime = (stopTime - start) / 1000;
    // console.log(totalTime);
    time.textContent = totalTime;
    shape.style.left = `${generateRandomCoordinate(400)}px`;
    shape.style.top = `${generateRandomCoordinate(400)}px`;
    // if(generateRandomCoordinate(10) > 5){
    //     shape.classList.add("circle");
    // }
    // else{
    //     shape.classList.remove("circle");
    // }
    shape.style.borderRadius = `${generateRandomCoordinate(60)}%`;

    shape.style.backgroundColor = getRandomColor();

    shape.style.width = `${generateRandomCoordinate(200) + 50}px`;
    shape.style.height = `${generateRandomCoordinate(200) + 50}px`;

    start = Date.now();
  };

  const generateRandomCoordinate = (range) => {
    return Math.round(Math.random() * range);
  };
  function getRandomColor() {
    var letters = "0123456789ABCDEF";
    var color = "#";
    for (var i = 0; i < 6; i++) {
      color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
  }
  //

  shape.addEventListener("click", calculateTime);
  const stopbtn = document.querySelector(".stop");

  stopbtn.addEventListener("click", (e) => {
    shape.removeEventListener("click", calculateTime);
    superdiv.classList.add("hide");
  });
};

const startbtn = document.querySelector(".start");

startbtn.addEventListener("click", startApp);
