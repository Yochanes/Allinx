package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioFocusRequestCompat;

/* JADX INFO: renamed from: androidx.media3.common.audio.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1742a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat f25497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f25498b;

    public /* synthetic */ RunnableC1742a(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat, int i) {
        this.f25497a = onAudioFocusChangeListenerHandlerCompat;
        this.f25498b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25497a.f25439b.onAudioFocusChange(this.f25498b);
    }
}
