package com.konoplev.student_material_design_alekseevafirsova.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Student (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val description: Int
)
