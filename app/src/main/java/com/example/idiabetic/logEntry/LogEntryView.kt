package com.example.idiabetic.logEntry

interface LogEntryView {

    val glucose: Int

    val carbs: Long

    val insulin: Long

    var testRead: String?

}