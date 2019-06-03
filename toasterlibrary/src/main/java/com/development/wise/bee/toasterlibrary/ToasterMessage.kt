package com.development.wise.bee.toasterlibrary

import android.content.Context
import android.widget.Toast

public class ToasterMessage {
    public fun show(message: String, context: Context) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}