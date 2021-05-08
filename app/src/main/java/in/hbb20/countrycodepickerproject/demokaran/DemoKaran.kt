package `in`.hbb20.countrycodepickerproject.demokaran

import `in`.hbb20.countrycodepickerproject.R
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hbb20.CountryCodePicker

class DemoKaran: AppCompatActivity() {
    lateinit var btnOpen:Button
    lateinit var countryCode:CountryCodePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_demo_karan)
        btnOpen=findViewById(R.id.btnOpen)
        countryCode=findViewById(R.id.ccp)

        countryCode.setDetectCountryWithAreaCode(true)

    }
}