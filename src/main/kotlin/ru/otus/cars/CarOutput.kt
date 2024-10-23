package ru.otus.cars

/**
 * Следит за машиной
 */
interface CarOutput {
    /**
     * Скажи текущую скорость
     */
    fun getCurrentSpeed(): Int
    /**
     * Скажи текущий уровень топлива в баке
     */
    fun getFuelContents(): Int
}