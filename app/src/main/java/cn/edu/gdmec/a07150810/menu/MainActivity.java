package cn.edu.gdmec.a07150810.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE,1,Menu.NONE,"jia");
        menu.add(Menu.NONE,2,Menu.NONE,"jian");
        menu.add(Menu.NONE,3,Menu.NONE,"chun").setIcon(
        android.R.drawable.ic_menu_edit);
        menu.add(Menu.NONE,4,Menu.NONE,"tui");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case 1:
                setTitle("jia");
                break;
            case 2:
                setTitle("jian");
                break;
            case 3:
                setTitle("chun");
                break;
            case 4:
                setTitle("tui");
                break;

        }

        return true;
    }

}
