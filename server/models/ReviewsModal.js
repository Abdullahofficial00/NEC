const mongoose =require ('mongoose');


const ReviewSchema = new mongoose.Schema({
    name:{
        type:String,
        required:true,
    },
    email:{
        type: String,
        required: true,
        unique: true,
    },
    desc:{
        type: String,
        required: true,
    },
    address:{
        type: String
    },
    image:{
        type: String,
        default: null
    },
    user_id:{
        type: String,
        unique: true,
        required: true
    },
}, {timestamps:true})

module.export= mongoose.model("reivews", ReviewSchema);