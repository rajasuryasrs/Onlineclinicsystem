import React, { useState } from 'react';
import './Reporter.css'; 
import axios from 'axios';

function Reporter() {
  const [leaveID, setLeaveID] = useState('');
  const [reporterID, setReporterID] = useState('');
  const [reporterName, setReporterName] = useState('');
  const [leaveFrom, setLeaveFrom] = useState('');
  const [leaveTo, setLeaveTo] = useState('');
  const [reason, setReason] = useState('');
  const [status, setStatus] = useState('');

  const handleSubmit=(e)=>{
    e.preventDefault();
   console.log( leaveID+"" +reporterID+" "+reporterName+" "+leaveFrom+""+leaveTo+""+reason+""+status);
   const obj={leaveID:leaveID, repoterID:reporterID , reporterName:reporterName,leaveForm:leaveFrom,leaveTo:leaveTo,reason:reason,status:status}
  console.log(obj)
   axios.post('http://localhost:8056/reporter/addReporter',obj).then(
       alert('Reporter added successfully')
   ).catch((e)=>console.log(e))
} 

  return (
    <div className="reporter-page">
      <b><h1>Reporter Page</h1></b>
      <br></br>
      <form onSubmit={handleSubmit}>
        <div className="form-field">
          <label htmlFor="leaveID">Leave ID</label>
          <input type="text" id="leaveID" value={leaveID} onChange={(event) => setLeaveID(event.target.value)} />
        </div>

        <div className="form-field">
          <label htmlFor="reporterID">Reporter ID</label>
          <input type="text" id="reporterID" value={reporterID} onChange={(event) => setReporterID(event.target.value)} />
        </div>

        <div className="form-field">
          <label htmlFor="reporterName">Reporter Name</label>
          <input type="text" id="reporterName" value={reporterName} onChange={(event) => setReporterName(event.target.value)} />
        </div>

        <div className="form-field">
          <label htmlFor="leaveFrom">Leave From</label>
          <input type="date" id="leaveFrom" value={leaveFrom} onChange={(event) => setLeaveFrom(event.target.value)} />
        </div>

        <div className="form-field">
          <label htmlFor="leaveTo">Leave To</label>
          <input type="date" id="leaveTo" value={leaveTo} onChange={(event) => setLeaveTo(event.target.value)} />
        </div>

        <div className="form-field">
          <label htmlFor="reason">Reason</label>
          <textarea id="reason" value={reason} onChange={(event) => setReason(event.target.value)}></textarea>
        </div>

        <div className="form-field">
          <label htmlFor="status">Status</label>
          <input type="text" id="status" value={status} onChange={(event) => setStatus(event.target.value)} />
        </div>

        <button type="Primary" style={{height: "50px" ,marginTop:"31px" , width:"80px"}}>Submit</button>
      </form>
      {/* <button className="view-all-btn"></button> */}
      <div className="reporter-page">
  <button className="add-doctor-btn"> Click Here For Available Doctors</button>
  <br></br>

  <button className="view-all-btn">Inform Admin</button>
</div>

    </div>
  );
}

export default Reporter;




// ReporterPage.js

// import React from 'react';
// import './Reporter.css';

// const ReporterPage = () => {
//   return (
//     <div className="reporter-page">
//         <h1>ReporterPage</h1>
//       <div className="container-a">
//         <div className="inner-container-a">
//           <button className="view-all-button">ViewAllAvailableDoctors</button>
//         </div>
//       </div>
//       <div className="container-b">
//         <form className="leave-form">
//           <label htmlFor="leaveID">Leave ID:</label>
//           <input type="text" id="leaveID" name="leaveID" required />
//           <label htmlFor="reporterID">Reporter ID:</label>
//           <input type="text" id="reporterID" name="reporterID" required />
//           <label htmlFor="reporterName">Reporter Name:</label>
//           <input type="text" id="reporterName" name="reporterName" required />
//           <label htmlFor="leaveFrom">Leave From:</label>
//           <input type="date" id="leaveFrom" name="leaveFrom" required />
//           <label htmlFor="leaveTo">Leave To:</label>
//           <input type="date" id="leaveTo" name="leaveTo" required />
//           <label htmlFor="reason">Reason:</label>
//           <textarea id="reason" name="reason" required></textarea>
//           <label htmlFor="status">Status:</label>
//           <select id="status" name="status" required>
//             <option value="">Select Status</option>
//             <option value="pending">Pending</option>
//             <option value="approved">Approved</option>
//             <option value="rejected">Rejected</option>
//           </select>
//           <button type="submit" className="submit-button">Submit</button>
//         </form>
//       </div>
//       <div className="container-c">
//         <div className="inner-container-c">
//           <button className="admin-button">IntimateAdmin</button>
//         </div>
//       </div>
//     </div>
//   );
// };

// export default ReporterPage;
