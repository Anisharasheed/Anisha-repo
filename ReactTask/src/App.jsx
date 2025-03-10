import { useState, useEffect } from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import RecipeList from "./components/RecipeList";
import RecipeCard from "./components/RecipeCard";
import "./App.css";


function App() {
  const [recipes, setRecipes] = useState([]); 
  const [search, setSearch] = useState(""); 

 
  useEffect(() => {
    axios.get("/api.json")
      .then(response => setRecipes(response.data.recipes))
      .catch(error => console.error("Error fetching recipes:", error));
  }, []);

 
  const filteredRecipes = recipes.filter(recipe =>
    recipe.name.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div className="container mt-4">
      <h1 className="text-center text-primary">Food Recipe Finder</h1>

      {/* Search Form */}
      <input 
        type="text" 
        className="form-control mb-3" 
        placeholder="Search for a recipe..." 
        value={search} 
        onChange={(e) => setSearch(e.target.value)} 
      />

      {/* Recipe List */}
      <RecipeList recipes={filteredRecipes} />
    </div>
  );
}

export default App;
