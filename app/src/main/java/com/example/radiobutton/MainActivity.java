package com.example.radiobutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_sandwich:
                if (checked) {

                    showmsg("You Selected Sandwich");
                    // Pirates are the best
                }

                break;
            case R.id.radio_pizza:
                if (checked)
                {
                    Toast.makeText(this, "You Selected Pizza", Toast.LENGTH_SHORT).show();
                }
                // Ninjas rule

                break;
        }
    }

    private void showmsg(String item)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Selected item");
        builder.setMessage(item);
        builder.show();
    }
}


