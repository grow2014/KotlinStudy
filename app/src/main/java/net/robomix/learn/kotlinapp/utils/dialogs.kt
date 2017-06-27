package net.robomix.learn.kotlinapp.utils

import android.app.DialogFragment


/**
 *
 * @author Andrew.Gahov@gmail.com  (27.06.2017).
 *
 */

// static method
fun makeDialog(type: String?):DialogFragment {
    if (type == "") {
        return DialogFragment()
    } else {
        return DialogFragment()
    }
}