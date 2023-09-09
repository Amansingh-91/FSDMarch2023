const express = require("express");
const cors = require("cors");
const jwt = require("jsonwebtoken");
const app = express();

app.use(cors());
app.use(express.json());

app.post("/login",(req,res)=>{
    console.log(req.headers);
    // console.log(req)
    console.log(req.body);
    if(req.body.email && req.body.password){
        if(req.body.email === "aman@123.com" && req.body.password === "aman"){
            res.json({success:true,msg:"successfully logged in",data:{
                accessToken : jwt.sign({email:req.body.email,password:req.body.password},"human is beautiful")
            }})
        }
    }
    res.status(200).send("data received");
})

app.get("/getdata/:id",(req,res)=>{
    
    res.json({success:true,msg:"some data here"})
})

app.listen(3000,()=>{
    console.log("server is listening on port 3000");
})