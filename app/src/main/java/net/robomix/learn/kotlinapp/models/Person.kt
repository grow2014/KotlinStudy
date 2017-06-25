package net.robomix.learn.kotlinapp.models


/**
 *
 * @author Andrew.Gahov@gmail.com  (24.06.2017).
 *
 */

open class Person(private val name: String, private val age: Int) {

    var email: String? = null

    fun getName(): String {
        return this.name
    }

    fun getAge(): Int {
        return this.age
    }

    fun getPersonEmail() : String? {
        return this.email
    }

    constructor(name: String, age: Int, email: String?) : this(name, age) {
        this.email = email
    }
}