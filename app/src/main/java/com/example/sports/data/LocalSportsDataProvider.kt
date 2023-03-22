package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Sport


object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 1,
                titleResourceId = R.string.nb_997h,
                imageResourceId = R.drawable.nb_997h,
                sportsImageBanner = R.drawable.nb_997h,
                newsDetails = R.string.nb_997h_inf
            ),
            Sport(
                id = 2,
                titleResourceId = R.string.nb_ct210,
                imageResourceId = R.drawable.nb_ct210,
                sportsImageBanner = R.drawable.nb_ct210,
                newsDetails = R.string.nb_ct210_inf
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.nb_ct574,
                imageResourceId = R.drawable.nb_ct574,
                sportsImageBanner = R.drawable.nb_ct574,
                newsDetails = R.string.nb_ct574_inf
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.nb_numeric_213,
                imageResourceId = R.drawable.nb_numeric_213,
                sportsImageBanner = R.drawable.nb_numeric_213,
                newsDetails = R.string.nb_numeric_213_inf
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.nb_numeric_440,
                imageResourceId = R.drawable.nb_numeric_440,
                sportsImageBanner = R.drawable.nb_numeric_440,
                newsDetails = R.string.nb_numeric_440_inf
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.nb_997h,
                imageResourceId = R.drawable.nb_997h,
                sportsImageBanner = R.drawable.nb_997h,
                newsDetails = R.string.nb_997h_inf
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.nb_ct574,
                imageResourceId = R.drawable.nb_ct574,
                sportsImageBanner = R.drawable.nb_ct574,
                newsDetails = R.string.nb_ct574_inf
            ),
            Sport(
                id = 8,
                titleResourceId = R.string.nb_ct210,
                imageResourceId = R.drawable.nb_ct210,
                sportsImageBanner = R.drawable.nb_ct210,
                newsDetails = R.string.nb_ct210_inf
            ),
            Sport(
                id = 9,
                titleResourceId = R.string.nb_numeric_213,
                imageResourceId = R.drawable.nb_numeric_213,
                sportsImageBanner = R.drawable.nb_numeric_213,
                newsDetails = R.string.nb_numeric_213_inf
            ),
            Sport(
                id = 10,
                titleResourceId = R.string.nb_numeric_440,
                imageResourceId = R.drawable.nb_numeric_440,
                sportsImageBanner = R.drawable.nb_numeric_440,
                newsDetails = R.string.nb_numeric_440_inf
            ),
            Sport(
                id = 11,
                titleResourceId = R.string.nb_997h,
                imageResourceId = R.drawable.nb_997h,
                sportsImageBanner = R.drawable.nb_997h,
                newsDetails = R.string.nb_997h_inf
            )
        )
    }
}
