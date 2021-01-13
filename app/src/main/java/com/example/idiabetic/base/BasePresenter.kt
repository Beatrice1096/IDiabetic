package com.example.idiabetic.base

abstract class BasePresenter<T:Any>(
//        private val compositeDisposable: CompositeDisposable = CompositeDisposable(),
) {

    var view: T? = null

    fun bind(view: T) {
        if (this.view != null) return
        this.view = view
        afterBind(view)
    }

    fun unbind() {
        if (this.view == null) return
//        compositeDisposable.clear() // Null the view afterwards in case we need it during disposing
        this.view = null
    }

    abstract fun afterBind(view: T)
}