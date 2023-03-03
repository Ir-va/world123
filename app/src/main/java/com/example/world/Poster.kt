package com.example.world

data class Poster(val imgId:Int, val title:String)
class PosterList{ val list = arrayListOf(Poster(R.drawable.pixar,"Фильм Рататуй"),
Poster(R.drawable.pixar,"Фильм Тачки"),
    Poster(R.drawable.ratatouille,"Фильм Рататуй"),
    Poster(R.drawable.ratatouille,"Фильм Рататуй"),
    Poster(R.drawable.ratatouille,"Фильм Рататуй"),
    Poster(R.drawable.pixar,"Фильм Тачки"),
    Poster(R.drawable.pixar,"Фильм Тачки"),
    Poster(R.drawable.ratatouille,"Фильм Рататуй"))}
