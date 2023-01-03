package com.mrntlu.recyclerviewguide.utils

sealed class NetworkResponse<out T> {
    data class Loading(
        val isPaginating: Boolean,
    ): NetworkResponse<Nothing>()

    data class Success<out T>(
        val data: T,
        val isPaginationData: Boolean = false,
    ): NetworkResponse<T>()

    data class Failure(
        val errorMessage: String,
        val isPaginationError: Boolean = false,
    ): NetworkResponse<Nothing>()
}