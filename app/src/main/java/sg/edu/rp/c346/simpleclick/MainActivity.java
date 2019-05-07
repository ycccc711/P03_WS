package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //declare the field variable
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect the variables to the respective UI elements
        //linking UI elements
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbEnabled = findViewById(R.id.toggleButtonEnabled);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //convert to string
                //assign to a variable called stringResponse
                String stringResponse = etInput.getText().toString();
                //display value of stringResponse
                tvDisplay.setText(stringResponse);
            }
        });
        tbEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tbEnabled.isChecked()){
                    etInput.setEnabled(false);

                }else{
                    etInput.setEnabled(true);
                }
            }
        });

    }
}
