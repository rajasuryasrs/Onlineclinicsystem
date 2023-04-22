import React, {  useState } from 'react'
import "./ViewDoctor.css"
import axios from 'axios';

function ViewDoctor() {
    const [data, setData] = useState([]);

    axios.get('http://localhost:8056/admin/selectall').then(res=>{
        setData(res.data)
        
    })

    console.log(data)
        
    return (
      <div style={{width:"100%"}}>
    
      <div className='ss1' style={{}}>
      <h1 style={{color:"black", textAlign:"center"}}>View Doctor</h1>
      <table border="2">
        <thead>
          <tr>
            <th>DoctorID</th>
            <th>DoctorName</th>
            <th>DateOfBirth</th>
            <th>DateOfJoining</th>
            <th>Gender</th>
            <th>Qualification</th>
            <th>Specialization</th>
            <th>YearsOfExperience</th>
            <th>Location</th>
            <th>City</th>
            <th>State</th>
            <th>Pincode</th>
            <th>ContactNumber</th>
            <th>Email</th>

          </tr>
        </thead>
        <tbody>
          {data.map(item => (
            <tr key={item.doctorID}>
                <td>{item.doctorID}</td>
              <td>{item.doctorName}</td>
              <td>{item.dateOfBirth}</td>
              <td>{item.dateOfJoining}</td>
              <td>{item.gender}</td>
              <td>{item.qualification}</td>
              <td>{item.specialization}</td>
              <td>{item.yearsOfExperience}</td>
              <td>{item.location}</td>
              <td>{item.city}</td>
              <td>{item.state}</td>
              <td>{item.pincode}</td>
              <td>{item.contactNumber}</td>
              <td>{item.email}</td>
            </tr>
          ))}
        </tbody>
      </table>
      </div>
      </div>
      
)}


export default ViewDoctor;