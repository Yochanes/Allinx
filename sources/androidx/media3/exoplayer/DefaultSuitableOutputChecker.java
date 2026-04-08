package androidx.media3.exoplayer;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AbstractC1740a;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {

    /* JADX INFO: renamed from: a */
    public final SuitableOutputChecker f26045a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class ImplApi23 implements SuitableOutputChecker {

        /* JADX INFO: renamed from: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$1 */
        /* JADX INFO: compiled from: Proguard */
        class C17721 extends AudioDeviceCallback {
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                throw null;
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class ImplApi35 implements SuitableOutputChecker {

        /* JADX INFO: renamed from: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$1 */
        /* JADX INFO: compiled from: Proguard */
        class C17731 extends MediaRouter2$RouteCallback {
        }

        /* JADX INFO: renamed from: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$2 */
        /* JADX INFO: compiled from: Proguard */
        class C17742 extends MediaRouter2$ControllerCallback {
            public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                throw null;
            }
        }

        static {
            AbstractC1740a.m9425v();
            AbstractC1740a.m9420q(AbstractC1740a.m9419p(ImmutableList.m14824of()));
        }
    }

    public DefaultSuitableOutputChecker() {
        int i = Util.f25665a;
        if (i >= 35) {
            this.f26045a = new ImplApi35();
        } else if (i >= 23) {
            this.f26045a = new ImplApi23();
        } else {
            this.f26045a = null;
        }
    }
}
