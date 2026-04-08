package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okhttp"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DatesKt {

    /* JADX INFO: renamed from: a */
    public static final DatesKt$STANDARD_DATE_FORMAT$1 f57469a = new DatesKt$STANDARD_DATE_FORMAT$1();

    /* JADX INFO: renamed from: b */
    public static final String[] f57470b;

    /* JADX INFO: renamed from: c */
    public static final DateFormat[] f57471c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f57470b = strArr;
        f57471c = new DateFormat[strArr.length];
    }

    /* JADX INFO: renamed from: a */
    public static final Date m21418a(String str) {
        Intrinsics.m18599g(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f57469a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f57470b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = f57471c;
                    DateFormat simpleDateFormat = dateFormatArr[i];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f57470b[i], Locale.US);
                        simpleDateFormat.setTimeZone(Util.f57278e);
                        dateFormatArr[i] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
