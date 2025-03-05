package com.example.bincheckerapp.model

import com.example.bincheckerapp.model.dataofbin.Country

data class DateOfBin(
    val bank: Bank,
    val brand: String,
    val country: Country,
    val number: Number,
    val prepaid: Boolean,
    val scheme: String,
    val type: String
)