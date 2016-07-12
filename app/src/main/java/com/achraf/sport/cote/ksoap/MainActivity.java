package com.achraf.sport.cote.ksoap;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String SOAP_ACTION = "http://achrafchikoun.com/ws/IService/getAllMatchs";
    private static final String METHOD_NAME = "getAllMatchs";
    private static final String NAMESPACE= "http://achrafchikoun.com/ws/";
    private static final String URL_ = "http://79.170.44.202/achrafchikoun.com/ws/Service.svc?singleWsdl";
    private static final String TAG = "MainActivity_SOAP";
    private Boolean internetResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            internetResponse = new internetCheking().execute().get();
            Log.i("TAG_INTERNET", internetResponse.toString());
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }

        if(internetResponse == true)
            new soapClient().execute();
    }

    public  boolean hasActiveInternetConnection(Context context) {
        if (isNetworkAvailable(context)) {
            try {
                HttpURLConnection urlc = (HttpURLConnection) (new URL("http://www.google.com").openConnection());
                urlc.setRequestProperty("User-Agent", "Test");
                urlc.setRequestProperty("Connection", "close");
                urlc.setConnectTimeout(1500);
                urlc.connect();
                return (urlc.getResponseCode() == 200);
            } catch (IOException e) {
                Log.e(TAG, "Error checking internet connection", e);
            }
        } else {
            Log.d(TAG, "No network available!");
        }
        return false;
    }

    public boolean isNetworkAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public class soapClient extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER10);
            envelope.setOutputSoapObject(request);
            //envelope.addMapping(NAMESPACE, "Category",new Category().getClass()); passing parameter
            HttpTransportSE ht = new HttpTransportSE(URL_, 60000);
            try {
                ht.call(SOAP_ACTION, envelope);
                SoapObject  response = (SoapObject)envelope.getResponse();
                SoapObject soapobject = (SoapObject)  response.getProperty(0);
                Log.i(TAG, soapobject.getProperty("DateBet").toString());

            } catch (Exception e) {
                Log.e(TAG, e.toString());
            }

            return null;
        }
    }

    public class internetCheking extends AsyncTask<Void, Void, Boolean>{
        @Override
        protected Boolean doInBackground(Void... voids) {
            return hasActiveInternetConnection(MainActivity.this);
        }
    }
}
