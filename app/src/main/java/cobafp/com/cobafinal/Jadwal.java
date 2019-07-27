package cobafp.com.cobafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class Jadwal extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);

        pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("jadwal.pdf")
                .enableSwipe(true)
                .load();
    }
}
