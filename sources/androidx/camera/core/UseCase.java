package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class UseCase {

    /* JADX INFO: renamed from: d */
    public UseCaseConfig f2387d;

    /* JADX INFO: renamed from: e */
    public final Object f2388e;

    /* JADX INFO: renamed from: f */
    public UseCaseConfig f2389f;

    /* JADX INFO: renamed from: g */
    public StreamSpec f2390g;

    /* JADX INFO: renamed from: h */
    public UseCaseConfig f2391h;

    /* JADX INFO: renamed from: i */
    public Rect f2392i;

    /* JADX INFO: renamed from: k */
    public CameraInternal f2394k;

    /* JADX INFO: renamed from: l */
    public CameraEffect f2395l;

    /* JADX INFO: renamed from: a */
    public final HashSet f2384a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Object f2385b = new Object();

    /* JADX INFO: renamed from: c */
    public State f2386c = State.f2399b;

    /* JADX INFO: renamed from: j */
    public Matrix f2393j = new Matrix();

    /* JADX INFO: renamed from: m */
    public SessionConfig f2396m = SessionConfig.m1518a();

    /* JADX INFO: renamed from: androidx.camera.core.UseCase$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C02411 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2397a;

        static {
            int[] iArr = new int[State.values().length];
            f2397a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2397a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface EventCallback {
        /* JADX INFO: renamed from: a */
        void m1329a();

        /* JADX INFO: renamed from: b */
        void m1330b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f2398a;

        /* JADX INFO: renamed from: b */
        public static final State f2399b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ State[] f2400c;

        static {
            State state = new State("ACTIVE", 0);
            f2398a = state;
            State state2 = new State("INACTIVE", 1);
            f2399b = state2;
            f2400c = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f2400c.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface StateChangeCallback {
        /* JADX INFO: renamed from: a */
        void mo918a(UseCase useCase);

        /* JADX INFO: renamed from: e */
        void mo919e(UseCase useCase);

        /* JADX INFO: renamed from: i */
        void mo923i(UseCase useCase);
    }

    public UseCase(UseCaseConfig useCaseConfig) {
        this.f2388e = useCaseConfig;
        this.f2389f = useCaseConfig;
    }

    /* JADX INFO: renamed from: A */
    public void mo1235A(Rect rect) {
        this.f2392i = rect;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.camera.core.impl.UseCaseConfig, java.lang.Object] */
    /* JADX INFO: renamed from: B */
    public final void m1313B(CameraInternal cameraInternal) {
        mo1245y();
        EventCallback eventCallbackM1660k = this.f2389f.m1660k();
        if (eventCallbackM1660k != null) {
            eventCallbackM1660k.m1329a();
        }
        synchronized (this.f2385b) {
            Preconditions.m7694a(cameraInternal == this.f2394k);
            this.f2384a.remove(this.f2394k);
            this.f2394k = null;
        }
        this.f2390g = null;
        this.f2392i = null;
        this.f2389f = this.f2388e;
        this.f2387d = null;
        this.f2391h = null;
    }

    /* JADX INFO: renamed from: C */
    public final void m1314C(SessionConfig sessionConfig) {
        this.f2396m = sessionConfig;
        for (DeferrableSurface deferrableSurface : sessionConfig.m1519b()) {
            if (deferrableSurface.f2703j == null) {
                deferrableSurface.f2703j = getClass();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1315a(CameraInternal cameraInternal, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        synchronized (this.f2385b) {
            this.f2394k = cameraInternal;
            this.f2384a.add(cameraInternal);
        }
        this.f2387d = useCaseConfig;
        this.f2391h = useCaseConfig2;
        UseCaseConfig useCaseConfigM1324n = m1324n(cameraInternal.mo930q(), this.f2387d, this.f2391h);
        this.f2389f = useCaseConfigM1324n;
        EventCallback eventCallbackM1660k = useCaseConfigM1324n.m1660k();
        if (eventCallbackM1660k != null) {
            cameraInternal.mo930q();
            eventCallbackM1660k.m1330b();
        }
        mo1241r();
    }

    /* JADX INFO: renamed from: b */
    public final CameraInternal m1316b() {
        CameraInternal cameraInternal;
        synchronized (this.f2385b) {
            cameraInternal = this.f2394k;
        }
        return cameraInternal;
    }

    /* JADX INFO: renamed from: c */
    public final CameraControlInternal m1317c() {
        synchronized (this.f2385b) {
            try {
                CameraInternal cameraInternal = this.f2394k;
                if (cameraInternal == null) {
                    return CameraControlInternal.f2641a;
                }
                return cameraInternal.mo922h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m1318d() {
        CameraInternal cameraInternalM1316b = m1316b();
        Preconditions.m7698e(cameraInternalM1316b, "No camera attached to use case: " + this);
        return cameraInternalM1316b.mo930q().mo945c();
    }

    /* JADX INFO: renamed from: e */
    public abstract UseCaseConfig mo1239e(boolean z2, UseCaseConfigFactory useCaseConfigFactory);

    /* JADX INFO: renamed from: f */
    public final String m1319f() {
        String strM1659y = this.f2389f.m1659y("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strM1659y);
        return strM1659y;
    }

    /* JADX INFO: renamed from: g */
    public int mo1298g(CameraInternal cameraInternal, boolean z2) {
        int iMo952k = cameraInternal.mo930q().mo952k(((ImageOutputConfig) this.f2389f).m1494C());
        if (cameraInternal.mo1445p() || !z2) {
            return iMo952k;
        }
        RectF rectF = TransformUtils.f2896a;
        return (((-iMo952k) % 360) + 360) % 360;
    }

    /* JADX INFO: renamed from: h */
    public final ResolutionInfo m1320h() {
        CameraInternal cameraInternalM1316b = m1316b();
        StreamSpec streamSpec = this.f2390g;
        Size sizeMo1420e = streamSpec != null ? streamSpec.mo1420e() : null;
        if (cameraInternalM1316b == null || sizeMo1420e == null) {
            return null;
        }
        Rect rect = this.f2392i;
        if (rect == null) {
            rect = new Rect(0, 0, sizeMo1420e.getWidth(), sizeMo1420e.getHeight());
        }
        return new ResolutionInfo(sizeMo1420e, rect, mo1298g(cameraInternalM1316b, false));
    }

    /* JADX INFO: renamed from: i */
    public Set mo1263i() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: j */
    public abstract UseCaseConfig.Builder mo1240j(Config config);

    /* JADX INFO: renamed from: k */
    public final boolean m1321k(String str) {
        if (m1316b() == null) {
            return false;
        }
        return Objects.equals(str, m1318d());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1322l(int i) {
        Iterator it = mo1263i().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1323m(CameraInternal cameraInternal) {
        int iM1502q = ((ImageOutputConfig) this.f2389f).m1502q();
        if (iM1502q == 0) {
            return false;
        }
        if (iM1502q == 1) {
            return true;
        }
        if (iM1502q == 2) {
            return cameraInternal.m1444d();
        }
        throw new AssertionError(AbstractC0000a.m9f(iM1502q, "Unknown mirrorMode: "));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.camera.core.impl.Config, androidx.camera.core.impl.ReadableConfig, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public final UseCaseConfig m1324n(CameraInfoInternal cameraInfoInternal, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        MutableOptionsBundle mutableOptionsBundleM1507T;
        if (useCaseConfig2 != null) {
            mutableOptionsBundleM1507T = MutableOptionsBundle.m1508U(useCaseConfig2);
            mutableOptionsBundleM1507T.f2751F.remove(TargetConfig.f2992B);
        } else {
            mutableOptionsBundleM1507T = MutableOptionsBundle.m1507T();
        }
        Config.Option option = ImageOutputConfig.f2730g;
        ?? r1 = this.f2388e;
        boolean zMo1465c = r1.mo1465c(option);
        TreeMap treeMap = mutableOptionsBundleM1507T.f2751F;
        if (zMo1465c || r1.mo1465c(ImageOutputConfig.f2734k)) {
            Config.Option option2 = ImageOutputConfig.f2738o;
            if (treeMap.containsKey(option2)) {
                treeMap.remove(option2);
            }
        }
        Config.Option option3 = ImageOutputConfig.f2738o;
        if (r1.mo1465c(option3)) {
            Config.Option option4 = ImageOutputConfig.f2736m;
            if (treeMap.containsKey(option4) && ((ResolutionSelector) r1.mo1464a(option3)).f3179b != null) {
                treeMap.remove(option4);
            }
        }
        Iterator it = r1.mo1467e().iterator();
        while (it.hasNext()) {
            Config.m1463Q(mutableOptionsBundleM1507T, mutableOptionsBundleM1507T, r1, (Config.Option) it.next());
        }
        if (useCaseConfig != null) {
            for (Config.Option option5 : useCaseConfig.mo1467e()) {
                if (!option5.mo1384c().equals(TargetConfig.f2992B.mo1384c())) {
                    Config.m1463Q(mutableOptionsBundleM1507T, mutableOptionsBundleM1507T, useCaseConfig, option5);
                }
            }
        }
        if (treeMap.containsKey(ImageOutputConfig.f2734k)) {
            Config.Option option6 = ImageOutputConfig.f2730g;
            if (treeMap.containsKey(option6)) {
                treeMap.remove(option6);
            }
        }
        Config.Option option7 = ImageOutputConfig.f2738o;
        if (treeMap.containsKey(option7)) {
            ((ResolutionSelector) mutableOptionsBundleM1507T.mo1464a(option7)).getClass();
        }
        return mo1242t(cameraInfoInternal, mo1240j(mutableOptionsBundleM1507T));
    }

    /* JADX INFO: renamed from: o */
    public final void m1325o() {
        this.f2386c = State.f2398a;
        m1327q();
    }

    /* JADX INFO: renamed from: p */
    public final void m1326p() {
        Iterator it = this.f2384a.iterator();
        while (it.hasNext()) {
            ((StateChangeCallback) it.next()).mo919e(this);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1327q() {
        int iOrdinal = this.f2386c.ordinal();
        HashSet hashSet = this.f2384a;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((StateChangeCallback) it.next()).mo918a(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((StateChangeCallback) it2.next()).mo923i(this);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public UseCaseConfig mo1242t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        return builder.mo1248b();
    }

    /* JADX INFO: renamed from: w */
    public StreamSpec mo1243w(Config config) {
        StreamSpec streamSpec = this.f2390g;
        if (streamSpec == null) {
            throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        StreamSpec.Builder builderMo1421f = streamSpec.mo1421f();
        builderMo1421f.mo1425d(config);
        return builderMo1421f.mo1422a();
    }

    /* JADX INFO: renamed from: z */
    public void mo1246z(Matrix matrix) {
        this.f2393j = new Matrix(matrix);
    }

    /* JADX INFO: renamed from: r */
    public void mo1241r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo1264s() {
    }

    /* JADX INFO: renamed from: u */
    public void mo1328u() {
    }

    /* JADX INFO: renamed from: v */
    public void mo1265v() {
    }

    /* JADX INFO: renamed from: y */
    public void mo1245y() {
    }

    /* JADX INFO: renamed from: x */
    public StreamSpec mo1244x(StreamSpec streamSpec) {
        return streamSpec;
    }
}
