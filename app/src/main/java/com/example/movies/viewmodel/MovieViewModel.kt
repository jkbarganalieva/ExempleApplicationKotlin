package com.example.movies.viewmodel

import androidx.lifecycle.ViewModel
import com.example.movies.model.Movie

class MovieViewModel : ViewModel() {

    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                "Interstellar",
                "Sci-fi movie about space and time.",
                "https://upload.wikimedia.org/wikipedia/ru/c/c3/Interstellar_2014.jpg",
                "https://www.youtube.com/watch?v=zSWdZVtXT7E"
            ),
            Movie(
                "Inception",
                "A thief who steals secrets through dream-sharing.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjCCNWs8eJiKB-tsAPWCxO7j4VM3J-2zI-Pg&s",
                "https://www.youtube.com/watch?v=85Zz1CCXyDI"
            ),
            Movie(
                "The Dark Knight",
                "Batman fights the Joker in Gotham.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPpvpOyvMKZetCpnNvVRGWq55Oy56hc6LCZw&s",
                "https://www.youtube.com/watch?v=HF1_epZNoCg"
            ),
            Movie(
                    "Кунг-Фу Панда",
            " Приключенческий анимационный фильм «Кунг-фу Панда» поведает удивительную историю произошедшую с неуклюжей и ленивой пандой по имени По",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCaPjpUqZxj8Pk9U5RpZ9IcvoLqTx5QesB2Zzvu_ON_vk-sdaNNUqXEOrU1dWFvBNpDt4sARqShTU6McDlF05ROP3QVwgJpRwvM50wPCcG&s=10",
            "https://www.youtube.com/watch?v=XEZKXIQjYFQ"
        ),
            Movie(
                "Кунг-Фу Панда",
                " Приключенческий анимационный фильм «Кунг-фу Панда» поведает удивительную историю произошедшую с неуклюжей и ленивой пандой по имени По",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCaPjpUqZxj8Pk9U5RpZ9IcvoLqTx5QesB2Zzvu_ON_vk-sdaNNUqXEOrU1dWFvBNpDt4sARqShTU6McDlF05ROP3QVwgJpRwvM50wPCcG&s=10",
                "https://www.youtube.com/watch?v=XEZKXIQjYFQ"
            ),
            Movie(
                "Кунг-Фу Панда",
                " Приключенческий анимационный фильм «Кунг-фу Панда» поведает удивительную историю произошедшую с неуклюжей и ленивой пандой по имени По",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCaPjpUqZxj8Pk9U5RpZ9IcvoLqTx5QesB2Zzvu_ON_vk-sdaNNUqXEOrU1dWFvBNpDt4sARqShTU6McDlF05ROP3QVwgJpRwvM50wPCcG&s=10",
                "https://www.youtube.com/watch?v=XEZKXIQjYFQ"
            )
        )
    }
}