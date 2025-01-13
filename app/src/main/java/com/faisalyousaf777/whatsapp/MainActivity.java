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
                new Chat("Johnathan Doe", "Hello there! How have you been? It's been a while since we last caught up.", LocalDate.now()),
                new Chat("Jane Doe", "Hi! Just wanted to check in and see how you're doing.", LocalDate.now()),
                new Chat("Alice Johnson", "Hey! Are you free this weekend? Let's catch up over coffee.", LocalDate.now()),
                new Chat("Bob Smith", "Hello! I hope everything is going well on your end.", LocalDate.now()),
                new Chat("Charlie Brown", "Hi there! Just a quick reminder about our meeting tomorrow.", LocalDate.now()),
                new Chat("David Wilson", "Hey! I found this interesting article and thought you might like it.", LocalDate.now()),
                new Chat("Eve Adams", "Hello, just wanted to say thank you for your help the other day.", LocalDate.now()),
                new Chat("Frank Miller", "Hi! Are you available for a call later today?", LocalDate.now()),
                new Chat("Grace Lee", "Hey! I was wondering if you could help me with a project.", LocalDate.now()),
                new Chat("Hannah White", "Hello! How's your new job going?", LocalDate.now()),
                new Chat("Ivy Green", "Hi there! Just wanted to share some good news with you.", LocalDate.now()),
                new Chat("Jack Black", "Hey! Are you coming to the event next week?", LocalDate.now()),
                new Chat("Katie Brown", "Hello, I hope you're having a great day!", LocalDate.now()),
                new Chat("Liam Davis", "Hi! Just checking in to see if you received my email.", LocalDate.now()),
                new Chat("Mia Clark", "Hey! Let's plan a get-together soon.", LocalDate.now()),
                new Chat("Nathan Scott", "Hello! I wanted to discuss a new idea with you.", LocalDate.now()),
                new Chat("Olivia Harris", "Hi there! How's everything going with you?", LocalDate.now()),
                new Chat("Peter Young", "Hey! I have some updates to share with you.", LocalDate.now()),
                new Chat("Quinn Hall", "Hello! Just wanted to say hi and see how you're doing.", LocalDate.now()),
                new Chat("Ryan King", "Hi! Are you free for a quick chat?", LocalDate.now()),
                new Chat("Sara Wright", "Hey! I hope you're having a wonderful day.", LocalDate.now()),
                new Chat("Tom Baker", "Hello! Just wanted to touch base with you.", LocalDate.now())
        );
    }
}