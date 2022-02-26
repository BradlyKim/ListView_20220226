package com.neppplus.listview_20220226

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listview_20220226.datas.StudentData

class MainActivity : AppCompatActivity() {
    
//     학생 목록을 담을 그릇
    val mStudentList = ArrayList<StudentData>( )
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )
        mStudentList.add( StudentData("김정환", 1981, "서울시 중랑구") )

        }
}