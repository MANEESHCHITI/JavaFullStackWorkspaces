import logo from '../logo.svg';
import { useEffect, useState } from "react";
import '../App.css';
function FetchEclipse() {
    const [activeItemId, setActiveItemId] = useState(0);
    const [items, setItems] = useState([]); useEffect(() => {
        //need to connect service only once
        fetch('http://localhost:9090/getItems').then((response) => {
            response.text().then((items) => {
                console.table(JSON.parse(items));
                setItems(JSON.parse(items));
            });
        })
    }, [])
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <div>
                    <h1>React.js</h1>
                    <p>i.e., using the React library for rendering the UI</p>
                </div>
            </header>
            <div id="tabs">
                <menu>
                    {
                        items && items.map(item => {
                            return (
                                <button className={activeItemId === item.id ? "active" : ""}
                                    onClick={() => setActiveItemId(item.id)}> {item.name} </button>
                            );
                        })
                    }
                </menu>
            </div>
            <div id="tab-content">
                <ul>
                    {
                        items && items.find((item) => item.id === activeItemId)
                            ?.content?.map(item => <li key={item.id}> {item} </li>)
                    }
                </ul>
            </div>
        </div>
    );
}
export default FetchEclipse;