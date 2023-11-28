package ba.sum.fpmoz.netflix_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import ba.sum.fpmoz.netflix_two.models.user;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db;

    String uuid = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.db = FirebaseDatabase.getInstance("https://netflix-two-b88bb-default-rtdb.europe-west1.firebasedatabase.app/");



        EditText firstnameTxt = findViewById(R.id.editTextFirstName);
        EditText lastnameTxt = findViewById(R.id.editTextLastName);
        EditText genderTxt = findViewById(R.id.editTextGender);
        EditText dateOfBirthTxt = findViewById(R.id.editTextDob);
        EditText cityTxt = findViewById(R.id.editTextBirthPlace);
        EditText countryTxt = findViewById(R.id.editTextCountry);

        Button submitBtn = findViewById(R.id.buttonSave);
        DatabaseReference usersDBRef = this.db.getReference("users");


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user u = new user(
                        firstnameTxt.getText().toString(),
                        lastnameTxt.getText().toString(),
                        genderTxt.getText().toString(),
                        dateOfBirthTxt.getText().toString(),
                        cityTxt.getText().toString(),
                        countryTxt.getText().toString()

                );

                usersDBRef.child(uuid).setValue(u);
            }
        });


    }

}

