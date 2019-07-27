package cobafp.com.cobafinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNama, tvEmail;
    String strNama, strEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        strNama = bundle.getString("NAMA");
        strEmail = bundle.getString("EMAIL");

        tvNama =findViewById(R.id.getNama);
        tvNama.setText(strNama);

        tvEmail = findViewById(R.id.getEmail);
        tvEmail.setText(strEmail);

    }

    public void satu(View view) {
        Intent move = new Intent(this, MatkulSatu.class);
        startActivity(move);
    }

    public void dua(View view) {
        Intent move =  new Intent(this, MatkulDua.class);
        startActivity(move);
    }

    public void tiga(View view) {
        Intent move =  new Intent(this, MatkulTiga.class);
        startActivity(move);
    }


    public void empat(View view) {
        Intent move =  new Intent(this, MatkulEmpat.class);
        startActivity(move);
    }

    public void lima(View view) {
        Intent move =  new Intent(this, MatkulLima.class);
        startActivity(move);
    }

    public void enam(View view) {
        Intent move =  new Intent(this, MatkulEnam.class);
        startActivity(move);
    }

    public void jadwal(View view) {
        Intent move =  new Intent(this, Jadwal.class);
        startActivity(move);
    }
}
