package com.ethan.stickynotes.domain.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
