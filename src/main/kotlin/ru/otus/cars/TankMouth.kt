package ru.otus.cars

abstract class TankMouth {
    private var isOpen: Boolean = false

    /**
     * Открыть крышку бака
     */
    fun open() {
        isOpen = true
        println("Крышка бака открыта")
    }

    /**
     * Закрыть крышку бака
     */
    fun close() {
        isOpen = false
        println("Крышка бака закрыта")
    }

}