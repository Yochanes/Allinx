package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextContextMenuItems {

    /* JADX INFO: renamed from: b */
    public static final TextContextMenuItems f8582b;

    /* JADX INFO: renamed from: c */
    public static final TextContextMenuItems f8583c;

    /* JADX INFO: renamed from: d */
    public static final TextContextMenuItems f8584d;

    /* JADX INFO: renamed from: f */
    public static final TextContextMenuItems f8585f;

    /* JADX INFO: renamed from: g */
    public static final TextContextMenuItems f8586g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ TextContextMenuItems[] f8587i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumEntries f8588j;

    /* JADX INFO: renamed from: a */
    public final int f8589a;

    static {
        TextContextMenuItems textContextMenuItems = new TextContextMenuItems("Cut", 0, R.string.cut);
        f8582b = textContextMenuItems;
        TextContextMenuItems textContextMenuItems2 = new TextContextMenuItems("Copy", 1, R.string.copy);
        f8583c = textContextMenuItems2;
        TextContextMenuItems textContextMenuItems3 = new TextContextMenuItems("Paste", 2, R.string.paste);
        f8584d = textContextMenuItems3;
        TextContextMenuItems textContextMenuItems4 = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);
        f8585f = textContextMenuItems4;
        TextContextMenuItems textContextMenuItems5 = new TextContextMenuItems("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? com.exchange.allin.R.string.autofill : R.string.autofill);
        f8586g = textContextMenuItems5;
        TextContextMenuItems[] textContextMenuItemsArr = {textContextMenuItems, textContextMenuItems2, textContextMenuItems3, textContextMenuItems4, textContextMenuItems5};
        f8587i = textContextMenuItemsArr;
        f8588j = EnumEntriesKt.m18563a(textContextMenuItemsArr);
    }

    public TextContextMenuItems(String str, int i, int i2) {
        this.f8589a = i2;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) f8587i.clone();
    }
}
