package com.aniruddha.kudalkar.uitesting

class LoginValidations {

    fun isUserNameValid(usNm : String) : Boolean  {
        if(usNm.isEmpty()) return false
        if(usNm.length >= 8) return false
        if(usNm.contains("#")) return false
        return true
    }
    fun isPasswordValid(pass : String): Boolean {
        if(pass.isEmpty()) return false
        if(pass.contains("[a-zA-Z0-9\\-#\\.\\(\\)\\/%&\\s]{0,19}")) return true
        return false
    }
}