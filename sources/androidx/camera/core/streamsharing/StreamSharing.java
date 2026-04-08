package androidx.camera.core.streamsharing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class StreamSharing extends UseCase {

    /* JADX INFO: renamed from: n */
    public final StreamSharingConfig f3187n;

    /* JADX INFO: renamed from: o */
    public final VirtualCamera f3188o;

    /* JADX INFO: renamed from: p */
    public SurfaceProcessorNode f3189p;

    /* JADX INFO: renamed from: q */
    public SurfaceEdge f3190q;

    /* JADX INFO: renamed from: r */
    public SurfaceEdge f3191r;

    /* JADX INFO: renamed from: s */
    public SessionConfig.Builder f3192s;

    /* JADX INFO: compiled from: Proguard */
    public interface Control {
    }

    public StreamSharing(CameraInternal cameraInternal, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory) {
        super(m1734G(hashSet));
        this.f3187n = m1734G(hashSet);
        this.f3188o = new VirtualCamera(cameraInternal, hashSet, useCaseConfigFactory, new C0334b(this));
    }

    /* JADX INFO: renamed from: G */
    public static StreamSharingConfig m1734G(HashSet hashSet) {
        MutableOptionsBundle mutableOptionsBundleM1507T = MutableOptionsBundle.m1507T();
        new StreamSharingBuilder(mutableOptionsBundleM1507T);
        mutableOptionsBundleM1507T.mo1506u(ImageInputConfig.f2728e, 34);
        mutableOptionsBundleM1507T.mo1506u(UseCaseConfig.f2818z, UseCaseConfigFactory.CaptureType.f2824f);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase.f2389f.mo1465c(UseCaseConfig.f2818z)) {
                arrayList.add(useCase.f2389f.mo1028E());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        mutableOptionsBundleM1507T.mo1506u(StreamSharingConfig.f3194G, arrayList);
        mutableOptionsBundleM1507T.mo1506u(ImageOutputConfig.f2733j, 2);
        return new StreamSharingConfig(OptionsBundle.m1511S(mutableOptionsBundleM1507T));
    }

    /* JADX INFO: renamed from: D */
    public final void m1735D() {
        SurfaceEdge surfaceEdge = this.f3190q;
        if (surfaceEdge != null) {
            Threads.m1607a();
            surfaceEdge.m1719d();
            surfaceEdge.f3109o = true;
            this.f3190q = null;
        }
        SurfaceEdge surfaceEdge2 = this.f3191r;
        if (surfaceEdge2 != null) {
            Threads.m1607a();
            surfaceEdge2.m1719d();
            surfaceEdge2.f3109o = true;
            this.f3191r = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f3189p;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.m1727b();
            this.f3189p = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public final SessionConfig m1736E(String str, UseCaseConfig useCaseConfig, StreamSpec streamSpec) {
        Threads.m1607a();
        CameraInternal cameraInternalM1316b = m1316b();
        cameraInternalM1316b.getClass();
        Matrix matrix = this.f2393j;
        boolean zMo1445p = cameraInternalM1316b.mo1445p();
        Size sizeMo1420e = streamSpec.mo1420e();
        Rect rect = this.f2392i;
        if (rect == null) {
            rect = new Rect(0, 0, sizeMo1420e.getWidth(), sizeMo1420e.getHeight());
        }
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, streamSpec, matrix, zMo1445p, rect, mo1298g(cameraInternalM1316b, false), -1, m1323m(cameraInternalM1316b));
        this.f3190q = surfaceEdge;
        if (this.f2395l != null) {
            throw null;
        }
        this.f3191r = surfaceEdge;
        this.f3189p = new SurfaceProcessorNode(cameraInternalM1316b, new DefaultSurfaceProcessor(streamSpec.mo1417b()));
        SurfaceEdge surfaceEdge2 = this.f3191r;
        VirtualCamera virtualCamera = this.f3188o;
        virtualCamera.getClass();
        HashMap map = new HashMap();
        Iterator it = virtualCamera.f3196a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UseCase useCase = (UseCase) it.next();
            boolean z2 = useCase instanceof Preview;
            int iMo952k = z2 ? virtualCamera.f3200f.mo1213c().mo952k(((ImageOutputConfig) ((Preview) useCase).f2389f).m1494C()) : 0;
            int i = z2 ? 1 : useCase instanceof ImageCapture ? 4 : 2;
            int i2 = useCase instanceof ImageCapture ? 256 : 34;
            Rect rect2 = surfaceEdge2.f3098d;
            RectF rectF = TransformUtils.f2896a;
            map.put(useCase, SurfaceProcessorNode.OutConfig.m1730h(i, i2, rect2, TransformUtils.m1614f(new Size(rect2.width(), rect2.height()), iMo952k), iMo952k, useCase.m1323m(virtualCamera)));
        }
        SurfaceProcessorNode.Out outM1728c = this.f3189p.m1728c(SurfaceProcessorNode.AbstractC0316In.m1729c(this.f3191r, new ArrayList(map.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((UseCase) entry.getKey(), outM1728c.get(entry.getValue()));
        }
        HashMap map3 = virtualCamera.f3197b;
        map3.clear();
        map3.putAll(map2);
        for (Map.Entry entry2 : map3.entrySet()) {
            UseCase useCase2 = (UseCase) entry2.getKey();
            SurfaceEdge surfaceEdge3 = (SurfaceEdge) entry2.getValue();
            useCase2.mo1235A(surfaceEdge3.f3098d);
            useCase2.mo1246z(surfaceEdge3.f3096b);
            useCase2.f2390g = useCase2.mo1244x(surfaceEdge3.f3101g);
            useCase2.m1327q();
        }
        SessionConfig.Builder builderM1520m = SessionConfig.Builder.m1520m(useCaseConfig, streamSpec.mo1420e());
        SurfaceEdge surfaceEdge4 = this.f3190q;
        surfaceEdge4.getClass();
        Threads.m1607a();
        surfaceEdge4.m1717b();
        Preconditions.m7699f(!surfaceEdge4.f3105k, "Consumer can only be linked once.");
        surfaceEdge4.f3105k = true;
        builderM1520m.m1529i(surfaceEdge4.f3107m, DynamicRange.f2247d);
        builderM1520m.m1527g(virtualCamera.f3201g);
        if (streamSpec.mo1419d() != null) {
            builderM1520m.m1525e(streamSpec.mo1419d());
        }
        builderM1520m.m1524d(new C0333a(this, str, useCaseConfig, streamSpec));
        this.f3192s = builderM1520m;
        return builderM1520m.m1531k();
    }

    /* JADX INFO: renamed from: F */
    public final Set m1737F() {
        return this.f3188o.f3196a;
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: e */
    public final UseCaseConfig mo1239e(boolean z2, UseCaseConfigFactory useCaseConfigFactory) {
        StreamSharingConfig streamSharingConfig = this.f3187n;
        Config configMo986a = useCaseConfigFactory.mo986a(streamSharingConfig.mo1028E(), 1);
        if (z2) {
            configMo986a = Config.m1462I(configMo986a, streamSharingConfig.f3195F);
        }
        if (configMo986a == null) {
            return null;
        }
        return ((StreamSharingBuilder) mo1240j(configMo986a)).mo1248b();
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: i */
    public final Set mo1263i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: j */
    public final UseCaseConfig.Builder mo1240j(Config config) {
        return new StreamSharingBuilder(MutableOptionsBundle.m1508U(config));
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: r */
    public final void mo1241r() {
        VirtualCamera virtualCamera = this.f3188o;
        for (UseCase useCase : virtualCamera.f3196a) {
            useCase.m1315a(virtualCamera, null, useCase.mo1239e(true, virtualCamera.f3199d));
        }
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: t */
    public final UseCaseConfig mo1242t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        CameraInternal cameraInternal;
        MutableConfig mutableConfigMo814a = builder.mo814a();
        VirtualCamera virtualCamera = this.f3188o;
        virtualCamera.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = virtualCamera.f3196a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cameraInternal = virtualCamera.f3200f;
            if (!zHasNext) {
                break;
            }
            UseCase useCase = (UseCase) it.next();
            hashSet.add(useCase.m1324n(cameraInternal.mo930q(), null, useCase.mo1239e(true, virtualCamera.f3199d)));
        }
        List arrayList = new ArrayList(cameraInternal.mo930q().mo956o(34));
        Rect rectMo877c = cameraInternal.mo922h().mo877c();
        RectF rectF = TransformUtils.f2896a;
        new Size(rectMo877c.width(), rectMo877c.height());
        Config.Option option = ImageOutputConfig.f2739p;
        Iterator it2 = hashSet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            List list = (List) ((UseCaseConfig) it2.next()).mo1468f(ImageOutputConfig.f2739p, null);
            if (list != null) {
                arrayList = list;
                break;
            }
        }
        mutableConfigMo814a.mo1506u(option, arrayList);
        Config.Option option2 = UseCaseConfig.f2813u;
        Iterator it3 = hashSet.iterator();
        int iMax = 0;
        while (it3.hasNext()) {
            iMax = Math.max(iMax, ((UseCaseConfig) it3.next()).m1569N());
        }
        mutableConfigMo814a.mo1506u(option2, Integer.valueOf(iMax));
        return builder.mo1248b();
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: u */
    public final void mo1328u() {
        Iterator it = this.f3188o.f3196a.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).mo1328u();
        }
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: v */
    public final void mo1265v() {
        Iterator it = this.f3188o.f3196a.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).mo1265v();
        }
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: w */
    public final StreamSpec mo1243w(Config config) {
        this.f3192s.m1525e(config);
        m1314C(this.f3192s.m1531k());
        StreamSpec.Builder builderMo1421f = this.f2390g.mo1421f();
        builderMo1421f.mo1425d(config);
        return builderMo1421f.mo1422a();
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: x */
    public final StreamSpec mo1244x(StreamSpec streamSpec) {
        m1314C(m1736E(m1318d(), this.f2389f, streamSpec));
        m1325o();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: y */
    public final void mo1245y() {
        m1735D();
        VirtualCamera virtualCamera = this.f3188o;
        Iterator it = virtualCamera.f3196a.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).m1313B(virtualCamera);
        }
    }
}
