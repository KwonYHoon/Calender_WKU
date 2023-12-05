import React from 'react';
import { useEffect, useState } from "react";
import axios from "axios";
import { Route, Routes } from 'react-router-dom';
import Main from './common/Main'
import Login from './common/login';
import Signup from './common/Sign_up';
import Header from './common/Header';

function App() {
  // const [connection, setConnection] = useState('');

  // const connectionTest = () => {
  //   axios
  //     .get("http://localhost:4000/")
  //     .then((response) => {
  //       setConnection(response.data);
  //     })
  //     .catch((error) => {
  //       setConnection(error.message);
  //     });
  // };

  // useEffect(() => {
  //   connectionTest();
  // }, []);

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
