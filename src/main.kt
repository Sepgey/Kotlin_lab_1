fun main() {
    val animals: List<Animal> = listOf(
        Dog("Home", "meat", "woof"),
        Cat("Street", "rats", "meow"),
        Horse("Farm", "Oats", "igo-go")
    )
    val veterinar = Veterinar()
    animals.forEach{animal -> veterinar.treatAnimal(animal)}
}
