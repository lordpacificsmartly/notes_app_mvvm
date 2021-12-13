package com.example.notesapp.db

open class Event<out T>(private val content: T) {

    private var hasBeenHandled = false
        private set //

    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun peekContent(): T = content
}
