package cl.dyi.emonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DownloadEqsAsyncTask.DownloadEqsInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView earthquakeListView = (ListView) findViewById(R.id.earthquake_list_view);

        ArrayList<Earthquake> eqList = new ArrayList<>();
        eqList.add(new Earthquake("3.5","Arica, Chile"));

        EqAdapter eqAdapter = new EqAdapter(this, R.layout.eq_list_item, eqList);
        earthquakeListView.setAdapter(eqAdapter);

        DownloadEqsAsyncTask downloadEqsAsyncTask = new DownloadEqsAsyncTask();
        downloadEqsAsyncTask.delegate = this;
        try {
            downloadEqsAsyncTask.execute(new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

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


    @Override
    public void onEqsDownloaded(String eqsData) {
        Log.d("MAN", eqsData);
    }
}
