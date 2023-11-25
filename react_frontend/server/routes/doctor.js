const express=require('express');
const { AddAppointMentCollection, AppointmentPatientsList, appointMentByDate, DoctorList, IsDoctor, AddServices, ServicesList, AddReview, ReviewsList, UpdateUserInfo } =require( "../controllers/doctor.js");
const { login, register, viewUser } = require("../controllers/user");
const { verifyAdmin, verifyToken, verifyUser } =require ('../utils/verifyToken.js');

const router = express.Router();
router.get("/checkauthentication",verifyToken, (req, res, next)=>{
  res.send("working token ")
})
//admin can access
router.post('/auth/addServices',verifyToken,verifyAdmin, AddServices);


//user or admin can access
router.post('/auth/addAppointMent',verifyToken, AddAppointMentCollection);
router.post('/auth/appointByDate', verifyToken, verifyUser, appointMentByDate);
router.post('/auth/addReview', verifyToken, AddReview);
router.put('/auth/updateInfo/:id', verifyToken,UpdateUserInfo);
router.get('/auth/patients', verifyToken, verifyUser,AppointmentPatientsList);
router.get('/auth/users',verifyToken, verifyAdmin,viewUser);


//global
router.get('/auth/ourServices', ServicesList);
router.post('/auth/isDoctor',IsDoctor);
router.get('/auth/reviews', ReviewsList);
router.get('/auth/doctors', DoctorList);

//auth
router.post('/auth/register', register);
router.post('/auth/login', login);
module.exports=router;
