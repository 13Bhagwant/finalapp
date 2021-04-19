package com.dgl104.finalexam.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dgl104.finalexam.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private FloatingActionButton fab;
    private TextView punchlineTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottomAppBar);
        fab = findViewById(R.id.fab);
        bottomAppBar.replaceMenu(R.menu.bottom_app_bar);

        punchlineTextView = findViewById(R.id.punchlineTextView);

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.previous:
                        Toast.makeText(MainActivity.this, "Clicked previous menu item", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.next:
                        Toast.makeText(MainActivity.this, "Clicked next menu item", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (punchlineTextView.getVisibility() == View.INVISIBLE) {
                    punchlineTextView.setVisibility(View.VISIBLE);
                } else if (punchlineTextView.getVisibility() == View.VISIBLE) {
                    punchlineTextView.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}