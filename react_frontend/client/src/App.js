import {BrowserRouter,Routes,Route} from 'react-router-dom'
import logo from './logo.svg';
import './App.css';
import Homepage from './pages/Homepage';
import Login from './pages/Login';
import Register from './pages/Register';
import Dashboard from './components/Dashboard/Dashboard/Dashboard';
import SignInForm from './pages/Login/LoginMain/SignInForm';
import AddDoctor from './components/Dashboard/AddDoctor/AddDoctor';
import DoctorList from './components/Dashboard/DoctorList/DoctorList';
import AddReview from './components/Dashboard/My Review/AddReview';

function App() {
  return (
    <>
      <BrowserRouter>
      <Routes>
        <Route path='/' element={<Homepage/>}/>
        <Route path='/login' element={<Login/>}/>
        <Route path='/login1' element={<SignInForm/>}/>
        <Route path='/login1' element={<Dashboard/>}/>
        

        <Route path='/register' element={<Register/>}/>
      </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
