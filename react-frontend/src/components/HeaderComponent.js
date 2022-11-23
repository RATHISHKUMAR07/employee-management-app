import React, { Component } from 'react'
import '../App.css';
class HeaderComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div>
            
                <header>
                    <nav className="header">
                   <div><a href="https://github.com/RATHISHKUMAR07" className="navbar-header"><center><b>User Management App</b></center></a></div>
                    
                    </nav>
                </header>
            </div>
        )
    }
}

export default HeaderComponent
