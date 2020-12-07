package com.example.product.ui.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.product.R

class InsertActivity : AppCompatActivity()
{
    companion object
    {
        fun newIntent(context : Context) : Intent
        {
            return Intent(context, InsertActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
    }
}