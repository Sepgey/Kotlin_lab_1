class Horse(location: String, food: String, val noise: String) : Animal(location, food) {
    val color = "Black"

    override fun makeNoise() {
        println("Horse says ${noise}")
    }

    override fun eat() {
        println("Horse of color ${color} eats ${food}")
    }

    override fun sleep() {
        println("Horse is sleeping")
    }
}