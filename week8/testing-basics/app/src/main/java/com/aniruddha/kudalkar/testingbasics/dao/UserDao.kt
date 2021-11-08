package com.aniruddha.kudalkar.testingbasics.dao

import com.aniruddha.kudalkar.testingbasics.domain.User

class UserDao {

    private val users = listOf(
        User(1, "abc"),
        User(2, "pqr"),
        User(3, "lmn"),
        User(4, "xyz"),
    )

    fun findUserById(id : Long) = users.find { it.id == id }

    fun findRecentUser() = users.last()

    fun findUsersLike(nm : String) = users.filter { it.name.contains(nm) }
}