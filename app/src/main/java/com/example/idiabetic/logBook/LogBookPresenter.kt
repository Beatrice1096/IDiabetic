package com.example.idiabetic.logBook

import com.example.idiabetic.base.BasePresenter
import com.example.idiabetic.models.HistoryEntry
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener

class LogBookPresenter(
    val entryRef: DatabaseReference
) : BasePresenter<LogBookView>() {

    override fun afterBind(view: LogBookView) {
        entryRef.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onDataChange(data: DataSnapshot) {
                val listOfqEntries = data.child("user").child("entry").children.map{
                    it.getValue(HistoryEntry::class.java)
                }.toTypedArray()
                val list = listOfqEntries.requireNoNulls()

                view.populateList(list.toList())
            }
        })
    }

}