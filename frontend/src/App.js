
import './App.css';
import LoginPage from './LoginPage';
import { Route } from 'react-router-dom';
import AddDoctor from './AddDoctor';
import ViewDoctor from './ViewDoctor';

import ModifyDoctor from './ModifyDoctor';
import DeleteDoctor from './DeleteDoctor';

import ResigsterProfile from './ResigsterProfile';

import { Routes } from 'react-router-dom';
import Reporter from './Reporter';
// import 'bootstrap/dist/css/bootstrap.min.css';
import Contact from './Contact';


function App() {
  return (
    <div className="App">   
    {/* <ResigsterProfile/> */}
      {/* <LoginPage/> */}
      {/* <AddDoctor/> */}
      {/* <ModifyDocotor/> */}
      {/* <DeleteDoctor/> */}
      {/* <ViewDoctor/> */}
      {/* <ReporterPage/> */}
     
  <Routes>
    <Route path='/' element= {<LoginPage/>}/>
    <Route  path='/contact' element={<Contact/>}/>
    <Route path="/AddDoctor" element={<AddDoctor/>} /> 
    <Route path='/ViewDoctor' element={<ViewDoctor/>}/>
    <Route path="/modifyDoctor" element={<ModifyDoctor/>} /> 
    <Route path='/DeleteDoctor' element={<DeleteDoctor/>}/>
    <Route path='/DeleteDoctor' element={<DeleteDoctor/>}/>
    <Route path='/Reporter' element={<Reporter/>}/>
    <Route path='/ResigsterProfile' element={<ResigsterProfile/>}/>
  
  </Routes>
    </div>
  );
}

export default App;
