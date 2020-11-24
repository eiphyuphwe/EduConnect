package eh.com.educonnect.note

import com.google.gson.annotations.SerializedName

//lateinit
//1. lateinit means late initialization. If you do not want to initialize a variable in the constructor instead you want to initialize it later on and if you can guarantee the initialization before using it, then declare that variable with lateinit keyword.
//2. You cannot use lateinit for primitive type properties like Int, Long etc.
//3.Accessing a lateinit property before it has been initialized throws a special exception that
// clearly identifies the property being accessed and the fact that it hasn't been initialized.

/*
lazy

It means lazy initialization. Your variable will not be initialized unless you use that variable in your code.
It will be initialized only once after that we always use the same value.
 */

/*
lateinit or lazy

    If variable are mutable (i.e. might change at a later stage) use lateinit

    lateinit var can be initialized from anywhere the object is seen from.

    lazy can only be used for val properties, whereas lateinit can only be applied to var because it can’t be compiled to a final field, thus no immutability can be guaranteed.
 */

/*
    getter
    Customized Getter and Setter
    - normally in Kotin will generate default getter and setter for variables
    - var has default getter and setter
    - val has default getter ( immutable)
    - you can define your own getter and setter also

    class Person{
    var name: String = ""
        get() {
            println("Inside get() of name")
            return field.toString()
        }
        set(value) {
            println("Inside set() of name")
            if (value.length < 3)
                field = "INVALID NAME"
            else
                field = value
        }
    val age: Int = 18
        get(){
            println("Inside get() of age")
            return field
        }
}

 */
class KotlinNoteLateInitVsLazy{
    var isBoolean : Boolean = false
        get() = field
    set(value) { field = value}
}