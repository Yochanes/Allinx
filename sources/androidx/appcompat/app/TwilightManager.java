package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class TwilightManager {

    /* JADX INFO: renamed from: d */
    public static TwilightManager f533d;

    /* JADX INFO: renamed from: a */
    public final Context f534a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f535b;

    /* JADX INFO: renamed from: c */
    public final TwilightState f536c = new TwilightState();

    /* JADX INFO: compiled from: Proguard */
    public static class TwilightState {

        /* JADX INFO: renamed from: a */
        public boolean f537a;

        /* JADX INFO: renamed from: b */
        public long f538b;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.f534a = context;
        this.f535b = locationManager;
    }
}
