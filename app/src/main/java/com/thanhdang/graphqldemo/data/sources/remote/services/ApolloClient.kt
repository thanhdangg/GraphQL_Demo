package com.thanhdang.graphqldemo.data.sources.remote.services

import com.apollographql.apollo3.ApolloClient

class  ApolloClient {
    val client: ApolloClient = ApolloClient.builder()
        .serverUrl("https://countries.trevorblades.com/")
        .build()
}