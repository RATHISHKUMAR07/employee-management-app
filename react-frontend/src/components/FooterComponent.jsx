import React, { Component } from 'react'
import '../App.js';
class FooterComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div>
                <footer className = "footer">
                    <span className="nav-footer">All Rights Reserved 2022 @Rathish</span>
                </footer>
            </div>
        )
    }
}

export default FooterComponent
