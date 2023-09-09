const getData = (url) => {
   return new Promise((resolve, reject) => {
    const http = new XMLHttpRequest(); // ready state 0
    // create callback
    // readyState fron 0 t0 4
    http.addEventListener("readystatechange", (e) => {
      // console.log(e.target.status);console.log(e);
      // console.log(e);
      // console.log(e.target.status);
      if (e.target.readyState === 4 && e.target.status === 200) {
        // console.log(e.target.response);
        resolve(e.target.response);
      } else if (e.target.readyState === 4) {
        // console.log("some error occured");
        reject("some error occured");
      }
    });

    // open the request
    http.open("GET", url); // ready state 1

    // send the request
    http.send(); //
  });
};


getData('https://jsonplaceholder.typicode.com/todos/1')
.then((res)=>{
    console.log(res);
    return getData('https://jsonplaceholder.typicode.com/todos/2')
  })
  .then(res=>{
    console.log(res);
  })
  .catch((err)=>{
    console.log(err);
  });



