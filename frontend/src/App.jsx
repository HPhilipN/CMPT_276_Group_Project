import "./styles/App.css";
import "./styles/Login.css";
import Home from "./Home.jsx";
import Login from "./Login.jsx";
import Cookbook from "./Cookbook";
import NotFound from "./NotFound";
import UserProvider from "./UserContext";
import Recipes from "./Recipes";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

function App() {
   return (
      <UserProvider>
         <Router>
            <Routes>
               <Route path="/" element={<Home />} />
               <Route path="/login" element={<Login />} />
               <Route path="/recipes" element={<Recipes />} />
               <Route path="/cookbook" element={<Cookbook />} />
               <Route path="*" element={<NotFound />} />
            </Routes>
         </Router>
      </UserProvider>
   );
}

export default App;
