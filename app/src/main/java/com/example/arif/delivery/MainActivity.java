package com.example.arif.delivery;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] titles;
    String[] compny;
    String[] qty;
    String[] mrp;
    ListView list;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[] images = {R.drawable.dovew, R.drawable.dovep, R.drawable.cintholo, R.drawable.cintholc, R.drawable.cintholl, R.drawable.cintholcon, R.drawable.luxv,
                R.drawable.luxf, R.drawable.luxc, R.drawable.luxsa, R.drawable.luxs, R.drawable.luxp,
                R.drawable.lirill, R.drawable.liril, R.drawable.fiamam, R.drawable.fiamal, R.drawable.fiamap, R.drawable.fiamapi,
                R.drawable.denimp, R.drawable.denimo, R.drawable.dettolo, R.drawable.dettolc, R.drawable.dettols, R.drawable.dettolf,
                R.drawable.lifet, R.drawable.lifen, R.drawable.lifec, R.drawable.lifel, R.drawable.lifeh};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Resources res = getResources();
        titles = res.getStringArray(R.array.product_title);
        compny = res.getStringArray(R.array.company);
        qty = res.getStringArray(R.array.qty);
        mrp = res.getStringArray(R.array.mrp);
        list = (ListView) findViewById(R.id.listView);
        adapter=new ListAdapter(this,titles,compny,qty,mrp,images);
        list.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Cart.class);
                startActivity(intent);
            }
        });
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
    }
}
