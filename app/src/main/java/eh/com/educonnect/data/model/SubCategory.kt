package eh.com.educonnect.data.model

import com.google.gson.annotations.SerializedName

data class SubCategory(
    @SerializedName("id")
    val id:Int=0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("category_id")
    val category_id : Int
)