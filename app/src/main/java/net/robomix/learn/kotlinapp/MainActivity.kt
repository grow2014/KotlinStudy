package net.robomix.learn.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import butterknife.bindOptionalView
import net.robomix.learn.kotlinapp.models.Employee
import net.robomix.learn.kotlinapp.models.Person

class MainActivity : AppCompatActivity() {

    val tvTitle: TextView? by bindOptionalView(R.id.tvTitle) // val -> unchangeable
    val tvOtherTitle: TextView? by bindOptionalView(R.id.tvOtherTitle)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle?.text = "Test text"
        tvOtherTitle?.text = "Other text"

        val person: Person = Person("Andrew", 37)
        tvTitle?.text = person.getName()
        tvOtherTitle?.text = person.getAge().toString()

        val employee: Employee = Employee(person.getName(), person.getAge(), "Livegenic")
        employee.testLog()
    }
}
