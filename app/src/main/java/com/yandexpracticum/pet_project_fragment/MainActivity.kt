package com.yandexpracticum.pet_project_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            /**
             * Отображаем родительский фрагмент, в который дальше добавим переключение между
             * вложенными фрагментами.
             */
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, FragmentA())
                .commit()
        }
    }
}