package com.thanhdang.graphqldemo.data.sources.remote.services

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.ApolloResponse
import com.thanhdang.graphqldemo.CountriesQuery

class CountryAPIService(private val graphQLService: ApolloClient) {

    suspend fun getAllCountries(): ApolloResponse<CountriesQuery.Data> =
        graphQLService.query(CountriesQuery()).execute()

    suspend fun getCountryDetail(code: String) {

    }

}