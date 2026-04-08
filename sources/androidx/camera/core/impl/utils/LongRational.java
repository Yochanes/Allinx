package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class LongRational {

    /* JADX INFO: renamed from: a */
    public final long f2893a;

    /* JADX INFO: renamed from: b */
    public final long f2894b;

    public LongRational(long j, long j2) {
        this.f2893a = j;
        this.f2894b = j2;
    }

    public final String toString() {
        return this.f2893a + RemoteSettings.FORWARD_SLASH_STRING + this.f2894b;
    }
}
