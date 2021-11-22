class Cat(location: String, food: String, val noise: String) : Animal(location, food) {
    val tailLength = 7

    override fun makeNoise() {
        println("Cat says ${noise}")
    }

    override fun eat() {
        println("Cat with tail length ${tailLength} eats ${food}")
    }

    override fun sleep() {
        println("Cat is sleeping")
    }
}
