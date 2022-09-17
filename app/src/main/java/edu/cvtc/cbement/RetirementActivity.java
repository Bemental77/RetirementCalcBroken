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
        Integer currentAge = in.getIntExtra(MainActivity.ODD_EVEN_MESSAGE, 0);
        int reqRetirement = in.getIntExtra(MainActivity.REQ_RETIREMENT, 30);
        Integer calculatedRetirement = reqRetirement - currentAge;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearsUntil = year + calculatedRetirement;
        TextView textView = this.findViewById(R.id.textViewOddEvenResult);

        textView.setText("You have" + calculatedRetirement.toString() + "until you can retire. It's " + year + ", so you can retire in " + yearsUntil);

    }

}