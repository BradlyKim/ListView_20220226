package com.neppplus.listview_20220226

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.neppplus.listview_20220226.adapters.StudentAdapter
import com.neppplus.listview_20220226.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
//     학생 목록을 담을 그릇
    val mStudentList = ArrayList<StudentData>( )

    lateinit var mAdapter: StudentAdapter
    
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

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

//            position : 몇번 줄이 눌렸나? 알려줌. 0에서 출발

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}학생이 클릭됨", Toast.LENGTH_SHORT).show()


        }


        }
}