function RecipeCard({ recipe }) {
    return (
      <div className="card">
        <img src={recipe.image} className="card-img-top" alt={recipe.name} />
        <div className="card-body">
          <h5 className="card-title">{recipe.name}</h5>
          <p><strong>Ingredients:</strong> {recipe.ingredients.join(", ")}</p>
          <p><strong>Instructions:</strong> {recipe.instructions}</p>
        </div>
      </div>
    );
  }
  
  export default RecipeCard;
  