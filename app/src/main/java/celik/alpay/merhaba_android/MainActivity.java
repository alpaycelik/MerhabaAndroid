package celik.alpay.merhaba_android;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //MainActivity sınıfımızın hangi View'i kullanacağını set ediyoruz

        //activity_main.xml içine koyduğumuz butonu Java dosyamızda kullanabilmek için buton referansına atıyoruz
        //buton ismindeki referansımız artık view içindeki butonu temsil etmektedir, butona action ekleyebilir tasarımın java dosyamız içinden düzenleyebiliriz
        Button buton = (Button) findViewById(R.id.button);

        buton.setOnClickListener(new View.OnClickListener() { //butona tıklandığı an yapılacaklar
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Merhaba Android")
                        .setMessage("Android ilk uygulamamız.")
                        .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Tamam butonuna basılınca yapılacak olanlar
                            }
                        })
                        .setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // İptal butonuna basınca yapılacak olanlar
                            }
                        })
                        .show();
            }
        });
    }
}
