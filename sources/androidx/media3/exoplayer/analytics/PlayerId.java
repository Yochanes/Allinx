package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlayerId {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f26445d = 0;

    /* JADX INFO: renamed from: a */
    public final String f26446a;

    /* JADX INFO: renamed from: b */
    public final LogSessionIdApi31 f26447b;

    /* JADX INFO: renamed from: c */
    public final Object f26448c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class LogSessionIdApi31 {

        /* JADX INFO: renamed from: a */
        public LogSessionId f26449a;
    }

    static {
        new PlayerId("");
    }

    public PlayerId(String str) {
        LogSessionIdApi31 logSessionIdApi31;
        this.f26446a = str;
        if (Util.f25665a >= 31) {
            logSessionIdApi31 = new LogSessionIdApi31();
            logSessionIdApi31.f26449a = AbstractC1797o.m10187h();
        } else {
            logSessionIdApi31 = null;
        }
        this.f26447b = logSessionIdApi31;
        this.f26448c = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized LogSessionId m10144a() {
        LogSessionIdApi31 logSessionIdApi31;
        logSessionIdApi31 = this.f26447b;
        logSessionIdApi31.getClass();
        return logSessionIdApi31.f26449a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m10145b(LogSessionId logSessionId) {
        LogSessionIdApi31 logSessionIdApi31 = this.f26447b;
        logSessionIdApi31.getClass();
        LogSessionId logSessionId2 = logSessionIdApi31.f26449a;
        AbstractC1797o.m10187h();
        Assertions.m9464e(AbstractC1797o.m10200u(logSessionId2));
        logSessionIdApi31.f26449a = logSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerId)) {
            return false;
        }
        PlayerId playerId = (PlayerId) obj;
        return Objects.equals(this.f26446a, playerId.f26446a) && Objects.equals(this.f26447b, playerId.f26447b) && Objects.equals(this.f26448c, playerId.f26448c);
    }

    public final int hashCode() {
        return Objects.hash(this.f26446a, this.f26447b, this.f26448c);
    }
}
