const form  =  document.querySelector("form");

const handleSubmit = (e)=>{
    e.preventDefault();
    console.log(e);
    console.log(e.target[0].value);
    console.log(e.target[1].value);
    const body = {
        email:e.target[0].value,
        password:e.target[1].value
    }
    const http = new XMLHttpRequest();

    // add 
        http.addEventListener('readystatechange',(e)=>{
            if(e.target.readyState === 4 && e.target.status === 200){
                const data = JSON.parse(e.target.response);
                console.log(data.data);
                localStorage.setItem("asccessToken",data.data.accessToken)
            }
        })
        // http.onreadystatechange = (e)=>{
        //         if(e.target.readyState === 4 && e.target.status === 200){
        //             console.log(e.target.response);
        //         }
        //     }
    // open
    http.open("POST","http://localhost:3000/login",true);
    http.setRequestHeader("Content-Type","application/json");
    http.setRequestHeader("foo","bar");
    // const send
    console.log(JSON.stringify(body));
    http.send(JSON.stringify(body));


    // fetch("http://localhost:3000/login",{
    //     method:"POST",
    //     headers: {
    //         "Content-Type": "application/json",
    //         "foo" : "bar"
    //         // 'Content-Type': 'application/x-www-form-urlencoded',
    //       },
    //     body:JSON.stringify(body)
    // }).then(res=>{
    //     console.log(res);
    // })
}

form.addEventListener('submit',handleSubmit);



