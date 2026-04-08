package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.android.AbstractC1330c;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@UnstableApi
public final class LoudnessCodecController {

    /* JADX INFO: renamed from: a */
    public final HashSet f26941a;

    /* JADX INFO: renamed from: b */
    public final C1846d f26942b;

    /* JADX INFO: renamed from: c */
    public android.media.LoudnessCodecController f26943c;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.LoudnessCodecController$1 */
    /* JADX INFO: compiled from: Proguard */
    class C18391 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public C18391() {
        }

        public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            LoudnessCodecController.this.f26942b.getClass();
            return bundle;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface LoudnessParameterUpdateListener {

        /* JADX INFO: renamed from: a */
        public static final C1846d f26945a = new C1846d();
    }

    public LoudnessCodecController() {
        C1846d c1846d = LoudnessParameterUpdateListener.f26945a;
        this.f26941a = new HashSet();
        this.f26942b = c1846d;
    }

    /* JADX INFO: renamed from: a */
    public final void m10371a(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.f26941a.remove(mediaCodec) || (loudnessCodecController = this.f26943c) == null) {
            return;
        }
        AbstractC1330c.m6481e(loudnessCodecController, mediaCodec);
    }

    /* JADX INFO: renamed from: b */
    public final void m10372b(int i) {
        android.media.LoudnessCodecController loudnessCodecController = this.f26943c;
        if (loudnessCodecController != null) {
            AbstractC1330c.m6480d(loudnessCodecController);
            this.f26943c = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerM6477a = AbstractC1330c.m6477a(i, MoreExecutors.directExecutor(), new C18391());
        this.f26943c = loudnessCodecControllerM6477a;
        Iterator it = this.f26941a.iterator();
        while (it.hasNext()) {
            if (!AbstractC1330c.m6485i(loudnessCodecControllerM6477a, (MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
