const mongoose =require ('mongoose');


const OurServices = new mongoose.Schema({
    title:{
        type:String,
        required:true,
    },
    time:{
        type:String,
        required:true,
    },
    space:{
        type:Number,
        required: true,
    }
})

module.export=mongoose.model("OurServices", OurServices)
