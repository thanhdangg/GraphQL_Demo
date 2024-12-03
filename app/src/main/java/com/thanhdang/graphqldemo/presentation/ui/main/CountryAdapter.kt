package com.thanhdang.graphqldemo.presentation.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thanhdang.graphqldemo.CountriesQuery
import com.thanhdang.graphqldemo.R
import com.thanhdang.graphqldemo.databinding.ItemCountryBinding

class CountryAdapter(private val countries: List<CountriesQuery.Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount(): Int = countries.size

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemCountryBinding.bind(itemView)

        fun bind(country: CountriesQuery.Country) {
            binding.countryName.text = country.name
            binding.countryEmoji.text = country.emoji
            binding.countryNative.text = country.native
            binding.capital.text = country.capital
            binding.languagesCode.text = country.languages.joinToString { it.code ?: "" }
            binding.languagesName.text = country.languages.joinToString { it.name ?: "" }
            binding.currency.text = country.currency
        }
    }
}