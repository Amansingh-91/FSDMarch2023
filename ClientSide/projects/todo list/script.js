const addTask = document.querySelector("form");
const tasklist = document.querySelector(".tasklist");
const search =  document.querySelector('.search');
const handleSubmit = (e)=>{
    e.preventDefault();
    // getting value of input field
    // console.log(e.target[0].value);
    
    if(e.target[0].value.trim().length !== 0){
        const newTask = `<li><span>${e.target[0].value}</span><button>delete</button></li>`;
        tasklist.innerHTML += newTask;
    }
    addTask.reset();
}

addTask.addEventListener("submit",handleSubmit);

// delete task
// console.log(tasks);

const handleDelete = (e)=>{
    // console.log(e);
    if(e.target.tagName === "SPAN"){
        e.target.style.textDecoration = 'line-through';
    }
    else if(e.target.tagName === "BUTTON"){
        e.target.parentNode.parentNode.removeChild(e.target.parentNode)
    }
}
// tasks.forEach( (task)=>{
    //     task.addEventListener('click',handleDelete);
    // } )
    
    tasklist.addEventListener('click',handleDelete);
    
    const handleSearch = (e)=>{
        // console.log(e.target.value);
        const tasks = document.querySelectorAll("li");
        
        tasks.forEach((task)=>{
            // console.log(task.firstChild.textContent);
            if(!task.firstChild.textContent.includes(e.target.value)){
                console.log(task);
                task.classList.add('hide');
            }else{
                task.classList.remove('hide');
            }
        })
        
    }
    search.addEventListener('keyup',handleSearch);
    
    


// const userfuncModify =()=>{
//     console.log("network request");
//     console.log("received post data");
//     console.log("like");
    
// }
// const userfuncCopy =()=>{
//     console.log("network request");
//     console.log("received post data");
//     console.log("comment");
    
// }
// const userfunc =(task)=>{
//     console.log("network request");
//     console.log("received post data");
//     task();
    
// }

// const LikeFunc = ()=>{
//     console.log("like");
// }

// userfunc(LikeFunc);

// userfunc(()=>{
//     console.log("comment");
// })