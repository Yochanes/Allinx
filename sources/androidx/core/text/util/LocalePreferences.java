package androidx.core.text.util;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class LocalePreferences {

    /* JADX INFO: renamed from: androidx.core.text.util.LocalePreferences$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C14501 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23337a;

        static {
            int[] iArr = new int[AbstractC0024a.m75A().length];
            f23337a = iArr;
            try {
                AbstractC1451a.m7677b();
                iArr[AbstractC1451a.m7676a()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f23337a;
                AbstractC1451a.m7685j();
                iArr2[AbstractC1451a.m7684i()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f23337a;
                AbstractC1451a.m7688m();
                iArr3[AbstractC1451a.m7687l()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f23337a;
                AbstractC1451a.m7690o();
                iArr4[AbstractC1451a.m7689n()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CalendarType {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface CalendarTypes {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FirstDayOfWeek {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface Days {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class HourCycle {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface HourCycleTypes {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TemperatureUnit {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface TemperatureUnits {
        }
    }
}
