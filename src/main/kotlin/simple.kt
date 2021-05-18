import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    val g = Greeter("Hello")
    console.log(Json.encodeToString(g))
}

@Serializable
data class Greeter(
    val greeting:String,
    val name:String = "KotlinJS",
    val meetingDate: Instant = Clock.System.now()
)