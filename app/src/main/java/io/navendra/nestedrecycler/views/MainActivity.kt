package io.navendra.nestedrecycler.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import io.navendra.nestedrecycler.R
import io.navendra.nestedrecycler.models.ParentDataFactory
import io.navendra.nestedrecycler.views.adapters.ParentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler(){
        recyclerView = rv_parent

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayout.VERTICAL, false)
            adapter = ParentAdapter(ParentDataFactory.getParents(40))
        }

    }
}
