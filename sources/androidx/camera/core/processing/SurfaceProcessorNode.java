package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class SurfaceProcessorNode implements Node<AbstractC0316In, Out> {

    /* JADX INFO: renamed from: a */
    public final DefaultSurfaceProcessor f3125a;

    /* JADX INFO: renamed from: b */
    public final CameraInternal f3126b;

    /* JADX INFO: renamed from: c */
    public Out f3127c;

    /* JADX INFO: renamed from: androidx.camera.core.processing.SurfaceProcessorNode$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03151 implements FutureCallback<SurfaceOutput> {
        public C03151() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.m1289j("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) throws IOException {
            SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
            surfaceOutput.getClass();
            try {
                DefaultSurfaceProcessor defaultSurfaceProcessor = SurfaceProcessorNode.this.f3125a;
                if (defaultSurfaceProcessor.f3066f.get()) {
                    surfaceOutput.close();
                } else {
                    defaultSurfaceProcessor.m1689b(new RunnableC0317a(0, defaultSurfaceProcessor, surfaceOutput), new RunnableC0329m(surfaceOutput, 2));
                }
            } catch (ProcessingException e) {
                Logger.m1283d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.processing.SurfaceProcessorNode$In */
    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class AbstractC0316In {
        /* JADX INFO: renamed from: c */
        public static AbstractC0316In m1729c(SurfaceEdge surfaceEdge, List list) {
            return new AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }

        /* JADX INFO: renamed from: a */
        public abstract List mo1679a();

        /* JADX INFO: renamed from: b */
        public abstract SurfaceEdge mo1680b();
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Out extends HashMap<OutConfig, SurfaceEdge> {
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class OutConfig {
        /* JADX INFO: renamed from: h */
        public static OutConfig m1730h(int i, int i2, Rect rect, Size size, int i3, boolean z2) {
            return new AutoValue_SurfaceProcessorNode_OutConfig(UUID.randomUUID(), i, i2, rect, size, i3, z2);
        }

        /* JADX INFO: renamed from: a */
        public abstract Rect mo1681a();

        /* JADX INFO: renamed from: b */
        public abstract int mo1682b();

        /* JADX INFO: renamed from: c */
        public abstract boolean mo1683c();

        /* JADX INFO: renamed from: d */
        public abstract int mo1684d();

        /* JADX INFO: renamed from: e */
        public abstract Size mo1685e();

        /* JADX INFO: renamed from: f */
        public abstract int mo1686f();

        /* JADX INFO: renamed from: g */
        public abstract UUID mo1687g();
    }

    public SurfaceProcessorNode(CameraInternal cameraInternal, DefaultSurfaceProcessor defaultSurfaceProcessor) {
        this.f3126b = cameraInternal;
        this.f3125a = defaultSurfaceProcessor;
    }

    /* JADX INFO: renamed from: a */
    public final void m1726a(SurfaceEdge surfaceEdge, Map.Entry entry) {
        SurfaceEdge surfaceEdge2 = (SurfaceEdge) entry.getValue();
        Size sizeMo1420e = surfaceEdge.f3101g.mo1420e();
        int iMo1682b = ((OutConfig) entry.getKey()).mo1682b();
        Rect rectMo1681a = ((OutConfig) entry.getKey()).mo1681a();
        int iMo1684d = ((OutConfig) entry.getKey()).mo1684d();
        boolean zMo1683c = ((OutConfig) entry.getKey()).mo1683c();
        CameraInternal cameraInternal = surfaceEdge.f3097c ? this.f3126b : null;
        surfaceEdge2.getClass();
        Threads.m1607a();
        surfaceEdge2.m1717b();
        Preconditions.m7699f(!surfaceEdge2.f3105k, "Consumer can only be linked once.");
        surfaceEdge2.f3105k = true;
        SurfaceEdge.SettableSurface settableSurface = surfaceEdge2.f3107m;
        Futures.m1624a(Futures.m1635l(settableSurface.m1479c(), new C0328l(surfaceEdge2, settableSurface, iMo1682b, sizeMo1420e, rectMo1681a, iMo1684d, zMo1683c, cameraInternal), CameraXExecutors.m1618d()), new C03151(), CameraXExecutors.m1618d());
    }

    /* JADX INFO: renamed from: b */
    public final void m1727b() {
        this.f3125a.m1692e();
        CameraXExecutors.m1618d().execute(new RunnableC0329m(this, 5));
    }

    /* JADX INFO: renamed from: c */
    public final Out m1728c(AbstractC0316In abstractC0316In) {
        SurfaceEdge surfaceEdge;
        Threads.m1607a();
        this.f3127c = new Out();
        AutoValue_SurfaceProcessorNode_In autoValue_SurfaceProcessorNode_In = (AutoValue_SurfaceProcessorNode_In) abstractC0316In;
        Iterator it = autoValue_SurfaceProcessorNode_In.f3054b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            surfaceEdge = autoValue_SurfaceProcessorNode_In.f3053a;
            if (!zHasNext) {
                break;
            }
            OutConfig outConfig = (OutConfig) it.next();
            Out out = this.f3127c;
            Rect rectMo1681a = outConfig.mo1681a();
            int iMo1684d = outConfig.mo1684d();
            boolean zMo1683c = outConfig.mo1683c();
            Matrix matrix = new Matrix(surfaceEdge.f3096b);
            RectF rectF = new RectF(rectMo1681a);
            Size sizeMo1685e = outConfig.mo1685e();
            RectF rectF2 = TransformUtils.f2896a;
            float f = 0;
            matrix.postConcat(TransformUtils.m1609a(iMo1684d, zMo1683c, rectF, new RectF(f, f, sizeMo1685e.getWidth(), sizeMo1685e.getHeight())));
            Preconditions.m7694a(TransformUtils.m1612d(TransformUtils.m1614f(new Size(rectMo1681a.width(), rectMo1681a.height()), iMo1684d), false, outConfig.mo1685e()));
            StreamSpec.Builder builderMo1421f = surfaceEdge.f3101g.mo1421f();
            builderMo1421f.mo1426e(outConfig.mo1685e());
            StreamSpec streamSpecMo1422a = builderMo1421f.mo1422a();
            int iMo1686f = outConfig.mo1686f();
            int iMo1682b = outConfig.mo1682b();
            Size sizeMo1685e2 = outConfig.mo1685e();
            out.put(outConfig, new SurfaceEdge(iMo1686f, iMo1682b, streamSpecMo1422a, matrix, false, new Rect(0, 0, sizeMo1685e2.getWidth(), sizeMo1685e2.getHeight()), surfaceEdge.f3103i - iMo1684d, -1, surfaceEdge.f3099e != zMo1683c));
        }
        Out out2 = this.f3127c;
        SurfaceRequest surfaceRequestM1718c = surfaceEdge.m1718c(this.f3126b);
        surfaceRequestM1718c.m1308b(CameraXExecutors.m1618d(), new C0330n(out2, 2));
        try {
            DefaultSurfaceProcessor defaultSurfaceProcessor = this.f3125a;
            if (defaultSurfaceProcessor.f3066f.get()) {
                surfaceRequestM1718c.m1309c();
            } else {
                defaultSurfaceProcessor.m1689b(new RunnableC0317a(3, defaultSurfaceProcessor, surfaceRequestM1718c), new RunnableC0329m(surfaceRequestM1718c, 3));
            }
        } catch (ProcessingException e) {
            Logger.m1283d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry<OutConfig, SurfaceEdge> entry : this.f3127c.entrySet()) {
            m1726a(surfaceEdge, entry);
            entry.getValue().m1716a(new RunnableC0320d(this, 1, surfaceEdge, entry));
        }
        return this.f3127c;
    }
}
