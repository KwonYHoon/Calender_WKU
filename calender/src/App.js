import React from 'react';
import { Route, Routes } from 'react-router-dom';
import { Link, useLocation } from 'react-router-dom';
import Header from './common/Header';
import Login from './common/login';
import Signup from './common/Sign_up';
//import Header from './common/Header';

function App() {
  return (
    <>
    <Routes>
        <Route path='/login' element = {<Login />} />
        <Route path='/signup' element = {<Signup />} />
    </Routes>
    </>
  );
}

export default App;
