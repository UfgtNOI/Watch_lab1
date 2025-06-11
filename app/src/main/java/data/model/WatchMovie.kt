// com.example.watchapp.data.model.MovieEntity

package com.example.watchapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "watched_movies")
data class MovieEntity(
    @PrimaryKey val imdbID: String,
    val title: String,
    val year: String,
    val posterUrl: String,
    var isSelected: Boolean = false
)