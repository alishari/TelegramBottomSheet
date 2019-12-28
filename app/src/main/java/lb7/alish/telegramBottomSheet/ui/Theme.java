package lb7.alish.telegramBottomSheet.ui;

public class Theme {
    public static final String key_dialogTextBlack = "key_dialogTextBlack";
    public static int key_itemText_color = 0xff000000;
    public static final String key_dialogBackground = "key_dialogBackground";
    public static int key_dialogBackground_color = 0xffffffff;
    public static final String key_dialogTextGray2 = "key_dialogTextGray2";
    public static int key_titleText_color = 0xff00f000;
    public static final String key_dialogIcon = "key_dialogIcon";
    public static int key_itemIcon_color = 0xff0000f0;

    public static int getColor(String key) {
        if (key == null) {
            return 0xff000000;
        }
        switch (key) {
            case key_dialogTextBlack:
                return key_itemText_color;
            case key_dialogBackground:
                return key_dialogBackground_color;
            case key_dialogTextGray2:
                return key_titleText_color;
            case key_dialogIcon:
                return key_itemIcon_color;
        }
        return 0xff000000;
    }
}
