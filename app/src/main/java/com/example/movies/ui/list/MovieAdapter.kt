package com.example.movies.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.model.Movie
import com.example.movies.databinding.ItemMovieBinding

class MovieAdapter(
    private val movies: List<Movie>,
    private val onClick: (Movie) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(
            binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(
            LayoutInflater.from(
                parent.context),
            parent,
            false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.binding.title.text = movie.title

        Glide.with(holder.itemView.context)
            .load(movie.imageUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .error(android.R.drawable.ic_delete)
            .into(holder.binding.image)

        holder.itemView.setOnClickListener {
            onClick(movie)
        }
    }

    override fun getItemCount() = movies.size
}