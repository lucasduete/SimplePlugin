package io.github.lucasduete.cordova.simplePlugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.Toast;
import android.content.Intent;

public class SimplePlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if (action.equals("callService")) {
            Toast toast = Toast.makeText(cordova.getActivity(), "Deu bom!!!", Toast.LENGTH_LONG);

            toast.show();

            cordova
                .getActivity()
                .startService(
                    new Intent(cordova.getActivity(), SimpleService.class)
                );

            return true;
        }

        return false;
    }

}
