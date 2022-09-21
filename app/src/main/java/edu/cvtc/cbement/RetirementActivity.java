package edu.cvtc.cbement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.time.Year;
import java.util.Calendar;

public class RetirementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odd_even_result);
        Intent in = this.getIntent();
        Integer currentAge = in.getIntExtra(MainActivity.ODD_EVEN_MESSAGE, 30);
        Integer reqRetirementAge = in.getIntExtra(MainActivity.REQ_RETIREMENT, 60);
        Integer year = Calendar.getInstance().get(Calendar.YEAR);
        Integer calculatedRetirementYear = reqRetirementAge - currentAge;
        Integer yearsUntil = year + calculatedRetirementYear;
        TextView textView = this.findViewById(R.id.textViewOddEvenResult);

        textView.setText("reqRetirementAge " + reqRetirementAge.toString()  + " currentAge " + currentAge.toString() + "You have " + calculatedRetirementYear.toString() + " years until you can retire. It's " + year + ", so you can retire in " + yearsUntil);

    }

}