const express=require('express')
const app=express();
const cors =require('cors');
const dotenv =require( 'dotenv');
const cookieParser =require( 'cookie-parser');
const PORT=8081;
require('./utils/dp')
const bodyparser=require('body-parser')

const userRouter=require('./routes/doctor')
dotenv.config();
app.use(cors());
app.use(cookieParser())
app.use(bodyparser.json())
app.use('/api/v1',userRouter)

app.get('/',(req,res)=>{
    res.send("Welcome to user CRUD");

})
app.listen(PORT,()=>{
    console.log("Server running on port",PORT)
})