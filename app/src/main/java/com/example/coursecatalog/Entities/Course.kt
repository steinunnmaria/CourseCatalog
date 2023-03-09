package com.example.coursecatalog.Entities

class Course
    (val acronym: String,
     val title: String,
     val ects: Double,
     val semester: String,
     val eduLevel: String,
     val field: String,
     val dept: String,
     val language: String,
     val mainTeachers: String,
     val teachers: String,
     val year: String,
     val isTaught: Boolean,
     val courseID: String,
     val hyperlink: String,
     val mandatoryPrereq: String? = null,
     val reccomPrereq: String? = null) {



}