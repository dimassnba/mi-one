package cobafp.com.cobafinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText nama, email;
    String strNama, strEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nama = findViewById(R.id.eNama);
        email = findViewById(R.id.eEmail);
    }

    public void Masuk(View view){
        strNama = nama.getText().toString();
        strEmail = email.getText().toString();

        Intent move = new Intent(this, MainActivity.class);
        move.putExtra("NAMA", strNama);
        move.putExtra("EMAIL", strEmail);
        startActivity(move);
    }

}
