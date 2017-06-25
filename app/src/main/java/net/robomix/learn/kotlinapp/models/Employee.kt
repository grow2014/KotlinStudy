package net.robomix.learn.kotlinapp.models

import com.orhanobut.logger.Logger


/**
 *
 * @author Andrew.Gahov@gmail.com  (24.06.2017).
 *
 */

class Employee(name: String, age: Int, var company: String?) : Person(name, age) {

    fun testLog() {
        Logger.i("my information. Company = " + company)
    }
}