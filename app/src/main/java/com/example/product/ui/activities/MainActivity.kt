package com.example.product.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.product.R
import com.example.product.ui_seperator.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity()
{
    private val mViewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel.getAllData.observe(this, Observer {
            Toast.makeText(applicationContext, it.size.toString(), Toast.LENGTH_SHORT).show()
        })
        floatingActionButton.setOnClickListener {
            val intent = InsertActivity.newIntent(applicationContext)
            startActivity(intent)
        }
    }
}