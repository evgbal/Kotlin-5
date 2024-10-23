package ru.otus.cars

object Taz: Car {
    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    private val tank: Tank = TazTank()

    /**
     * Горловина
     */
    override val tankMouth: TankMouth = PetrolMouth(tank)

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput
        get() = throw NotImplementedError("Приборов нет")

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    private class TazTank : Tank {

        override val mouth: TankMouth = tankMouth

        override fun getContents(): Int {
            throw NotImplementedError("Топливный бак пробит")
        }

        override fun receiveFuel(liters: Int) {
            throw Exception("Взрыв!!!")
        }
    }

    override fun toString(): String {
        return "Taz(color=$color)"
    }

}