import {BrowserRouter,Routes,Route} from 'react-router-dom'
import logo from './logo.svg';
import './App.css';
import Homepage from './pages/Homepage';
import Dashboard from './components/Dashboard/Dashboard/Dashboard';
import SignInForm from './pages/Login/LoginMain/SignInForm';
import AppointMent from './components/AppointMent/AppointMent/AppointMent';
import AllPatients from './components/AppointMent/AllPatients/AllPatients';
import AddDoctor from './components/Dashboard/AddDoctor/AddDoctor';
import DoctorList from './components/Dashboard/DoctorList/DoctorList';
import AddReview from './components/Dashboard/My Review/AddReview';
import PrivateRoute from './pages/Login/PrivateRoute/PrivateRoute';
function App() {
  return (
    <>
      <BrowserRouter>
      <Routes>
        <Route path='/' element={<Homepage/>}/>
        <Route path='/login1' element={<SignInForm/>}/>
        <Route path='/dashboard' element={<Dashboard/>}/>
        <Route path='/appointment' element={<PrivateRoute><AppointMent/></PrivateRoute>}/>
        <Route path='/patients' element={<AllPatients/>}/>
        <Route path='/addDoctor' element={<AddDoctor/>}/>
        <Route path='/doctors' element={<DoctorList/>}/>
        <Route path='/auth/review' element={<AddReview />}/>







        

      </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
