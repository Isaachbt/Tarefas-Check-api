package com.example.tarefascheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tarefascheck.databinding.ActivityTarefaBinding;

public class TarefaActivity extends AppCompatActivity {
    private ActivityTarefaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTarefaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}