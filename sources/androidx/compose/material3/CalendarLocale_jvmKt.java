package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"Ljava/util/Locale;", "CalendarLocale", "material3_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CalendarLocale_jvmKt {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f12348a = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static String m3894a(int i, int i2) {
        int i3 = (i2 & 1) == 0 ? 2 : 1;
        String str = i3 + ".40.false." + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap = f12348a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i3);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i));
    }
}
