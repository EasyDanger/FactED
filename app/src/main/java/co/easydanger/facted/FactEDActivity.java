package co.easydanger.facted;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FactEDActivity extends AppCompatActivity {

    //Declare view variables
    private static final String TAG = FactEDActivity.class.getSimpleName();
    private TextView factTextView;
    private Button showFactButton;
    private FactBook fb = new FactBook();
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_ed);


        //Assign the views from the layout table to the corresponding variables.
        factTextView = findViewById(R.id.facttext);
        showFactButton = findViewById(R.id.nextfactbutt);
        rl = findViewById(R.id.layouttt);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int o = rand.nextInt(0x1000000);
                rl.setBackgroundColor(-o);
                factTextView.setText(fb.getFact());
            }
        };
        showFactButton.setOnClickListener(listener);
      //  Toast.makeText(this, "Welcome to this trivia app!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "This is us practicing logging.");
    }
}