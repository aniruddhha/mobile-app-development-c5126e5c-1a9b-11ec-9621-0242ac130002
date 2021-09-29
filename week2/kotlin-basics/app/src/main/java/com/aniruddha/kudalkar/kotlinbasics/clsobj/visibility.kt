package com.aniruddha.kudalkar.kotlinbasics.clsobj

//Classes, objects, interfaces, constructors, and functions,
// as well as properties and their setters, can have visibility modifiers.

// There are four visibility modifiers in Kotlin: private, protected, internal, and public.
// The default visibility is public.

private fun hello() = "hi" //  visible inside this .kt file
internal class Abc // visible inside the same module
public var data = 56 // visible every where

open class Visibility (
    private var x : Int = 40,
    protected var y : Int = 50,
    internal var z :Int = 60,
    public var v :Int = 70
) {
    // private - member is visible inside this class
    // protected - same visibility as one marked as private,
    // but that it is also visible in subclasses.
    // internal - inside this module who sees the declaring class sees its internal members.
    // public - who sees the declaring class sees its public members.
}

class SubSubVisibility : Visibility() {
    fun vs() {
        y = 10
    }
}

