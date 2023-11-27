import React from 'react';
import { Navigate, Route, useLocation, useNavigate } from 'react-router-dom';
import { useContext } from 'react';
import { jwtDecode as jwt_decode } from 'jwt-decode';
import { AuthContext } from '../../../Context/AuthContext';

const PrivateRoute = ({ children }) => {
  const { user } = useContext(AuthContext);
  const { state } = useLocation();  

  
  const isLoggedIn = () => {
    const token = sessionStorage.getItem('access_token');
    if (!token) {
      return false;
    }
    const decodedToken = jwt_decode(token);
    const currentTime = new Date().getTime() / 1000;
    return decodedToken.exp > currentTime;
  }
  return user.email ? children : <Navigate to="/login"
  // state={{from : history}}
  />
};

export default PrivateRoute;