import platform.UIKit.UIDevice
import kotlinx.coroutines.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.client.engine.cio.*

class GoogleBooksKMP {
    private val httpClient = HttpClient(CIO)
    
    suspend fun fetchBooks(query: String): String {
        val apiKey = "YOUR_GOOGLE_BOOKS_API_KEY"
        val url = "https://www.googleapis.com/books/v1/volumes?q=$query&key=$apiKey"
        
        return try {
            val response: HttpResponse = httpClient.get(url)
            response.body()
        } catch (e: Exception) {
            "Error fetching books: ${e.message}"
        }
    }
}

expect fun getPlatformName(): String

actual fun getPlatformName(): String {
    return UIDevice.currentDevice.systemName()
}

fun main() {
    runBlocking {
        val booksService = GoogleBooksKMP()
        val result = booksService.fetchBooks("Kotlin")
        println("Fetched Books: $result")
    }
}
