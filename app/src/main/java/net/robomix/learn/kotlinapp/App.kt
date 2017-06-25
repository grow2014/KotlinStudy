package net.robomix.learn.kotlinapp

import android.app.Application
import com.orhanobut.logger.*

/**
 * @author Andrew.Gahov@gmail.com  (25.06.2017).
 */

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        // make Logger
        val builder: PrettyFormatStrategy.Builder = PrettyFormatStrategy.newBuilder()
        builder
                .tag("CustomLog")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(3)         // (Optional) How many method line to show. Default 2

        Logger.addLogAdapter(AndroidLogAdapter(builder.build()))
    }
}
