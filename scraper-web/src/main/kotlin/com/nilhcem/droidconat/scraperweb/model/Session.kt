package com.nilhcem.droidconat.scraperweb.model

data class Session(val id: Int, val title: String, val description: String, val speakersId: MutableList<Int>, val startAt: String, val duration: Int, val roomId: Int)