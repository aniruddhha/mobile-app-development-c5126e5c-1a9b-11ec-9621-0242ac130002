package com.aniruddha.kudalkar.myapplication.recgrd

data class SalaryCard(
    var bd: BasicDetails = BasicDetails(),
    var sd: SalaryDetails = SalaryDetails()
)

data class BasicDetails(
    var name: String = "",
    var age: Int = 0,
    var mobile: String = "",
    var email: String = ""
)

data class SalaryDetails(
    var basicSalary: Double = 0.0,
    var hra: Double = 0.0,
    var ta: Double = 0.0,
    var ctc: Double = 0.0
)
