package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.constraintlayout.motion.widget.RunnableC1407a;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioManagerCompat {

    /* JADX INFO: renamed from: a */
    public static AudioManager f25440a;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized AudioManager m9430a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f25440a = null;
            }
            AudioManager audioManager = f25440a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                ConditionVariable conditionVariable = new ConditionVariable();
                BackgroundExecutor.m9467a().execute(new RunnableC1407a(3, applicationContext, conditionVariable));
                conditionVariable.m9475c();
                AudioManager audioManager2 = f25440a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f25440a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }
}
