class Dog(location: String, food: String, val noise: String) : Animal(location, food) {
    val weight = 4

    override fun makeNoise() {
        println("Dog says ${noise}")
    }

    override fun eat() {
        println("Dog with weight ${weight} eats ${food}")
    }

    override fun sleep() {
        println("Dog is sleeping")
    }
}
