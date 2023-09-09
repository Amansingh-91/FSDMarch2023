import Add from "./ImportExportDemo.js";
import { sub , mul } from "./ImportExportDemo.js";
// let const

// class 

// class student{
//     constructor(name,course,contact){
//         this.name = name;
//         this.course = course;
//         this.contact = this.contact;
//     }
//     getName() {
//         return this.name;
//     }

// }

// const student1 = new student("aman");
// console.log(student1.getName());

// arrow function

// spread operator ...

const arr1 = [1,2,3];
const arr2 = [4,5,6];

const arr3 = [...arr1,...arr2]
console.log(arr3);

// arr1.forEach(ele =>{
//     arr3.push(ele);
// })
// arr2.forEach(ele =>{
//     arr3.push(ele);
// })

// console.log(arr3);

const student = {
    name:"Aman",
    course: "fsd",
}

const proStudent = {
    ...student,
    pro : true,
}

console.log(proStudent);

// destructuring
// const name = proStudent.name;
// const course = proStudent.course;

const {name,course} = proStudent; 

console.log(name,course);

const arr4 = ["Aman",183,27];

const [firstname,height] = arr4;

console.log(firstname,height);


// import export

console.log(Add(10,20));


console.log(sub(10,20));

