package com.example.idiabetic.logEntry

import com.example.idiabetic.base.BasePresenter
import com.example.idiabetic.models.HistoryEntry
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener

class LogEntryPresenter(
    val entryRef: DatabaseReference
) : BasePresenter<LogEntryView>() {

    override fun afterBind(view: LogEntryView) {
        readEntry()
    }

    fun addEntry() {
        val entry = HistoryEntry(
            glucose = view?.glucose,
            insulin = view?.insulin,
            carbs = view?.carbs
        )
        val key = entryRef.push().key ?: ""
        entryRef.child("user").child("entry").child(key).setValue(entry)
    }

    fun readEntry() {
//        entryRef.addValueEventListener(object : ValueEventListener {
//            override fun onCancelled(p0: DatabaseError) {
//            }
//
//            override fun onDataChange(data: DataSnapshot) {
//                val listOfGlucoses = data.child("entry").child("glucose").children
//                view?.testRead = listOfGlucoses.map {
//                    it.getValue(Long::class.java).toString()
//                }.toString()
//            }
//        })
    }


}