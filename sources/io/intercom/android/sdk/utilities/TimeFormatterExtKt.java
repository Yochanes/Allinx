package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import androidx.appcompat.app.AbstractC0083c;
import com.google.common.p027io.AbstractC4465b;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.models.AttributeType;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0016"}, m18302d2 = {"formattedDateFromLong", "", "", "context", "Landroid/content/Context;", "formattedDateForDayDivider", "toISOFormat", "toISOFormatApi26", "toISOFormatPreApi26", "toHourOfDay", "toHourOfDayApi26", "zoneId", "Ljava/time/ZoneId;", "toHourOfDayPreApi26", "timeZone", "Ljava/util/TimeZone;", "getFormattedTime", AttributeType.DATE, "Ljava/util/Date;", "getDifferenceInMinutes", "getDifferenceInHours", "getDifferenceInDays", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TimeFormatterExtKt {
    @NotNull
    public static final String formattedDateForDayDivider(long j, @NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        if (j <= 0) {
            return "";
        }
        Date date = new Date(j * ((long) 1000));
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String formattedDateFromLong(long j, @NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        return j <= 0 ? "" : getFormattedTime(context, new Date(j * ((long) 1000)));
    }

    private static final long getDifferenceInDays(Date date) {
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInHours(Date date) {
        return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - date.getTime());
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j = differenceInDays / ((long) 7);
        return j > 0 ? Phrase.from(context, C5101R.string.intercom_time_week_ago).put("delta", String.valueOf(j)).format().toString() : differenceInDays > 0 ? Phrase.from(context, C5101R.string.intercom_time_day_ago).put("delta", String.valueOf(differenceInDays)).format().toString() : differenceInHours > 0 ? Phrase.from(context, C5101R.string.intercom_time_hour_ago).put("delta", String.valueOf(differenceInHours)).format().toString() : differenceInMinutes >= 1 ? Phrase.from(context, C5101R.string.intercom_time_minute_ago).put("delta", String.valueOf(differenceInMinutes)).format().toString() : context.getText(C5101R.string.intercom_time_just_now).toString();
    }

    @NotNull
    public static final String toHourOfDay(long j) {
        return Build.VERSION.SDK_INT >= 26 ? toHourOfDayApi26$default(j, null, 1, null) : toHourOfDayPreApi26$default(j, null, 1, null);
    }

    @NotNull
    public static final String toHourOfDayApi26(long j, @NotNull ZoneId zoneId) {
        Intrinsics.m18599g(zoneId, "zoneId");
        ZonedDateTime zonedDateTimeM15024t = AbstractC4465b.m15024t(AbstractC0083c.m379k(j * ((long) 1000)), zoneId);
        Locale locale = Locale.ENGLISH;
        String strM16778l = AbstractC5852a.m16778l(AbstractC4465b.m15003C(), AbstractC4465b.m15026v(zonedDateTimeM15024t));
        if (AbstractC5852a.m16767a(zonedDateTimeM15024t) == 0) {
            Intrinsics.m18596d(strM16778l);
            return StringsKt.m20411I(strM16778l, "12:00", "00:00");
        }
        Intrinsics.m18596d(strM16778l);
        return strM16778l;
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = AbstractC5852a.m16788v();
        }
        return toHourOfDayApi26(j, zoneId);
    }

    @NotNull
    public static final String toHourOfDayPreApi26(long j, @NotNull TimeZone timeZone) {
        Intrinsics.m18599g(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        long j2 = j * ((long) 1000);
        String str = simpleDateFormat.format(Long.valueOf(j2));
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        if (calendar.get(11) == 0) {
            Intrinsics.m18596d(str);
            return StringsKt.m20411I(str, "12:00", "00:00");
        }
        Intrinsics.m18596d(str);
        return str;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j, timeZone);
    }

    @NotNull
    public static final String toISOFormat(long j) {
        return Build.VERSION.SDK_INT >= 26 ? toISOFormatApi26(j) : toISOFormatPreApi26(j);
    }

    @NotNull
    public static final String toISOFormatApi26(long j) {
        Instant instantM379k = AbstractC0083c.m379k(j * ((long) 1000));
        AbstractC5852a.m16789w();
        String strM16779m = AbstractC5852a.m16779m(AbstractC4465b.m15026v(instantM379k));
        Intrinsics.m18598f(strM16779m, "format(...)");
        return strM16779m;
    }

    @NotNull
    public static final String toISOFormatPreApi26(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(j * ((long) 1000)));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }
}
