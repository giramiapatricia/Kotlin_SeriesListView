package com.example.kotlin_series

class CountryModel {
    // mirrors data(strings, integers...) in list,database or json file - model data in your application
    var name:String = ""
    var description:String = ""
    var flag:Int = 0

    constructor(name:String,description:String,flag:Int){
        this.name = name
        this.description = description
        this.flag = flag
    }
}