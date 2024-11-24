// import logo from '../logo.svg';
// import {useState} from 'react';
// import '../App.css';                       // its is having multiple buttons

// function Test1(){

//     const content=[
//         ["React is extremely popular",
//         "It makes building complex, interactive UIs a breeze",
//         "It's powerful & flexible",
//         "It has a very active and versatile ecosystem"
//     ],
//     [
//         "Components, JSX & Props",
//         "State",
//         "Hooks (e.g., useEffect())",
//         "Dynamic rendering"

//     ],
//     [
//         "Official web page (react.dev)",
//         "Next.js (Fullstack framework)",
//         "React Native (build native mobile apps with React)"

//     ],
//     [
//         "Java is Simple",
//         "Java is Robust",
//         "Java is Multithreaded"

//     ]
//     ];
//     const [activeContentIndex,SetactiveContentIndex]=useState(0);

//     return(

//         <div className="App">
//              <header className="App-header">
//             <img src={logo} className="App-logo" alt="logo"/>
//             <div>
//             <h1>React.js</h1>
//             <p>i.e., using the React library for rendering the UI</p>
//             </div> 
//         <div id="tabs">
//             <menu>
//                 <button className={activeContentIndex===0? "active":""}
//                     onClick={()=>SetactiveContentIndex(0)}
//                     >
//                         Why React?
//                 </button>
//                 <button className={activeContentIndex===1? "active":""}
//                     onClick={()=>SetactiveContentIndex(1)}
//                     >
//                     Core Features

//                 </button>

//                 <button className={activeContentIndex===2? "active":""}
//                     onClick={()=>SetactiveContentIndex(2)}
//                     >
//                     Related Resources

//                 </button>

//                 <button className={activeContentIndex===3? "active":""}
//                     onClick={()=>SetactiveContentIndex(3)}
//                     >
//                         What is Java ?
//                 </button>
//             </menu>

//             <div id="tab-content">
//                 <ul>

//                     {content[activeContentIndex].map((item) => (
//                     <li                                                       //here intially it is zero and it display and next when we click button it update value and this time tnis map also update
//                     // key={item}>{item}
//                     >{item}
//                     </li>
//                     ))}
//                 </ul>
//             </div>
//         </div>  
//         </header>
//         </div>
//     );
// }

// export default Test1;

import { useState } from "react";
import '../App.css';                             //having only one button.
//as the home is called first then by the fields it navigates to the other parts (functions)

 import logo from '../logo.svg';


//for arranging alignment ctrl+A(to select) alt+shift+F
//it is an array providing menuoptions
const menuOptions = [
    {
        id: 0,
        name: 'Why React?'
    },
    {
        id: 1,
        name: 'J2SE'
    },
    {
        id: 2,
        name: 'J2EE'
    },
    {
        id: 3,
        name: 'Frameworks'
    },
    {
        id: 4,
        name: 'Web UI'
    }
];
//it is an array to provide content to display based on click.
const content = [
    [
        "React is extremely popular",
        "It makes building complex, interactive UIs a breeze",
        "It's powerful & flexible",
        "It has a very active and versatile ecosystem"
    ],
    [
        "Core Java ",
        "Opps Through all concepts"
    ],
    [                                          
        "Servlets",
        "JSP"
    ],
    [
        "Spring",
        "Spring Boot with Micro Services Architecture"
    ],
    [
        "HTML",
        "CSS",
        "JS",
        "Bootstrap",
        "React"
    ]
];
//menu component
const Menu = ({ option, activeContentIndex, setActiveContentIndex }) => {
    return (
        <button
            className={activeContentIndex === option.id ? "active" : ""}
            onClick={() => setActiveContentIndex(option.id)} >
            {option.name}
        </button>
    );
}
//display component
const DisplayContent = ({ activeContentIndex }) => {
    return (
        <div id="tab-content">
            <ul>
                {content[activeContentIndex].map(
                    (item) => (
                        <li key={item}>{item}</li>
                    ))}
            </ul>
        </div>
    );
}
//header component
const Header = () => {
    return (
        <div>
            <h1>React.js</h1>
            <p>i.e., using the React library for rendering the UI</p>
        </div>
    );
}
const Tabs = ({ activeContentIndex, setActiveContentIndex }) => {
    return (
        <div id="tabs">
            <menu>
                {
                    menuOptions.map((option) =><Menu
                        option={option}
                        activeContentIndex={activeContentIndex}
                        setActiveContentIndex={setActiveContentIndex}
                    />)
                }
            </menu>
        </div>
    );
}
const Home = () => {
    const [activeContentIndex, setActiveContentIndex] = useState(0);
    return (
        <div className="App">
            <Header />
            <Tabs activeContentIndex={activeContentIndex} setActiveContentIndex={setActiveContentIndex} />
            <DisplayContent activeContentIndex={activeContentIndex} />
        </div>
    );
}
export default Home;





