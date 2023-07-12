package com.replicake.replicake.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.replicake.replicake.models.Recipe;
import com.replicake.replicake.models.RecipeRepository;

import jakarta.servlet.http.HttpServletResponse;


// 
@RestController
@RequestMapping("/recipes")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;
    @PostMapping("/create")
    @ResponseBody
    public boolean createRecipe(@RequestBody Recipe newRecipe, HttpServletResponse response) {
        System.out.println("Creating new recipe");
        try {
            String author = newRecipe.getAuthor();
            String title = newRecipe.getTitle();
            List<String> ingredients = newRecipe.getIngredients();
            List<String> instructions = newRecipe.getInstructions();
            List<String> tags = newRecipe.getTags();
            Recipe newRecipeCreated = new Recipe(author, title, ingredients, instructions, tags);
            recipeRepository.save(newRecipeCreated);
            response.setStatus(201);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(401);
            return false;
        }
        // try {
        //     String newEmail = newUser.getEmail();
        //     // if user with this email already exists
        //     if(userRepo.existsByEmail(newEmail)){
        //         System.out.println("User with this email exists");
        //         return false;
        //     }

        //     String newPassword = newUser.getPassword();
        //     // hash & secure password before storage
        //     String hashedPassword = passwordEncoder.encode(newPassword);
                
        //     String newName = newUser.getName();
        //     newName = newName.toLowerCase(); // lowercase the entire name
        //     newName = newName.substring(0, 1).toUpperCase() + newName.substring(1); // Capitalize first letter of name
    
        //     boolean chefRole = newUser.isChef();
        //     System.out.println("Chef role is " + chefRole);
        //     boolean modRole = newUser.isModerator();
        //     System.out.println("Mod role is " + modRole);

        //     // add new student to student table in DB
        //     User newUserCreated = new User(newName, newEmail, hashedPassword, chefRole, modRole);
        //     userRepo.save(newUserCreated);

        //     response.setStatus(201); // 201 = created new object
        //     return true; 
        // } catch (Exception e) {
        //     System.out.println("Invalid data or Access denied");
        //     response.setStatus(401); // 401 = Unauthorized
        //     return false;
        // }
    }



    // @GetMapping("/{id}")
    // public ResponseEntity<Recipe> getRecipeById(@PathVariable int id) {
    //     Recipe recipe = recipeRepository.findById(id);
    //     if (recipe != null) {
    //         return new ResponseEntity<>(recipe, HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    // }
}
