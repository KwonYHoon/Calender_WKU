import React from 'react';
import { Route, Routes } from 'react-router-dom';
import Main from './common/Main'
import Login from './common/login';
import Signup from './common/Sign_up';
import Header from './common/Header';

function App() {
  return (
    <>
    <Header/>
    <Routes>
        <Route path='/' element = {<Main />} />
        <Route path='/login' element = {<Login />} />
        <Route path='/signup' element = {<Signup />} />
    </Routes>
    </>
  );
}

export default App;
