package com.example.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_view);

        getincomingintent();
    }

    private void getincomingintent(){
        if (getIntent().hasExtra("image_URL")&& getIntent().hasExtra("bookname")&&getIntent().hasExtra("Author")){
            String imageurl = getIntent().getStringExtra("image_URL");
            String bookname = getIntent().getStringExtra("bookname");
            String author = getIntent().getStringExtra("Author");

            setimage(imageurl,bookname,author);
        }

    }

    private void setimage(String imageurl, String bookname , String author){
        TextView name = findViewById(R.id.image1_description);
        name.setText(bookname);
        TextView name1 = findViewById(R.id.image_description);
        name1.setText(author);

        ImageView image = findViewById(R.id.image2);
        Glide.with(this)
                .load(imageurl)
                .into(image);


    }
}
