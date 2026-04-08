package androidx.camera.core;

import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.imagecapture.ImagePipeline;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageCaptureConfig;
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
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ImageCapture extends UseCase {

    /* JADX INFO: renamed from: v */
    public static final Defaults f2301v = new Defaults();

    /* JADX INFO: renamed from: n */
    public final int f2302n;

    /* JADX INFO: renamed from: o */
    public final AtomicReference f2303o;

    /* JADX INFO: renamed from: p */
    public final int f2304p;

    /* JADX INFO: renamed from: q */
    public final int f2305q;

    /* JADX INFO: renamed from: r */
    public SessionConfig.Builder f2306r;

    /* JADX INFO: renamed from: s */
    public ImagePipeline f2307s;

    /* JADX INFO: renamed from: t */
    public TakePictureManager f2308t;

    /* JADX INFO: renamed from: u */
    public final ImageCaptureControl f2309u;

    /* JADX INFO: renamed from: androidx.camera.core.ImageCapture$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C02311 implements ImageCaptureControl {
        public C02311() {
        }

        @Override // androidx.camera.core.imagecapture.ImageCaptureControl
        /* JADX INFO: renamed from: a */
        public final void mo1266a() {
            ImageCapture imageCapture = ImageCapture.this;
            synchronized (imageCapture.f2303o) {
                try {
                    if (imageCapture.f2303o.get() != null) {
                        return;
                    }
                    imageCapture.f2303o.set(Integer.valueOf(imageCapture.m1260F()));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.core.imagecapture.ImageCaptureControl
        /* JADX INFO: renamed from: b */
        public final void mo1267b() {
            ImageCapture imageCapture = ImageCapture.this;
            synchronized (imageCapture.f2303o) {
                try {
                    Integer num = (Integer) imageCapture.f2303o.getAndSet(null);
                    if (num == null) {
                        return;
                    }
                    if (num.intValue() != imageCapture.m1260F()) {
                        imageCapture.m1262I();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.core.imagecapture.ImageCaptureControl
        /* JADX INFO: renamed from: c */
        public final ListenableFuture mo1268c(ArrayList arrayList) {
            ImageCapture imageCapture = ImageCapture.this;
            imageCapture.getClass();
            Threads.m1607a();
            return Futures.m1634k(imageCapture.m1317c().mo880f(arrayList, imageCapture.f2302n, imageCapture.f2304p), new C0310m(), CameraXExecutors.m1615a());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder>, ImageInputConfig.Builder<Builder> {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f2311a;

        public Builder() {
            this(MutableOptionsBundle.m1507T());
        }

        @Override // androidx.camera.core.ExtendableBuilder
        /* JADX INFO: renamed from: a */
        public final MutableConfig mo814a() {
            return this.f2311a;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        /* JADX INFO: renamed from: b */
        public final UseCaseConfig mo1248b() {
            return new ImageCaptureConfig(OptionsBundle.m1511S(this.f2311a));
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Object objMo1464a;
            this.f2311a = mutableOptionsBundle;
            Object objMo1464a2 = null;
            try {
                objMo1464a = mutableOptionsBundle.mo1464a(TargetConfig.f2993C);
            } catch (IllegalArgumentException unused) {
                objMo1464a = null;
            }
            Class cls = (Class) objMo1464a;
            if (cls != null && !cls.equals(ImageCapture.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            Config.Option option = TargetConfig.f2993C;
            MutableOptionsBundle mutableOptionsBundle2 = this.f2311a;
            mutableOptionsBundle2.mo1506u(option, ImageCapture.class);
            try {
                objMo1464a2 = mutableOptionsBundle2.mo1464a(TargetConfig.f2992B);
            } catch (IllegalArgumentException unused2) {
            }
            if (objMo1464a2 == null) {
                this.f2311a.mo1506u(TargetConfig.f2992B, ImageCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CaptureMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {

        /* JADX INFO: renamed from: a */
        public static final ImageCaptureConfig f2312a;

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        static {
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.f3181a = AspectRatioStrategy.f3175b;
            builder.f3182b = ResolutionStrategy.f3184c;
            Object objM1733a = builder.m1733a();
            DynamicRange dynamicRange = DynamicRange.f2247d;
            Builder builder2 = new Builder();
            Config.Option option = UseCaseConfig.f2813u;
            MutableOptionsBundle mutableOptionsBundle = builder2.f2311a;
            mutableOptionsBundle.mo1506u(option, 4);
            mutableOptionsBundle.mo1506u(ImageOutputConfig.f2730g, 0);
            mutableOptionsBundle.mo1506u(ImageOutputConfig.f2738o, objM1733a);
            mutableOptionsBundle.mo1506u(UseCaseConfig.f2818z, UseCaseConfigFactory.CaptureType.f2820a);
            if (!dynamicRange.equals(dynamicRange)) {
                throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
            }
            mutableOptionsBundle.mo1506u(ImageInputConfig.f2729f, dynamicRange);
            f2312a = new ImageCaptureConfig(OptionsBundle.m1511S(mutableOptionsBundle));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FlashMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FlashType {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ImageCaptureError {
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static class ImageCaptureRequest {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Metadata {
        public final String toString() {
            return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class OnImageCapturedCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnImageSavedCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OutputFileOptions {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        public final String toString() {
            return "OutputFileOptions{mFile=null, mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=null}";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OutputFileResults {
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.f2303o = new AtomicReference(null);
        this.f2305q = -1;
        this.f2309u = new C02311();
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) this.f2389f;
        Config.Option option = ImageCaptureConfig.f2720G;
        if (imageCaptureConfig2.mo1465c(option)) {
            this.f2302n = ((Integer) imageCaptureConfig2.mo1464a(option)).intValue();
        } else {
            this.f2302n = 1;
        }
        this.f2304p = ((Integer) imageCaptureConfig2.mo1468f(ImageCaptureConfig.f2726M, 0)).intValue();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m1257G(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m1258D(boolean z2) {
        TakePictureManager takePictureManager;
        Log.d("ImageCapture", "clearPipeline");
        Threads.m1607a();
        ImagePipeline imagePipeline = this.f2307s;
        if (imagePipeline != null) {
            imagePipeline.m1360a();
            this.f2307s = null;
        }
        if (z2 || (takePictureManager = this.f2308t) == null) {
            return;
        }
        takePictureManager.m1368a();
        this.f2308t = null;
    }

    /* JADX INFO: renamed from: E */
    public final SessionConfig.Builder m1259E(String str, ImageCaptureConfig imageCaptureConfig, StreamSpec streamSpec) {
        Threads.m1607a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, streamSpec));
        Size sizeMo1420e = streamSpec.mo1420e();
        CameraInternal cameraInternalM1316b = m1316b();
        Objects.requireNonNull(cameraInternalM1316b);
        boolean z2 = !cameraInternalM1316b.mo1445p() || m1261H();
        if (this.f2307s != null) {
            Preconditions.m7699f(z2, null);
            this.f2307s.m1360a();
        }
        this.f2307s = new ImagePipeline(imageCaptureConfig, sizeMo1420e, this.f2395l, z2);
        if (this.f2308t == null) {
            this.f2308t = new TakePictureManager(this.f2309u);
        }
        this.f2308t.m1372f(this.f2307s);
        SessionConfig.Builder builderM1361b = this.f2307s.m1361b(streamSpec.mo1420e());
        if (this.f2302n == 2) {
            m1317c().mo879e(builderM1361b);
        }
        if (streamSpec.mo1419d() != null) {
            builderM1361b.m1525e(streamSpec.mo1419d());
        }
        builderM1361b.m1524d(new C0248g(this, str, imageCaptureConfig, streamSpec, 1));
        return builderM1361b;
    }

    /* JADX INFO: renamed from: F */
    public final int m1260F() {
        int iIntValue;
        synchronized (this.f2303o) {
            iIntValue = this.f2305q;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((ImageCaptureConfig) this.f2389f).mo1468f(ImageCaptureConfig.f2721H, 2)).intValue();
            }
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1261H() {
        return (m1316b() == null || m1316b().mo925k().m1438F() == null) ? false : true;
    }

    /* JADX INFO: renamed from: I */
    public final void m1262I() {
        synchronized (this.f2303o) {
            try {
                if (this.f2303o.get() != null) {
                    return;
                }
                m1317c().mo878d(m1260F());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: e */
    public final UseCaseConfig mo1239e(boolean z2, UseCaseConfigFactory useCaseConfigFactory) {
        f2301v.getClass();
        ImageCaptureConfig imageCaptureConfig = Defaults.f2312a;
        Config configMo986a = useCaseConfigFactory.mo986a(imageCaptureConfig.mo1028E(), this.f2302n);
        if (z2) {
            configMo986a = Config.m1462I(configMo986a, imageCaptureConfig);
        }
        if (configMo986a == null) {
            return null;
        }
        return new ImageCaptureConfig(OptionsBundle.m1511S(((Builder) mo1240j(configMo986a)).f2311a));
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: i */
    public final Set mo1263i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: j */
    public final UseCaseConfig.Builder mo1240j(Config config) {
        return new Builder(MutableOptionsBundle.m1508U(config));
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: r */
    public final void mo1241r() {
        Preconditions.m7698e(m1316b(), "Attached camera cannot be null");
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: s */
    public final void mo1264s() {
        m1262I();
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: t */
    public final UseCaseConfig mo1242t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        boolean z2;
        if (cameraInfoInternal.mo955n().m1513a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableConfig mutableConfigMo814a = builder.mo814a();
            Config.Option option = ImageCaptureConfig.f2725L;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfigMo814a.mo1468f(option, bool2))) {
                Logger.m1288i("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                Logger.m1284e("ImageCapture", "Requesting software JPEG due to device quirk.");
                builder.mo814a().mo1506u(option, bool2);
            }
        }
        MutableConfig mutableConfigMo814a2 = builder.mo814a();
        Boolean bool3 = Boolean.TRUE;
        Config.Option option2 = ImageCaptureConfig.f2725L;
        Boolean bool4 = Boolean.FALSE;
        boolean z3 = true;
        if (bool3.equals(mutableConfigMo814a2.mo1468f(option2, bool4))) {
            if (m1261H()) {
                Logger.m1288i("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z2 = false;
            } else {
                z2 = true;
            }
            Integer num = (Integer) mutableConfigMo814a2.mo1468f(ImageCaptureConfig.f2723J, null);
            if (num != null && num.intValue() != 256) {
                Logger.m1288i("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z2 = false;
            }
            if (!z2) {
                Logger.m1288i("ImageCapture", "Unable to support software JPEG. Disabling.");
                mutableConfigMo814a2.mo1506u(option2, bool4);
            }
        } else {
            z2 = false;
        }
        Integer num2 = (Integer) builder.mo814a().mo1468f(ImageCaptureConfig.f2723J, null);
        if (num2 != null) {
            if (m1261H() && num2.intValue() != 256) {
                z3 = false;
            }
            Preconditions.m7695b(z3, "Cannot set non-JPEG buffer format with Extensions enabled.");
            builder.mo814a().mo1506u(ImageInputConfig.f2728e, Integer.valueOf(z2 ? 35 : num2.intValue()));
        } else if (z2) {
            builder.mo814a().mo1506u(ImageInputConfig.f2728e, 35);
        } else {
            List list = (List) builder.mo814a().mo1468f(ImageOutputConfig.f2737n, null);
            if (list == null || m1257G(256, list)) {
                builder.mo814a().mo1506u(ImageInputConfig.f2728e, 256);
            } else if (m1257G(35, list)) {
                builder.mo814a().mo1506u(ImageInputConfig.f2728e, 35);
            }
        }
        return builder.mo1248b();
    }

    public final String toString() {
        return "ImageCapture:".concat(m1319f());
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: v */
    public final void mo1265v() {
        TakePictureManager takePictureManager = this.f2308t;
        if (takePictureManager != null) {
            takePictureManager.m1368a();
        }
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: w */
    public final StreamSpec mo1243w(Config config) {
        this.f2306r.m1525e(config);
        m1314C(this.f2306r.m1531k());
        StreamSpec.Builder builderMo1421f = this.f2390g.mo1421f();
        builderMo1421f.mo1425d(config);
        return builderMo1421f.mo1422a();
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: x */
    public final StreamSpec mo1244x(StreamSpec streamSpec) {
        SessionConfig.Builder builderM1259E = m1259E(m1318d(), (ImageCaptureConfig) this.f2389f, streamSpec);
        this.f2306r = builderM1259E;
        m1314C(builderM1259E.m1531k());
        m1325o();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    /* JADX INFO: renamed from: y */
    public final void mo1245y() {
        TakePictureManager takePictureManager = this.f2308t;
        if (takePictureManager != null) {
            takePictureManager.m1368a();
        }
        m1258D(false);
    }
}
