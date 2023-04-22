import React from 'react'
import {Link} from 'react-router-dom';
import './Navbar.css';

const Navbar = () => {
  return (
    <nav className='navbar'>
      {/* <h3 style={{color:"red"}}>Surya Clinic service</h3> */}
      {/* <Link to ='/' className='navlogo'> <img src={surya} alt="Logo" /></Link> */}
      <ul className='navlinks'>
        {/* <li className='navitem'><Link to ='/' className='navlink'> Home </Link> </li> */}
        {/* <li className='navitem'><Link to ='/about' className='navlink'> About </Link> </li> */}
        <li className='navitem'><Link to ='/contact' className='navlink' style={{paddingLeft:"1000px"}}> Contact-Us </Link> </li>
        {/* <li className='navitem'><Link to ='/signup' className='navlink'> Signup </Link> </li> */}
        <li className='navitem'><Link to ='/' className='navlink' > Login  </Link> </li>
        {/* <li className='navitem'><Link to ='/' className='navlink'> Logout  </Link> </li> */}

      </ul>

    </nav>
  )
}

export default Navbar
