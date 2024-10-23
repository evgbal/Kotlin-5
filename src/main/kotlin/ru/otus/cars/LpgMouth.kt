package ru.otus.cars

class LpgMouth(private val tank: Tank): TankMouth() {
    fun fuelLpg(liters: Int) {
        tank.receiveFuel(liters)
    }

    override fun toString(): String {
        return "Газ"
    }
}