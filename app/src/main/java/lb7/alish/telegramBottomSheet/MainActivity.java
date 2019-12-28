package lb7.alish.telegramBottomSheet;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomSheet.Builder builder = new BottomSheet.Builder(this);
        CharSequence[] items = new CharSequence[]{
                "Clear history",
                "Leave Group"
        };
        int[] icons = new int[]{
                android.R.drawable.ic_notification_clear_all,
                android.R.drawable.ic_menu_delete
        };
        builder.setItems(items, icons, (dialog, which) -> {
            Toast.makeText(this, "Click on:" + which, Toast.LENGTH_SHORT).show();
        });
        builder.setTitle("Item Title");

        findViewById(R.id.openDialog).setOnClickListener(view -> {
            BottomSheet bottomSheet = builder.create();
//            bottomSheet.setTitleColor(android.R.color.holo_red_dark);
            showDialog(bottomSheet);
        });
    }
}
