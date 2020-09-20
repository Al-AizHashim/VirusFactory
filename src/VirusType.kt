enum class VirusType {
    CORONA_VIRUS, INFLUENZA, HIV
}
fun main() {
    val factory = VirusFactory()
    val virus = factory.makeVirus(VirusType.CORONA_VIRUS)
    virus?.spread()
    virus?.mutate()
}