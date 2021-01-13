package com.example.idiabetic.logBook

import com.example.idiabetic.models.HistoryEntry

interface LogBookView {
    fun populateList(list: List<HistoryEntry>)
}