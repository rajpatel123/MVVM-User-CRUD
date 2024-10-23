package com.eks.mvvm_user_crud.ui.usercrud.view;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eks.mvvm_user_crud.R;
import com.eks.mvvm_user_crud.ui.usercrud.UserAdapter;
import com.eks.mvvm_user_crud.ui.usercrud.model.User;
import com.eks.mvvm_user_crud.ui.usercrud.viewmodel.UserViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        UserAdapter adapter = new UserAdapter();
        recyclerView.setAdapter(adapter);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        userViewModel.getAllUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                adapter.setUsers(users);
            }
        });

        Button buttonAddUser = findViewById(R.id.button_add_user);
        buttonAddUser.setOnClickListener(v -> {
            // Add user logic
        });
    }
}
