import React, { useContext } from "react";
import Filter from "./Filter";
import Searchbar from "./Searchbar";
import Recipelist from "./Recipelist";
import Navbar from "./Navbar";
import NavbarAdmin from "./NavbarAdmin";
import NavbarLogin from "./NavbarLogin";
import "./styles/Recipes.css";
import { UserContext } from "./UserContext";

// User generated recipes
const Cookbook = () => {
   const { signInStatus, isChef, isModerator } = useContext(UserContext);

   return (
      <div className="dashboard">
         {/*Search bar*/}
         {signInStatus && isChef && <NavbarLogin />}
         {signInStatus && isModerator && <NavbarAdmin />}
         {!signInStatus && <Navbar />}
         <div className="filter-search-wrapper">
            {/*Filter Modal*/}
            <Filter />
            {/*Search bar*/}
            <Searchbar />
         </div>
         <div className="recipelist-wrap">
            {/*Recipe List*/}
            <Recipelist />
            <div>
               <h4>TEMPORARY TEXT</h4>
               <p>This is where User recipes will be displayed</p>
            </div>
         </div>
      </div>
   );
};

export default Cookbook;
