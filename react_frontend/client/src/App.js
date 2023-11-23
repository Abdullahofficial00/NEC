import {BrowserRouter,Routes,Route} from 'react-router-dom'
import logo from './logo.svg';
import './App.css';
import Homepage from './pages/Homepage';
import Login from './pages/Login';
import Register from './pages/Register';
import SignInForm from './components/Login/LoginMain/SignInForm';

function App() {
  return (
    <>
      <BrowserRouter>
      <Routes>
        <Route path='/' element={<Homepage/>}/>
        <Route path='/login' element={<Login/>}/>
        <Route path='/login1' element={<SignInForm/>}/>

        <Route path='/register' element={<Register/>}/>
      </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
