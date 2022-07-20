import React, {useEffect, useState} from 'react';
import './App.css';

function App() {

  const [aMessage, setAMessage] = useState<string>();
  const [bMessage, setBMessage] = useState<string>();

  const mserviceAUrl = 'http://localhost:3010/api/a/home';
  const mserviceBUrl = 'http://localhost:3020/api/b/home';

  useEffect(() => {

    fetch(mserviceAUrl, {headers : {'Content-Type' : 'text/plain'}, method : "GET"})
      .then(res=>  res.text())
      .then(
        (result: string) => {
          setAMessage(result)
        },
        (error) => {
          setAMessage("Error for mserviceA message: " + error);
        }
      );

    fetch(mserviceBUrl, {headers : {'Content-Type' : 'text/plain'}, method : "GET"})
      .then(res=>  res.text())
      .then(
        (result: string) => {
          setBMessage(result)
        },
        (error) => {
          setBMessage("Error for mserviceB message: " + error);
        }
      );

  }, [])

  return (
    <div className="App">
      <header className="App-header">
        <p>
          CICD-QA Sample App
        </p>
      </header>
      <div>
        <div className="App-row">
          <div className="App-panel">
            MService A Message
            <hr /><br /><br /><br />
            {aMessage}
          </div>
          <div className="App-panel">
            MService B Message
            <hr /><br /><br /><br />
            {bMessage}
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
