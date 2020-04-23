package cl.dyi.emonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView earthquakeListView = (ListView) findViewById(R.id.earthquake_list_view);
        ArrayList<Earthquake> eqList = new ArrayList<>();
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));
        eqList.add(new Earthquake("3.5","Arica, Chile"));
        eqList.add(new Earthquake("6.5", "Chillan, Chile"));
        eqList.add(new Earthquake("3.2", "Iquique, Chile"));


        EqAdapter eqAdapter = new EqAdapter(this, R.layout.eq_list_item, eqList);
        earthquakeListView.setAdapter(eqAdapter);
       //
        //
        //  ListView earthquake_list_view = (ListView) findViewById(R.id.earthquake_list_view);
        //        ArrayList<String> countriesList = new ArrayList<>();
        //        countriesList.add("Mexico");
        //        countriesList.add("Chile");
        //        countriesList.add("España");*/
        //        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countriesList);
       // earthquake_list_view.setAdapter(countriesAdapter);
    }
}
