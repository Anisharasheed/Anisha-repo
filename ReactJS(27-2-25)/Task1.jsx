import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  function m1()
  {
    alert("Hello,My name is Anisha");
  }
 

  return (
    <>
    <button onClick={m1}>What's your name</button>
    
    </>
  );
}
function Flower() {
  function m2() {
    alert("I love Flowers,Especially Roses")
  }
  return (
    <>
     <button onClick={m2}>Tell me About Flowers</button>
    </>
  );
}
function Chocolate() {
  function m3() {
    alert("I love Chocolate,My favourite chocolate is Ferro Roacher")
  }
  return (
    <>
     <button onClick={m3}>Do you like Chocolates?</button>
      </>
  );
}
function Toys() {
  function m4() {
    alert("I like to play with Toys,My favourite Toy is Teddy Bear")
  }
  return (
    <>
     <button onClick={m4}>So What you think about Toys?</button>
      </>
  );
}
function Food() {
  function m5() {
    alert("I like Noodles,My favourite Noodles is Chowmein")
  }
  return (
    <>
       <button onClick={m5}>What's your Favorite Food?</button>
   
      </>
  );
}


export { App, Flower,Chocolate,Toys,Food }
