const volumeOfBox = (l,b,h)=>{
    return l * b * h;

}

console.log(volumeOfBox(2,2,2));

const curryVolumeOfBox = (l)=>{
    return (b)=>{
        return (h)=>{
            return l * b * h;
        }
    }
}

console.log(curryVolumeOfBox(2)(2)(2));