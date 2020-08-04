package com.example.recyclerdatabindingcoroutines.ui.movies

import android.view.View
import com.example.recyclerdatabindingcoroutines.data.models.MovieItem

interface RecyclerViewClickListener {
    fun onRecyclerViewItemClick(view: View, movieItem: MovieItem)
}