import React, { useState } from "react";
import axios from "axios";
import adddoc from "./adddoc.jpeg";

function DeleteDoctor() {
  const [doctorID, setDoctorId] = useState("");

  const handleDelete = (e) => {
    e.preventDefault();
    axios
      .delete(`http://localhost:8056/admin/deleteDoctor/` + doctorID)
      .then((res) => alert("Data is Deleted"));
    console.log("Doctor Deleted successfully..." + doctorID);
  };

  const containerStyles = {
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    backgroundColor: "#fff",
    padding: "20px",
    borderRadius: "8px",
    boxShadow: "0px 4px 10px rgba(0, 0, 0, 0.1)",
  };

  const labelStyles = {
    display: "flex",
    flexDirection: "column",
    marginBottom: "10px",
  };

  const inputStyles = {
    padding: "8px",
    borderRadius: "4px",
    border: "1px solid #ccc",
    fontSize: "16px",
    marginBottom: "10px",
  };

  const buttonStyles = {
    padding: "8px 16px",
    borderRadius: "4px",
    border: "none",
    backgroundColor: "#0077FF",
    color: "#fff",
    fontSize: "16px",
    cursor: "pointer",
  };

  return (
    <div
      style={{
        backgroundImage: `url(${adddoc})`,
        backgroundSize: "cover",
        height: "100vh",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <div style={containerStyles}>
        <h2>Delete Doctor</h2>
        <label style={labelStyles}>
          Enter Doctor ID:
          <input
            type="text"
            value={doctorID}
            onChange={(e) => setDoctorId(e.target.value)}
            style={inputStyles}
          />
        </label>
        <button onClick={handleDelete} style={buttonStyles}>
          Delete
        </button>
      </div>
    </div>
  );
}

export default DeleteDoctor;
