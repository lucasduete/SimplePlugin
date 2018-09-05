package io.github.lucasduete.cordova.simplePlugin;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import java.lang.InterruptedException;
import java.lang.Thread;

public class SimpleService extends IntentService {
    
    public SimpleService() {
        super("LogServie");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            while(true) {
                Thread.sleep(1000);
                Log.d("SimplePlugin", "Hello world lucasduete");
            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}