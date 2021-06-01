package rp.edu.sg.c346.id20021576.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
                tvTranslatedText.setText("Hello");

                return true; //menu item successfully handled
        } else if (id == R.id.ItalianSelection) {//check if the selected menu item ID is 1
                //code for action
                tvTranslatedText.setText("Ciao");

                return true;  //menu item successfully handled
            }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation

    }

}