package models
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Products (
    @SerialName("id")
    var id: Int=0,
    @SerialName("title")
    var title: String="",
    @SerialName("price")
    val price: Double=0.0,
    @SerialName("description")
    val description: String="",
    @SerialName("category")
    val category: String="",
    @SerialName("image")
    val image: String="",
)