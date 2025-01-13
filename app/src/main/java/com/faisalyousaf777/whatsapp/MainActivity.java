package com.faisalyousaf777.whatsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDate;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvChat;
    AppCompatImageView ivProfilePic;
    AppCompatTextView tvName, tvMessage, tvTime;

    @SuppressWarnings("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvChat = findViewById(R.id.rvChats);
        ivProfilePic = findViewById(R.id.ivProfilePic);
        tvName = findViewById(R.id.tvName);
        tvMessage = findViewById(R.id.tvMessage);
        tvTime = findViewById(R.id.tvDateTime);

        rvChat.setLayoutManager(new LinearLayoutManager(this));
        rvChat.setAdapter(new ChatAdapter(sampleChats()));

    }

    private List<Chat> sampleChats() {
        return List.of(
                new Chat("John Doe", "Hello there!", LocalDate.now()),
                new Chat("Jane Doe", "Hi!", LocalDate.now()),
                new Chat("Alice", "Hey!", LocalDate.now()),
                new Chat("Bob", "Hello!", LocalDate.now()),
                new Chat("Charlie", "Hi there!", LocalDate.now()),
                new Chat("David", "Hey!", LocalDate.now()),
                new Chat("Eve", "Hello", LocalDate.now()),
                new Chat("Frank", "Hi!", LocalDate.now()),
                new Chat("Grace", "Hey!", LocalDate.now()),
                new Chat("Hannah", "Hello!", LocalDate.now()),
                new Chat("Ivy", "Hi there!", LocalDate.now()),
                new Chat("Jack", "Hey!", LocalDate.now()),
                new Chat("Katie", "Hello", LocalDate.now()),
                new Chat("Liam", "Hi!", LocalDate.now()),
                new Chat("Mia", "Hey!", LocalDate.now()),
                new Chat("Nathan", "Hello!", LocalDate.now()),
                new Chat("Olivia", "Hi there!", LocalDate.now()),
                new Chat("Peter", "Hey!", LocalDate.now()),
                new Chat("Quinn", "Hello", LocalDate.now()),
                new Chat("Ryan", "Hi!", LocalDate.now()),
                new Chat("Sara", "Hey!", LocalDate.now()),
                new Chat("Tom", "Hello!", LocalDate.now())
        );
    }
}