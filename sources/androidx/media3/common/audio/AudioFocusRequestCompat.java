package androidx.media3.common.audio;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioFocusRequestCompat {

    /* JADX INFO: renamed from: a */
    public final int f25429a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f25430b;

    /* JADX INFO: renamed from: c */
    public final Handler f25431c;

    /* JADX INFO: renamed from: d */
    public final AudioAttributes f25432d;

    /* JADX INFO: renamed from: e */
    public final boolean f25433e;

    /* JADX INFO: renamed from: f */
    public final Object f25434f;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public int f25435a;

        /* JADX INFO: renamed from: b */
        public AudioAttributes f25436b;

        /* JADX INFO: renamed from: c */
        public boolean f25437c;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OnAudioFocusChangeListenerHandlerCompat implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final Handler f25438a;

        /* JADX INFO: renamed from: b */
        public final AudioManager.OnAudioFocusChangeListener f25439b;

        public OnAudioFocusChangeListenerHandlerCompat(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f25439b = onAudioFocusChangeListener;
            Looper looper = handler.getLooper();
            int i = Util.f25665a;
            this.f25438a = new Handler(looper, null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            Util.m9601K(this.f25438a, new RunnableC1742a(this, i));
        }
    }

    public AudioFocusRequestCompat(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributes audioAttributes, boolean z2) {
        this.f25429a = i;
        this.f25431c = handler;
        this.f25432d = audioAttributes;
        this.f25433e = z2;
        int i2 = Util.f25665a;
        if (i2 < 26) {
            this.f25430b = new OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.f25430b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f25434f = AbstractC1329b.m6460j(AbstractC1329b.m6458h(AbstractC1329b.m6459i(AbstractC1329b.m6457g(AbstractC1329b.m6456f(i), audioAttributes.m9212a().f25097a), z2), onAudioFocusChangeListener, handler));
        } else {
            this.f25434f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusRequestCompat)) {
            return false;
        }
        AudioFocusRequestCompat audioFocusRequestCompat = (AudioFocusRequestCompat) obj;
        return this.f25429a == audioFocusRequestCompat.f25429a && this.f25433e == audioFocusRequestCompat.f25433e && Objects.equals(this.f25430b, audioFocusRequestCompat.f25430b) && Objects.equals(this.f25431c, audioFocusRequestCompat.f25431c) && Objects.equals(this.f25432d, audioFocusRequestCompat.f25432d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f25429a), this.f25430b, this.f25431c, this.f25432d, Boolean.valueOf(this.f25433e));
    }
}
