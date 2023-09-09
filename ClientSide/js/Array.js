const arr = ["Aman","dharam","divya"];

const newData = arr.forEach(name =>{
    console.log(name);
    return `${name} X`;
})

console.log(arr);
console.log(newData);

const newDataMap = arr.map(name =>{
    console.log(name);
    return `${name} Y`;
});

console.log(arr);
console.log(newDataMap);

const newDatafilter= arr.filter(name => name !=="Aman")
console.log(arr);
console.log(newDatafilter);
