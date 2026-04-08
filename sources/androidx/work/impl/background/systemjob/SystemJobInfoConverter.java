package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.SystemClock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo
class SystemJobInfoConverter {

    /* JADX INFO: renamed from: d */
    public static final String f32877d = Logger.m12101g("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f32878a;

    /* JADX INFO: renamed from: b */
    public final SystemClock f32879b;

    /* JADX INFO: renamed from: c */
    public final boolean f32880c;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C22831 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32881a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f32881a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32881a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32881a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32881a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32881a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SystemJobInfoConverter(Context context, SystemClock systemClock, boolean z2) {
        this.f32879b = systemClock;
        this.f32878a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f32880c = z2;
    }
}
