import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.loginpage.CatalogActivity;
import com.example.loginpage.R;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cek apakah username dan password sesuai
                if (usernameEditText.getText().toString().equals("pengguna") &&
                        passwordEditText.getText().toString().equals("masuk")) {
                    // Jika sesuai, buka Halaman Aplikasi
                    Intent intent = new Intent(LoginActivity.this, CatalogActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
