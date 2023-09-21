package com.example.meeting4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler dbHandler = new DBHandler(this);

         dbHandler.addContact(new Contact("Budi","081333840690"));
         dbHandler.addContact(new Contact("Angga","082131986018"));
         dbHandler.addContact(new Contact("Joyo","082151252110"));

         Log.d("SQLITE","Membaca isi database");
        List<Contact> contacts = dbHandler.getAllContacts();
        for (Contact c: contacts){
            String m = "id: "+c.getId()+ " Nama: "+c.getNama()+" Phone: "+c.getPhone();
            Log.d("SQLITE",m);
        }
    }
}