package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C1724C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultDrmSessionManager implements DrmSessionManager {

    /* JADX INFO: renamed from: b */
    public int f26802b;

    /* JADX INFO: renamed from: c */
    public ExoMediaDrm f26803c;

    /* JADX INFO: renamed from: d */
    public DefaultDrmSession f26804d;

    /* JADX INFO: renamed from: e */
    public DefaultDrmSession f26805e;

    /* JADX INFO: renamed from: f */
    public Looper f26806f;

    /* JADX INFO: renamed from: g */
    public Handler f26807g;

    /* JADX INFO: renamed from: h */
    public PlayerId f26808h;

    /* JADX INFO: renamed from: i */
    public volatile MediaDrmHandler f26809i;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        public Builder() {
            new HashMap();
            UUID uuid = C1724C.f25102d;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        public MediaDrmEventListener() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SuppressLint({"HandlerLeak"})
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (((byte[]) message.obj) == null) {
                return;
            }
            DefaultDrmSessionManager.this.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MissingSchemeDataException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* JADX INFO: compiled from: Proguard */
    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {

        /* JADX INFO: renamed from: a */
        public final DrmSessionEventListener.EventDispatcher f26812a;

        /* JADX INFO: renamed from: b */
        public DrmSession f26813b;

        /* JADX INFO: renamed from: c */
        public boolean f26814c;

        public PreacquiredSessionReference(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.f26812a = eventDispatcher;
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f26807g;
            handler.getClass();
            Util.m9601K(handler, new RunnableC1822a(this, 0));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {

        /* JADX INFO: renamed from: a */
        public DefaultDrmSession f26816a;

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        /* JADX INFO: renamed from: a */
        public final void mo10296a(Exception exc, boolean z2) {
            this.f26816a = null;
            ImmutableList.copyOf((Collection) null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        /* JADX INFO: renamed from: b */
        public final void mo10297b() {
            this.f26816a = null;
            ImmutableList.copyOf((Collection) null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        /* JADX INFO: renamed from: c */
        public final void mo10298c(DefaultDrmSession defaultDrmSession) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        /* JADX INFO: renamed from: a */
        public final void mo10299a(DefaultDrmSession defaultDrmSession) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        /* JADX INFO: renamed from: b */
        public final void mo10300b(DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1) {
                throw null;
            }
            if (i != 0) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10301g(DrmSession drmSession) {
        DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
        defaultDrmSession.m10295l();
        if (defaultDrmSession.f26785o != 1) {
            return false;
        }
        DrmSession.DrmSessionException error = defaultDrmSession.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || DrmUtil.m10320c(cause);
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m10302h(DrmInitData drmInitData, UUID uuid, boolean z2) {
        ArrayList arrayList = new ArrayList(drmInitData.f25124d);
        for (int i = 0; i < drmInitData.f25124d; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.f25121a[i];
            if ((schemeData.m9241a(uuid) || (C1724C.f25101c.equals(uuid) && schemeData.m9241a(C1724C.f25100b))) && (schemeData.f25129f != null || z2)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    /* JADX INFO: renamed from: a */
    public final void mo10303a(Looper looper, PlayerId playerId) {
        synchronized (this) {
            try {
                Looper looper2 = this.f26806f;
                if (looper2 == null) {
                    this.f26806f = looper;
                    this.f26807g = new Handler(looper);
                } else {
                    Assertions.m9464e(looper2 == looper);
                    this.f26807g.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f26808h = playerId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    /* JADX INFO: renamed from: b */
    public final DrmSession mo10304b(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        m10309i(false);
        Assertions.m9464e(this.f26802b > 0);
        Assertions.m9466g(this.f26806f);
        return m10308f(this.f26806f, eventDispatcher, format, true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    /* JADX INFO: renamed from: c */
    public final void mo10305c() {
        m10309i(true);
        int i = this.f26802b;
        this.f26802b = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f26803c == null) {
            throw null;
        }
        if (0 != -9223372036854775807L) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    /* JADX INFO: renamed from: d */
    public final int mo10306d(Format format) {
        String str;
        m10309i(false);
        ExoMediaDrm exoMediaDrm = this.f26803c;
        exoMediaDrm.getClass();
        int iMo10331l = exoMediaDrm.mo10331l();
        DrmInitData drmInitData = format.f25165r;
        if (drmInitData == null) {
            MimeTypes.m9337h(format.f25161n);
            throw null;
        }
        if (!m10302h(drmInitData, null, true).isEmpty()) {
            str = drmInitData.f25123c;
            if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : Util.f25665a >= 25)) {
                return iMo10331l;
            }
        } else if (drmInitData.f25124d == 1 && drmInitData.f25121a[0].m9241a(C1724C.f25100b)) {
            Log.m9511g("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + ((Object) null));
            str = drmInitData.f25123c;
            if (str != null) {
            }
            return iMo10331l;
        }
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    /* JADX INFO: renamed from: e */
    public final DrmSessionManager.DrmSessionReference mo10307e(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.m9464e(this.f26802b > 0);
        Assertions.m9466g(this.f26806f);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(eventDispatcher);
        Handler handler = this.f26807g;
        handler.getClass();
        handler.post(new RunnableC1823b(3, preacquiredSessionReference, format));
        return preacquiredSessionReference;
    }

    /* JADX INFO: renamed from: f */
    public final DrmSession m10308f(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z2) {
        if (this.f26809i == null) {
            this.f26809i = new MediaDrmHandler(looper);
        }
        DrmInitData drmInitData = format.f25165r;
        if (drmInitData == null) {
            MimeTypes.m9337h(format.f25161n);
            ExoMediaDrm exoMediaDrm = this.f26803c;
            exoMediaDrm.getClass();
            if (exoMediaDrm.mo10331l() == 2 && FrameworkCryptoConfig.f26832c) {
                return null;
            }
            throw null;
        }
        ArrayList arrayListM10302h = m10302h(drmInitData, null, false);
        if (arrayListM10302h.isEmpty()) {
            MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException("Media does not support uuid: " + ((Object) null));
            Log.m9508d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
            if (eventDispatcher != null) {
                eventDispatcher.m10315e(missingSchemeDataException);
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(6003, missingSchemeDataException));
        }
        DefaultDrmSession defaultDrmSession = this.f26805e;
        if (defaultDrmSession != null) {
            defaultDrmSession.mo10285a(eventDispatcher);
            return defaultDrmSession;
        }
        this.f26803c.getClass();
        ExoMediaDrm exoMediaDrm2 = this.f26803c;
        Looper looper2 = this.f26806f;
        looper2.getClass();
        PlayerId playerId = this.f26808h;
        playerId.getClass();
        DefaultDrmSession defaultDrmSession2 = new DefaultDrmSession(null, exoMediaDrm2, null, null, arrayListM10302h, false | false, false, null, null, null, looper2, null, playerId);
        defaultDrmSession2.mo10285a(eventDispatcher);
        if (0 != -9223372036854775807L) {
            defaultDrmSession2.mo10285a(null);
        }
        if (m10301g(defaultDrmSession2)) {
            throw null;
        }
        if (m10301g(defaultDrmSession2) && z2) {
            throw null;
        }
        this.f26805e = defaultDrmSession2;
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final void m10309i(boolean z2) {
        if (z2 && this.f26806f == null) {
            Log.m9512h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f26806f;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            Log.m9512h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f26806f.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        m10309i(true);
        int i = this.f26802b - 1;
        this.f26802b = i;
        if (i != 0) {
            return;
        }
        if (0 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList((Collection) null);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).mo10288d(null);
            }
        }
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) null).iterator();
        while (it.hasNext()) {
            ((PreacquiredSessionReference) it.next()).release();
        }
        if (this.f26803c != null && this.f26802b == 0) {
            throw null;
        }
    }
}
