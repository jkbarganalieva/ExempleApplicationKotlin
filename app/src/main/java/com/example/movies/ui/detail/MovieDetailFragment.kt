package com.example.movies.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.movies.R
import com.example.movies.databinding.FragmentMovieDetailBinding
import android.content.Intent
import android.net.Uri

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding
    private val args: MovieDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentMovieDetailBinding.bind(view)

        binding.title.text = args.title
        binding.description.text = args.description

        binding.btnTrailer.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.trailerUrl))
            browserIntent.setPackage("com.android.chrome")
            startActivity(browserIntent)

//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse(args.trailerUrl)
//            intent.setPackage(null)
//            startActivity(intent)
        }

        Glide.with(requireContext())
            .load(args.imageUrl)
            .into(binding.image)
    }
}