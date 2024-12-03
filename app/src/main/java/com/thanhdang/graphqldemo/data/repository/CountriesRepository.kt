package com.thanhdang.graphqldemo.data.repository

import com.apollographql.apollo3.api.ApolloResponse
import com.thanhdang.graphqldemo.CountriesQuery
import com.thanhdang.graphqldemo.data.sources.remote.services.CountryAPIService

class CountriesRepository(private val countryAPIService: CountryAPIService) {

    suspend fun getAllCountries(): ApolloResponse<CountriesQuery.Data> =
        countryAPIService.getAllCountries()

    suspend fun getCountryDetail(code: String) {
        countryAPIService.getCountryDetail(code)
    }
}