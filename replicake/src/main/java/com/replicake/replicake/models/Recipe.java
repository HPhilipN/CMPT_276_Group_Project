package com.replicake.replicake.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    private int uid;
    private String author;
    private String title;
    private int likes = 0;
    private int dislikes = 0;
    @ElementCollection
    private List<String> ingredients = new ArrayList<String>();
    @ElementCollection
    private List<String> instructions = new ArrayList<String>();
    @ElementCollection
    private List<String> tags = new ArrayList<String>();
    @ElementCollection
    private List<String> comments = new ArrayList<String>();

    
    public Recipe() {

    }
    public Recipe(String author, String title, List<String> ingredients, List<String> instructions, List<String> tags) {
        this.author = author;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getDislikes() {
        return dislikes;
    }
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    public List<String> getInstructions() {
        return instructions;
    }
    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }
}