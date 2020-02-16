package org.flauschhaus.broccoli.recipes;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RecipeDAO {

    @Insert
    void insert(Recipe... recipes);

    @Update
    void update(Recipe... recipes);

    @Delete
    void delete(Recipe recipe);

    @Query("SELECT * FROM recipes")
    LiveData<List<Recipe>> findAll();

    @Query("DELETE FROM recipes")
    void deleteAll();
}
