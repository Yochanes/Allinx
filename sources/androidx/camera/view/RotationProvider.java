package androidx.camera.view;

import android.view.OrientationEventListener;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class RotationProvider {

    /* JADX INFO: renamed from: androidx.camera.view.RotationProvider$1 */
    /* JADX INFO: compiled from: Proguard */
    class C04041 extends OrientationEventListener {

        /* JADX INFO: renamed from: a */
        public int f3558a;

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            if (i == -1) {
                return;
            }
            int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
            if (this.f3558a == i2) {
                return;
            }
            this.f3558a = i2;
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ListenerWrapper {
    }
}
