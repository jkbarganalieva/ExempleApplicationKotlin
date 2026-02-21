package com.example.movies.ui.list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.viewmodel.MovieViewModel
import com.example.movies.R
import com.example.movies.databinding.FragmentMovieListBinding

class MovieListFragment : Fragment(R.layout.fragment_movie_list) {

    private lateinit var binding: FragmentMovieListBinding
    private val viewModel: MovieViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentMovieListBinding.bind(view)

        val movies = viewModel.getMovies()

        val adapter = MovieAdapter(movies) { movie ->
            val action = MovieListFragmentDirections
                .actionListToDetail(
                    movie.title,
                    movie.description,
                    movie.imageUrl,
                    movie.trailerUrl)
            findNavController().navigate(action)
        }

        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }
}