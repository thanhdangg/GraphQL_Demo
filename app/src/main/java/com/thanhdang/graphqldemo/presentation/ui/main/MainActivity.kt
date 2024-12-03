package com.thanhdang.graphqldemo.presentation.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.ui.AppBarConfiguration
import com.thanhdang.graphqldemo.data.repository.CountriesRepository
import com.thanhdang.graphqldemo.data.sources.remote.services.ApolloClient
import com.thanhdang.graphqldemo.data.sources.remote.services.CountryAPIService
import com.thanhdang.graphqldemo.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val countriesRepository = CountriesRepository(CountryAPIService(ApolloClient().client))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            val response = countriesRepository.getAllCountries()
            val countries = response.data?.countries
            binding.rvCountries.adapter = CountryAdapter(countries ?: emptyList())
        }

    }


}