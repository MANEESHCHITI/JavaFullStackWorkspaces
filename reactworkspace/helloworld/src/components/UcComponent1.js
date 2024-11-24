import { useState, createContext, useContext } from "react";
import ReactDOM from "react-dom/client";
const UserContext = createContext();
function UcComponent1() {
    const [user, setUser] = useState("Srikanthh");
    return (
        <UserContext.Provider value={user}>
            <h1>{`Welcome ${user}!`}</h1>
            <UcComponent2 />
        </UserContext.Provider>
    );
}
function UcComponent2() {
    return (
        <>
            <h1>Component 2</h1>
            <UcComponent3 />
        </>
    );
}
function UcComponent3() {
    return (
        <>
            <h1>Component 3</h1>
            <UcComponent4 />
        </>
    );
}
function UcComponent4() {
    return (
        <>
            <h1>Component 4</h1>
            <UcComponent5 />
        </>
    );
}
function UcComponent5() {
    const user = useContext(UserContext);
    return (
        <>
            <h1>Component 5</h1>
            <h2>{`Welcome Back ${user} again!`}</h2>
        </>
    );
}
export default UcComponent1;