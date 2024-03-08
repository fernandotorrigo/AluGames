import br.com.alura.alugames.services.ApiConsumer

fun main(args: Array<String>) {
    val api = ApiConsumer()
    val listGamers = api.searchGamers()
    val listGameJson = api.searchGames()

    println(listGamers)
    print(listGameJson)
}