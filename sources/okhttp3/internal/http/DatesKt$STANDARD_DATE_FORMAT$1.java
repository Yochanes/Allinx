package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DatesKt$STANDARD_DATE_FORMAT$1 extends ThreadLocal<DateFormat> {
    @Override // java.lang.ThreadLocal
    public final DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(Util.f57278e);
        return simpleDateFormat;
    }
}
