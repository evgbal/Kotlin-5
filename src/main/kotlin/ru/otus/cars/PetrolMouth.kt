package ru.otus.cars

class PetrolMouth(private val tank: Tank): TankMouth() {
    fun fuelPetrol(liters: Int) {
        tank.receiveFuel(liters)
    }
    override fun toString(): String {
        return "Бензин"
    }
}