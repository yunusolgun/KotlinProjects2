package com.robusttech.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/*
{
"idCategory": "1",
"strCategory": "Beef",
"strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
"strCategoryDescription": "Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times.[1] Beef is a source of high-quality protein and essential nutrients.[2]"
},
 */
@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
): Parcelable

data class CategoriesResponse(val categories: List<Category>)