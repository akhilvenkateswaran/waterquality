package com.example.dell.waterquality;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.URI;
import java.net.URL;

/**
 * Created by DELL on 29-01-2018.
 */


class WebServiceHelper extends AsyncTask<String, Void, String> {
        // private Activity ac;
        //flag 0 means get and 1 means post.(By default it is get.)
        private Context mContext;

        public WebServiceHelper(Context ctx)
        {
            this.mContext = ctx;
        }
        protected void onPreExecute() {
            //Toast.makeText(getApplicationContext(), "Uploading...", Toast.LENGTH_LONG).show();
        }
        @Override
        protected String doInBackground(String... arg0) {
            try {
                String search = arg0[0];
                String link = "https://webberplus.000webhostapp.com/mquery.php?object=" + search;
                URL url = new URL(link);
                HttpClient client = new DefaultHttpClient();
                HttpGet request = new HttpGet();
                request.setURI(new URI(link));
                HttpResponse response = client.execute(request);
                return "";
            } catch (Exception e) {
                return new String("Exceptionup: " + e.getMessage());
            }
        }
        @Override
        protected void onPostExecute(String result) {
            //Toast.makeText(getApplicationContext(), "Uploaded...", Toast.LENGTH_SHORT).show();
            //    select();
        }
    }


