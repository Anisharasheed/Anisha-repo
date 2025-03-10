import RecipeCard from "./RecipeCard";

function RecipeList({ recipes }) {
  return (
    <div className="row">
      {recipes.length > 0 ? (
        recipes.map((recipe) => (
          <div key={recipe.id} className="col-md-4 mb-4">
            <RecipeCard recipe={recipe} />
          </div>
        ))
      ) : (
        <h3 className="text-center text-danger">No recipes found!</h3>
      )}
    </div>
  );
}

export default RecipeList;
