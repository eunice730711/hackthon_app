package app.num.bargraphmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pockdex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pockdex);

        Button button = (Button) findViewById(R.id.btn_power);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub

                Intent intent = new Intent();
                intent.setClass(Pockdex.this,Power.class);
                startActivity(intent);
            }

        });
    }

}
