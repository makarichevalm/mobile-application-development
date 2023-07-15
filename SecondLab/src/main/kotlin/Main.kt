/*Классификация автобусов:
* малый - до 40 мест
* средний - до 65 мест
* большой - до 110 мест
* особо большой - до 154 мест
* поиск по пункту отправления, поиск по пункту прибытия, поиск по времени отправления, сортировка по стоимости*/
class Bus(
    var departurePoint: String,
    var arrivalPoint: String,
    var departureDate: String,
    var arrivalDate: String,
    var busType:String,
    var price: Int) {
    val info = {
        println(
            "Пункт отправления: $departurePoint, Пункт назначения: $arrivalPoint, " +
                    "Время отправления: $departureDate, Время прибытия: $arrivalDate, Тип автобуса: $busType, Стоимость: $price"
        )
    }
    fun findArP(city: String) {
        if (this.arrivalPoint == city) {
            this.info()
        }
    }
    fun findDepP(city: String) {
        if (this.departurePoint == city) {
            this.info()
        }
    }
    fun findDepD(date: String) {
        if (this.departureDate == date) {
            this.info()
        }
    }
}
fun main() {
    val listBus = mutableListOf<Bus>()
    listBus.add(Bus("Санкт-Петербург", "Москва", "23/03/2023 18:45", "23/03/2023 22:50","большой", 700))
    listBus.add(Bus("Саратов", "Пенза", "23/03/2023 18:45", "23/03/2023 21:30","малый", 400))
    listBus.add(Bus("Пенза", "Евлашево", "23/03/2023 12:20", "23/03/2023 14:00","средний", 350))
    listBus.add(Bus("Санкт-Петербург", "Москва", "23/03/2023 15:00", "23/03/2023 17:20","малый", 700))
    val sortedByName = listBus.sortedBy { it.price }
    println(sortedByName.forEach{ i ->i.info()})
    println("Поиск по пункту назначения: Москва")
    listBus.forEach{i -> i.findArP("Москва")}
    println("Поиск по пункту отправления: Пенза")
    listBus.forEach{i -> i.findDepP("Пенза")}
    println("Поиск по времени отправления: 23/03/2023 18:45")
    listBus.forEach{i -> i.findDepD("23/03/2023 18:45")}
}