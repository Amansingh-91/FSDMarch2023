const getData = async(url)=>{
    try {
        const res = await fetch(url);
        console.log(res);
        const data = await res.json();
        console.log(data);
        return data;
    } catch (error) {
        return "error occured" + error.toString();
    }
}
const container = document.querySelector(".container");

getData("https://fakestoreapi.com/products").then(data=>{
    
     const products = data.map(product =>{
        return (`
        <div class="item" id = '${product.id}'>
            <img src=${product.image} alt="product image" >
            <h3>${product.title}</h3>
            <h6> $${product.price}</h6>
        </div>
        `);
    });
    console.log(products);

    products.forEach(product => {
        container.innerHTML += product;
        
    });

});

const sendData = async(url,bodyData ,mimeType)=>{
    const res = await fetch(url,{
            method:"POST",
            headers:{
                "Content-Type" : mimeType
            },
            body:JSON.stringify(
                bodyData
            )
        });
    const data = await res.json();
    console.log(data);
}

sendData('https://fakestoreapi.com/products',{
    title: 'test product',
    price: 13.5,
    description: 'lorem ipsum set',
    image: 'https://i.pravatar.cc',
    category: 'electronic'
},"application/json");

