package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class Api19Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class GnssListenersHolder {
        static {
            new SimpleArrayMap(0);
            new SimpleArrayMap(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class GnssStatusTransport extends GnssStatus.Callback {
        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i) {
            throw null;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            new GnssStatusWrapper(gnssStatus);
            throw null;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            throw null;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InlineHandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Looper.myLooper();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LocationListenerKey {
        public final boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            ((LocationListenerKey) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Objects.hash(null, null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LocationListenerTransport implements LocationListener {
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(List list) {
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    static {
        new WeakHashMap();
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class PreRGnssStatusTransport extends GnssStatus.Callback {
        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i) {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CancellableLocationListener implements LocationListener {
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            synchronized (this) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onStatusChanged(int i) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class GpsStatusTransport implements GpsStatus.Listener {
        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int i) {
        }
    }
}
