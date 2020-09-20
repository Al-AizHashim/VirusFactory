interface Virus {
    fun mutate()
    fun spread()
}
class CoronaVirus:Virus{
    override fun mutate() {
        println("Inside CoronaVirus class")
    }

    override fun spread() {

    }
}
class InfluenzaVirus:Virus{
    override fun mutate() {
        println("Inside InfluenzaVirus class")
    }

    override fun spread() {

    }
}
class HIVVirus:Virus{
    override fun mutate() {
        println("Inside HIVVirus class")
    }

    override fun spread() {

    }
}