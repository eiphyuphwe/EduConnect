package eh.com.educonnect.data.model

import android.util.Log
import com.google.gson.annotations.SerializedName

class Item(id:String) //primary constructor declaration
{
    @SerializedName("id")
    var id :String = id; // can initialize param like this

    @SerializedName("title")
    var title:String? = ""

    @SerializedName("category")
    lateinit var category : Category // lateinit

        //lateinit means late initialization. If you do not want to initialize a variable in the constructor instead you want to initialize it later on and if you can guarantee the initialization before using it, then declare that variable with lateinit keyword.
            //You cannot use lateinit for primitive type properties like Int, Long etc.
        //
        //Accessing a lateinit property before it has been initialized throws a special exception that clearly identifies the property being accessed and the fact that it hasn't been initialized.
    @SerializedName("subcategory")
    lateinit var subCategory: SubCategory;

    init {
        Log.d("Item id",id); // primary constructor can't contain any code. init code can be placed init block.using init keyword

    }

    //2 secondary constructor
    //1. use constructor keyword
    //2. If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor using this keyword

    constructor(id:String,title:String?) : this(id)
    {
        this.title = title
    }





}