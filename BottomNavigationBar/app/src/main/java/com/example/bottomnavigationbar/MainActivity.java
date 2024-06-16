package com.example.bottomnavigationbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
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

        BottomNavigationView navBar =findViewById(R.id.navBar);
        navBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();


                if (id == R.id.Home) {
                    loadFrag(new HomeFragment(), 1);
                } else if (id == R.id.Reel) {
                    loadFrag(new ReelsFragment(), 1);
                } else if (id == R.id.Story) {
                    loadFrag(new StoryFragment(),1);
                } else if (id== R.id.Setting) {
                    loadFrag(new SettingFragment(),1);
                }else {
                    loadFrag(new ProfileFragment(),1);
                }
                return true;
            }
        });
        navBar.setSelectedItemId(R.layout.fragment_home);
    }

    public void loadFrag(Fragment fragment , int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag ==0){
            ft.add(R.id.container,fragment);
        }
        else {
            ft.replace(R.id.container,fragment);
        }
        ft.commit();
    }
}