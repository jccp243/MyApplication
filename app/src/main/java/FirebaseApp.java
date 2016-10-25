import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by JULIO CALDERON on 24/10/2016.
 */

public class FirebaseApp extends Application {
    private static final String TAG = "ForoGeneral";


    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
