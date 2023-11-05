const express=require('express');
const router=express.Router();
const userController=require('../controllers/userController');
const validatetoken=require('../utils/auth_middleware');
const validateRole=require('../utils/auth_role')
router.post('/login',userController.login)
router.post('/signup',userController.createUser)


router.post('/user',userController.createUser)
router.get('/user',userController.getUsers)
router.put('/user/:id',userController.updateUser)
router.delete('/user/:id',userController.deleteUser)

router.get('/dashboard',validatetoken,validateRole(['Super User']),userController.dashboard)



module.exports=router;