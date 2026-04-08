package io.intercom.android.sdk.utilities;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TimeFormatter {
    private SimpleDateFormat absoluteDateFormatter;
    private SimpleDateFormat absoluteTimeFormatter;
    private final Context context;
    private final TimeProvider timeProvider;

    public TimeFormatter(Context context, TimeProvider timeProvider) {
        this.context = context;
        this.timeProvider = timeProvider;
    }

    public static String formatFromUtcTime(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(11, i);
        calendar.set(12, i2);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(time);
    }

    public static String formatTimeForTickets(long j, Context context) {
        Phrase phrasePut;
        Date date = new Date(j * 1000);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(System.currentTimeMillis() - date.getTime());
        long hours = timeUnit.toHours(System.currentTimeMillis() - date.getTime());
        long days = timeUnit.toDays(System.currentTimeMillis() - date.getTime());
        long j2 = days / 7;
        if (j2 > 0) {
            phrasePut = Phrase.from(context, C5101R.string.intercom_time_week_ago).put("delta", Long.toString(j2));
        } else if (days > 0) {
            phrasePut = Phrase.from(context, C5101R.string.intercom_time_day_ago).put("delta", Long.toString(days));
        } else if (hours > 0) {
            phrasePut = Phrase.from(context, C5101R.string.intercom_time_hour_ago).put("delta", Long.toString(hours));
        } else {
            if (minutes < 1) {
                return context.getString(C5101R.string.intercom_time_just_now);
            }
            phrasePut = Phrase.from(context, C5101R.string.intercom_time_minute_ago).put("delta", Long.toString(minutes));
        }
        return phrasePut.format().toString();
    }

    public static String formatTimeInMillisAsDate(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static String formatToUtcTime(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(time);
    }

    private Date getDateFromTimeStamp(long j) {
        return new Date(j * 1000);
    }

    private long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(this.timeProvider.currentTimeMillis() - date.getTime());
    }

    public static int getHour(long j) {
        return new Date(j).getHours();
    }

    public static int getMinute(long j) {
        return new Date(j).getMinutes();
    }

    public CharSequence getAdminActiveStatus(LastParticipatingAdmin lastParticipatingAdmin, Provider<AppConfig> provider) {
        return shouldShowActiveOrAwayState(provider.get().getLocale()) ? lastParticipatingAdmin.isActive() ? this.context.getString(C5101R.string.intercom_active_state) : this.context.getString(C5101R.string.intercom_away_state) : lastParticipatingAdmin.getLastActiveAt() <= 0 ? "" : getAdminActiveStatus(getDateFromTimeStamp(lastParticipatingAdmin.getLastActiveAt()));
    }

    @VisibleForTesting
    public boolean shouldShowActiveOrAwayState(String str) {
        return str.equals("en");
    }

    private CharSequence getAdminActiveStatus(Date date) {
        Phrase phrasePut;
        long differenceInMinutes = getDifferenceInMinutes(date);
        if (differenceInMinutes > TimeUnit.DAYS.toMinutes(6L)) {
            return this.context.getText(C5101R.string.intercom_active_week_ago);
        }
        if (differenceInMinutes >= TimeUnit.HOURS.toMinutes(23L) + 31) {
            phrasePut = Phrase.from(this.context, C5101R.string.intercom_active_day_ago).put("days", Long.toString((((differenceInMinutes / 60) - 13) / 24) + 1));
        } else if (differenceInMinutes >= 53) {
            phrasePut = Phrase.from(this.context, C5101R.string.intercom_active_hour_ago).put("hours", Long.toString(((differenceInMinutes - 31) / 60) + 1));
        } else {
            phrasePut = differenceInMinutes >= 38 ? Phrase.from(this.context, C5101R.string.intercom_active_minute_ago).put("minutes", Long.toString(45L)) : differenceInMinutes >= 16 ? Phrase.from(this.context, C5101R.string.intercom_active_minute_ago).put("minutes", Long.toString(30L)) : Phrase.from(this.context, C5101R.string.intercom_active_15m_ago).put("minutes", Long.toString(15L));
        }
        return phrasePut.format();
    }
}
