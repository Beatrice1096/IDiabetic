package com.example.idiabetic.models

import com.google.firebase.database.IgnoreExtraProperties
import java.time.ZonedDateTime
@IgnoreExtraProperties
data class HistoryEntry(
//    val timeStamp : ZonedDateTime,
    val glucose: Int? = null,
    val carbs: Long? = null,
    val insulin: Long? = null
)