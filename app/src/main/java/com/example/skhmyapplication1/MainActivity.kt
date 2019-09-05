package com.example.skhmyapplication1

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.concurrent.TimeUnit
import javax.xml.datatype.DatatypeConstants.DAYS



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  editText1.setOnClickListener {
             *//* val dateStr = "12/3/2017"
            val dateStr2 = "12/4/2017"
            val sdf= SimpleDateFormat("MM/dd/yyyy")
            val date = sdf.parse(dateStr)
            val date2 = sdf.parse(dateStr2)

            val diffInMillies = date2.time - date.time
            val diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)+1
            textView1.text= diff.toString()*//*
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in Toast
                Toast.makeText(this, """$dayOfMonth/${monthOfYear + 1}/$year""", Toast.LENGTH_LONG).show()
                val date="$dayOfMonth - ${monthOfYear + 1} - $year"

                textView1.text= date
                editText1.setText(date)
               // textView1.toString(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG)
            }, year, month,day)
            dpd.show()

        }*/
      /*  editText2.setOnClickListener {
            *//* val dateStr = "12/3/2017"
             val dateStr2 = "12/4/2017"
             val sdf= SimpleDateFormat("MM/dd/yyyy")
             val date = sdf.parse(dateStr)
             val date2 = sdf.parse(dateStr2)

             val diffInMillies = date2.time - date.time
             val diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)+1
             textView1.text= diff.toString()*//*
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in Toast
                Toast.makeText(this, """$dayOfMonth/${monthOfYear + 1}/$year""", Toast.LENGTH_LONG).show()
                val date="$dayOfMonth - ${monthOfYear + 1} - $year"

                textView1.text= date
                editText1.setText(date)
                // textView1.toString(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG)
            }, year, month,day)
            dpd.show()

        }*/
     /*   button1.setOnClickListener {
            *//* val dateStr = "12/3/2017"
             val dateStr2 = "12/4/2017"
             val sdf= SimpleDateFormat("MM/dd/yyyy")
             val date = sdf.parse(dateStr)
             val date2 = sdf.parse(dateStr2)

             val diffInMillies = date2.time - date.time
             val diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)+1
             textView1.text= diff.toString()*//*
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in Toast
                Toast.makeText(this, """$dayOfMonth/${monthOfYear + 1}/$year""", Toast.LENGTH_LONG).show()
                val date="$dayOfMonth - ${monthOfYear + 1} - $year"

                textView1.text= date
                editText1.setText(date)
                // textView1.toString(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG)
            }, year, month,day)
            dpd.show()

        }*/
        textView1.setOnClickListener {
            /* val dateStr = "12/3/2017"
             val dateStr2 = "12/4/2017"
             val sdf= SimpleDateFormat("MM/dd/yyyy")
             val date = sdf.parse(dateStr)
             val date2 = sdf.parse(dateStr2)

             val diffInMillies = date2.time - date.time
             val diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)+1
             textView1.text= diff.toString()*/
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in Toast
                Toast.makeText(this, """$dayOfMonth/${monthOfYear + 1}/$year""", Toast.LENGTH_LONG).show()
                val date="$dayOfMonth - ${monthOfYear + 1} - $year"

                textView1.text= date
              //  editText1.setText(date)
                // textView1.toString(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG)
            }, year, month,day)
            dpd.show()

        }
        textView2.setOnClickListener {
            /* val dateStr = "12/3/2017"
             val dateStr2 = "12/4/2017"
             val sdf= SimpleDateFormat("MM/dd/yyyy")
             val date = sdf.parse(dateStr)
             val date2 = sdf.parse(dateStr2)

             val diffInMillies = date2.time - date.time
             val diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)+1
             textView1.text= diff.toString()*/
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in Toast
                Toast.makeText(this, """$dayOfMonth/${monthOfYear + 1}/$year""", Toast.LENGTH_LONG).show()
                val date="$dayOfMonth - ${monthOfYear + 1} - $year"

                textView2.text= date
                //editText1.setText(date)
                // textView1.toString(this, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG)
            }, year, month,day)
            dpd.show()


        }
    }
}
