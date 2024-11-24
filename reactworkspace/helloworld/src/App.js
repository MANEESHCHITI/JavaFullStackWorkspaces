import logo from './logo.svg';
import './App.css';
import './components/Test1';
import Home from './components/Test1';
import ListComponent from './components/ListComponent';
import HookCounterOne from './components/HookCounterOne';
import FetchEclipse from './components/FetchEclipse';
import Component1 from './components/Component1';
import UcComponent1 from './components/UcComponent1';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
              
          Learn React
        
        </a>
        {/* <Home />  */}
        {/* <ListComponent /> */}
        {/* <HookCounterOne /> */}
        {/* <FetchEclipse /> */}
        {/* <Component1 /> */}
        <UcComponent1 />
        
      </header>
      
    </div>
  );
}

export default App;
