package com.kslim1025.kotlinlistview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kslim1025.kotlinlistview.R
import kotlinx.android.synthetic.main.activity_main.view.*
import org.intellij.lang.annotations.JdkConstants

class StudentsAdapter(val mContext:Context, val resId:Int, val mList:List<String>) {
    val inf = LayoutInflater.from(mContext)

    override fun getView(position:Int, convertView: View?, parent: ViewGroup):ViewGroup{
        var tempRow = convertView;
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.studentlist_item,null)
        }
    }
}
