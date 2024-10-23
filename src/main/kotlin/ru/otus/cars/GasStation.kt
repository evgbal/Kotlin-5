package ru.otus.cars

import kotlin.random.Random

class GasStation {
    class RefuelResult (val car: Car, val refueled: Boolean)

    fun refuel(car: Car): Boolean {
        try {
            println()
            println("Прибыл на заправку $car")
            car.tankMouth.open()
            if (car.tankMouth is PetrolMouth) {
                println("Заправка бензином")
                (car.tankMouth as PetrolMouth).fuelPetrol(Random.nextInt(40))
            }
            if (car.tankMouth is LpgMouth) {
                println("Заправка природным газом")
                (car.tankMouth as LpgMouth).fuelLpg(Random.nextInt(100))
            }
            car.tankMouth.close()
            println("Заправка завершена")
        } catch (ex: Exception) {
            println(ex.message)
            return false
        }
        return true
    }
    fun refuel(cars: Collection<Car>): List<RefuelResult> {
        val result: MutableList<RefuelResult> = ArrayList()
        for (car in cars) {
            val refueled = refuel(car)
            result.add(RefuelResult(car, refueled))
        }
        return result
    }
}

val piterGasStation: GasStation = GasStation()
