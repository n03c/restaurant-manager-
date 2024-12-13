
package com.aldrin.cafsysv2.dao;

import com.aldrin.cafsysv2.model.Category;
import java.util.ArrayList;


public interface CategoryDAO {

    public Long getMaxId();

//    add Category
    public void addCategory(Category category);

//    update Category
    public void updateCategory(Category category);

//    delete Category
    public void deleteCategory(Category category);

//    list of Category
    public ArrayList<Category> selectCategory();

    public void comboBoxCategory();

    public Category findPhotoByCategoryId(Category category);

}
