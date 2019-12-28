package lb7.alish.telegramBottomSheet.util;

import android.util.Log;

public class FileLog {

    private static final String TAG = "LB7BottomSheet";

    public static void e(Exception e) {
        Log.e(TAG, e.getMessage(), e);
    }
}
