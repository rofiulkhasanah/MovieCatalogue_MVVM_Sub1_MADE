package com.dicoding.moviecatalogue.core.data.source.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "MovieEntities")
data class MovieEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "overview")
    val overview: String,

    @ColumnInfo(name = "poster_path")
    val poster_path: String,

    @ColumnInfo(name = "release_date")
    val release_date: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "vote_average")
    val vote_average: Double,

    @ColumnInfo(name = "favorited")
    var favorited: Boolean = false,
) : Parcelable {
    val baseURL: String get() = "https://image.tmdb.org/t/p/w500"
}