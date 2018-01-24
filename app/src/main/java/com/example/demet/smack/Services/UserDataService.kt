package com.example.demet.smack.Services

import android.graphics.Color
import java.util.*

/**
 * Created by demet on 2018. 01. 24..
 */
object UserDataService {
    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logOut(){
         id = ""
         avatarColor = ""
         avatarName = ""
         email = ""
         name = ""
        AuthService.authToken = ""
        AuthService.userEmail = ""
        AuthService.isLoggedIn = false

    }


    fun getAvatarColor(components: String) : Int{
        val strippedColor = components.replace("[", "")
                .replace("]", "")
                .replace(",", "")
        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if(scanner.hasNext()){
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }
        return Color.rgb(r,g,b)
    }
}