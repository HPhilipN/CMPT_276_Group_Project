import React from "react";
import "./Searchbar.css";

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faMagnifyingGlass } from '@fortawesome/free-solid-svg-icons';

const Searchbar = ({value, changeInput}) => (

    
    <div class="searchbar-wrap">
        <div class="searchbar-icon">
            <FontAwesomeIcon icon={faMagnifyingGlass} size="10px"/>
        </div>
        <input type="text" placeholder="Search Here" value={value} onChange={changeInput}/>
    </div>
)

export default Searchbar