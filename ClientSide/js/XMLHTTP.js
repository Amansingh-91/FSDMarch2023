// first create xmlhttprequest object
const getData = (url)=>{
    // async in nature
const http = new XMLHttpRequest(); // ready state 0
// create callback
// readyState fron 1 to 4
http.addEventListener('readystatechange',(e)=>{
    // console.log(e.target.status);console.log(e);
    // console.log(e);
    // console.log(e.target.status);
    if(e.target.readyState === 4 && e.target.status === 200){
        console.log(e.target.response);
        
    }
    else if(e.target.readyState === 4){
        console.log("some error occured");
    }
});

// open the request
http.open("GET",url);// ready state 1

// add header

// http.setRequestHeader("foo","bar");

// send the request
http.send(); // ready state 2

// ready state 3
// downloading/ receiving the response 

// ready state 4
// request response received
console.log("hello");

// query parameters
// request parameters
// request body
// request header

}

getData('https://jsonplaceholder.typicode.com/todos/1');