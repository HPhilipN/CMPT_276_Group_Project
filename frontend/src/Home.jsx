import React, { useContext } from "react";
import BannerBackground from "./assets/home-banner-background.png";
import BannerImage from "./assets/home-banner-image.png";
import Navbar from "./Navbar";
import NavbarAdmin from "./NavbarAdmin";
import NavbarLogin from "./NavbarLogin";
import { FiArrowRight } from "react-icons/fi";
import "./styles/Home.css";
import Work from "./Work";
import Footer from "./Footer";
import { UserContext } from "./UserContext";

const Home = () => {
   // Accessing signInStatus, isChef, and isModerator from the UserContext
   const { signInStatus, isChef, isModerator } = useContext(UserContext);

   return (
      <div className="home-container">
         {/* Conditionally rendering the appropriate navbar based on the user status */}
         {signInStatus && isChef && <NavbarLogin />}
         {signInStatus && isModerator && <NavbarAdmin />}
         {!signInStatus && <Navbar />}
         <div className="home">
            <div className="home-banner-container">
               <div className="home-bannerImage-container">
                  <img src={BannerBackground} alt="" />
               </div>
               {/* Text section */}
               <div className="home-text-section">
                  <h1 className="primary-heading text-left">Replicake Your Favourite Recipes</h1>
                  <p className="primary-text text-left">
                     Never run out of recipe ideas with the power of Replicake!
                  </p>
                  {/* Button to navigate to the dashboard */}
                  <a href="/dashboard">
                     <button className="secondary-button">
                        Find Recipes Now
                        <FiArrowRight />
                     </button>
                  </a>
               </div>
               {/* Image section */}
               <div className="home-image-section">
                  <img src={BannerImage} alt="" />
               </div>
            </div>
             {/* Work component */}
            <Work />
            {/* Footer component */}
            <Footer />
         </div>
      </div>
   );
};

export default Home;
