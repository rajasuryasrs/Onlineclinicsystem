import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { CSSTransition } from 'react-transition-group';
import './Loginpage.css';
import Navbar from './Navbar';


function LoginPage() {
  const [type, setType] = useState('');
  const[cid,setUsername]=useState('');
  const[password,setPassword]=useState('');
  const navigate = useNavigate();

  const handleSubmit = (event) => {
    event.preventDefault();
    const username = event.target.username.value;
    const password = event.target.password.value;

    if (type === 'admin' && username === 'AD001' && password === 'AD001') {
      navigate('/AddDoctor');
    } else if (type === 'admin' && username === 'AD002' && password === 'AD002') {
      navigate('/ViewDoctor'); 
    } else if (type === 'admin' && username === 'AD003' && password === 'AD003') {
      navigate('/ModifyDoctor'); 
    } else if (type === 'admin' && username === 'AD004' && password === 'AD004') {
      navigate('/deleteDoctor'); 
    } else if (type === 'reporter' && username === 'RE001' && password === 'RE001') {
      navigate('/reporter');
    }else if (type === 'patient' &&( username === 'US001' && password === 'US001')) {
        navigate('/ResigsterProfile'); 
    } else {
      alert('Incorrect username or password');
    }
  };

  return (
    <>
    <Navbar/>
    <div className="login-page">
      <div className="login-f-container">
        <form onSubmit={handleSubmit}>
          <div className="input-container">
            <label htmlFor="type">User Type:</label>
            <select id="type" name="type" value={type} onChange={(event) => setType(event.target.value)}>
              <option value="">Select a type</option>
              <option value="admin">Admin</option>
              <option value="patient">Patient</option>
              <option value="reporter">Reporter</option>
            </select>
          </div>
          <CSSTransition classNames="input-container" timeout={500}>
          <div className="input-container">
            <label htmlFor="username">Username:</label>
            <input type="text" id="username" name="username" value={cid} onChange={(event) => setUsername(event.target.value)} />
          </div>
        </CSSTransition>
        <br></br>
        <CSSTransition classNames="input-container" timeout={900}>
          <div className="input-container">
            <label htmlFor="password">Password:</label>
            <input type="password" id="password" name="password" value={password} onChange={(event) => setPassword(event.target.value)} />
          </div>
        </CSSTransition>
        <br></br>
          <button className="login-button" type="primary">
            Login
          </button>
        </form>
      </div>
    </div>
    </>
  );
}

export default LoginPage;
