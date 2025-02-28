import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import {App,Flower,Chocolate,Toys,Food} from './App.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
    <Flower />
    <Chocolate />
    <Toys />
    <Food/>
  </StrictMode>,
)
