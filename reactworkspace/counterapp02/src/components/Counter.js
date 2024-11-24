 import React,{useState} from "react";
 function Counter(){
    const[count,setCount]=useState(0); // here setCout is to update count like it is same as setter method.
    const add=()=>{          // instead of this line we can wrwitew function add(){}
        setCount(count +1);
    }
 
    return(
        <div>
        <h1>info</h1>
        {count}
        <button onClick={add}>increment</button>
        </div>
    );
 }
 export default Counter;