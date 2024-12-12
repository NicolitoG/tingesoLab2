import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';

const ClientLogged = () => {

  const navigate = useNavigate();

  const goToSimularCredito = () => {
    navigate('/client/logged/simulation');
  };

  const goToPedirCredito = () => {
    navigate('/placeholder');
  }

  return (
    <div>
      <p>
        <h1>Cliente logueado correctamente</h1>
      </p>
      
      <p>
        <button onClick={goToSimularCredito}> Simular credito </button>
        <button onClick={goToPedirCredito}> Pedir un credito</button>
      </p>
    </div>
  );
};

export default ClientLogged;