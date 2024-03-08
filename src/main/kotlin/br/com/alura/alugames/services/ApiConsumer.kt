package br.com.alura.alugames.services

import br.com.alura.alugames.model.DataGame
import br.com.alura.alugames.model.DataGamerJson
import br.com.alura.alugames.modelo.DataGameJson
import br.com.alura.alugames.modelo.Game
import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.utils.createGamer
import br.com.alura.alugames.utils.createGame
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ApiConsumer {

    private fun requestDataFromApi(endereco: String): String {
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build()
        val response = client
            .send(request, HttpResponse.BodyHandlers.ofString())

        return response.body()
    }

    fun searchGamers(): List<Gamer> {
        val url = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/gamers.json"
        val responseApi = requestDataFromApi(url)

        val gson = Gson()
        val myGamerType = object : TypeToken<List<DataGamerJson>>() {}.type
        val listGamer: List<DataGamerJson> = gson.fromJson(responseApi, myGamerType)

        return listGamer.map { dataGamerJson -> dataGamerJson.createGamer() }
    }

    fun searchGame(id: String): DataGame {
        val url = "https://cheapshark.com/api/1.0/games?id=$id"
        val responseApi = requestDataFromApi(url)

        val gson = Gson()
        val myInfoGame = gson.fromJson(responseApi, DataGame::class.java)

        return myInfoGame
    }

    fun searchGames(): List<Game> {
        val url = "https://raw.githubusercontent.com/jeniblodev/arquivosJson/main/jogos.json"
        val json = requestDataFromApi(url)

        val gson = Gson()
        val myGameType = object : TypeToken<List<DataGameJson>>() {}.type
        val listGames: List<DataGameJson> = gson.fromJson(json, myGameType)

        return listGames.map { dataGameJson -> dataGameJson.createGame() }
    }

}