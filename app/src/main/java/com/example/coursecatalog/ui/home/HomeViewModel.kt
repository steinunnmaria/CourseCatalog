package com.example.coursecatalog.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coursecatalog.Entities.Course

class HomeViewModel : ViewModel() {

    private val courseTest1 = Course("TÖL101G", "Tölvunarfræði 1", 6.0, "Haust",
    "Grunnám", "VON", "IVT", "Íslenska", "Ebba Þóra",
    "Ebba Þóra, Steinunn María", "2022-2023", true, "08711120226",
    "https://ugla.hi.is/kennsluskra/?tab=nam&chapter=namskeid&id=08711120226&kennsluar=2022");
    private val courseTest2 = Course("TÖL105G", "Tölvunarfræði 8", 9.0, "Sumar",
        "Framhaldsnám", "VON", "IVT", "Íslenska", "Ebba Þóra",
        "Ebba Þóra, Steinunn María", "2022-2023", true, "08711120226",
        "https://ugla.hi.is/kennsluskra/?tab=nam&chapter=namskeid&id=08711120226&kennsluar=2022");
    private val courseCatalogList = arrayListOf<Course>(courseTest1, courseTest2)


    private val _text = MutableLiveData<String>().apply {
        value = "Prófa að breyta"
    }
    private val _list = MutableLiveData<Course>().apply {
        value = courseTest1
    }
    val courseList: MutableLiveData<Course> = _list
    val text: LiveData<String> = _text
}