package com.example.laboratorio_07.ui.movie.billboard.recycleview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_07.data.model.MovieModel
import com.example.laboratorio_07.databinding.FragmentItemMovieBinding

class MovieRecyclerViewHolder(private val binding : FragmentItemMovieBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardView.setOnClickListener {
            clickListener(movie)
        }
    }
}