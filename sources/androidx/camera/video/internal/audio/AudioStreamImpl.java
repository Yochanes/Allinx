package androidx.camera.video.internal.audio;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.compat.Api24Impl;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class AudioStreamImpl implements AudioStream {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        @Override // android.media.AudioManager.AudioRecordingCallback
        public final void onRecordingConfigChanged(List list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Api24Impl.m1862a((AudioRecordingConfiguration) it.next());
                throw null;
            }
        }
    }
}
