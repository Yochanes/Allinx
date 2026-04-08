package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.compat.workaround.C0306a;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class SessionConfig {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2761a;

    /* JADX INFO: renamed from: b */
    public final List f2762b;

    /* JADX INFO: renamed from: c */
    public final List f2763c;

    /* JADX INFO: renamed from: d */
    public final List f2764d;

    /* JADX INFO: renamed from: e */
    public final List f2765e;

    /* JADX INFO: renamed from: f */
    public final CaptureConfig f2766f;

    /* JADX INFO: renamed from: g */
    public final InputConfiguration f2767g;

    /* JADX INFO: compiled from: Proguard */
    public static class BaseBuilder {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet f2768a = new LinkedHashSet();

        /* JADX INFO: renamed from: b */
        public final CaptureConfig.Builder f2769b = new CaptureConfig.Builder();

        /* JADX INFO: renamed from: c */
        public final ArrayList f2770c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f2771d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final ArrayList f2772e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final ArrayList f2773f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public InputConfiguration f2774g;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder extends BaseBuilder {
        /* JADX INFO: renamed from: m */
        public static Builder m1520m(UseCaseConfig useCaseConfig, Size size) {
            OptionUnpacker optionUnpackerM1574v = useCaseConfig.m1574v();
            if (optionUnpackerM1574v != null) {
                Builder builder = new Builder();
                optionUnpackerM1574v.mo985a(size, useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.m1659y(useCaseConfig.toString()));
        }

        /* JADX INFO: renamed from: a */
        public final void m1521a(Collection collection) {
            this.f2769b.m1457a(collection);
        }

        /* JADX INFO: renamed from: b */
        public final void m1522b(CameraCaptureCallback cameraCaptureCallback) {
            this.f2769b.m1458b(cameraCaptureCallback);
            ArrayList arrayList = this.f2773f;
            if (arrayList.contains(cameraCaptureCallback)) {
                return;
            }
            arrayList.add(cameraCaptureCallback);
        }

        /* JADX INFO: renamed from: c */
        public final void m1523c(CameraDevice.StateCallback stateCallback) {
            ArrayList arrayList = this.f2770c;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        /* JADX INFO: renamed from: d */
        public final void m1524d(ErrorListener errorListener) {
            this.f2772e.add(errorListener);
        }

        /* JADX INFO: renamed from: e */
        public final void m1525e(Config config) {
            this.f2769b.m1459c(config);
        }

        /* JADX INFO: renamed from: f */
        public final void m1526f(DeferrableSurface deferrableSurface, DynamicRange dynamicRange) {
            OutputConfig.Builder builderM1538a = OutputConfig.m1538a(deferrableSurface);
            AutoValue_SessionConfig_OutputConfig.Builder builder = (AutoValue_SessionConfig_OutputConfig.Builder) builderM1538a;
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            builder.f2582d = dynamicRange;
            this.f2768a.add(builderM1538a.mo1416a());
        }

        /* JADX INFO: renamed from: g */
        public final void m1527g(CameraCaptureCallback cameraCaptureCallback) {
            this.f2769b.m1458b(cameraCaptureCallback);
        }

        /* JADX INFO: renamed from: h */
        public final void m1528h(CameraCaptureSession.StateCallback stateCallback) {
            ArrayList arrayList = this.f2771d;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        /* JADX INFO: renamed from: i */
        public final void m1529i(DeferrableSurface deferrableSurface, DynamicRange dynamicRange) {
            OutputConfig.Builder builderM1538a = OutputConfig.m1538a(deferrableSurface);
            AutoValue_SessionConfig_OutputConfig.Builder builder = (AutoValue_SessionConfig_OutputConfig.Builder) builderM1538a;
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            builder.f2582d = dynamicRange;
            this.f2768a.add(builderM1538a.mo1416a());
            this.f2769b.m1460d(deferrableSurface);
        }

        /* JADX INFO: renamed from: j */
        public final void m1530j(Object obj, String str) {
            this.f2769b.f2682g.f2799a.put(str, obj);
        }

        /* JADX INFO: renamed from: k */
        public final SessionConfig m1531k() {
            return new SessionConfig(new ArrayList(this.f2768a), new ArrayList(this.f2770c), new ArrayList(this.f2771d), new ArrayList(this.f2773f), new ArrayList(this.f2772e), this.f2769b.m1461e(), this.f2774g);
        }

        /* JADX INFO: renamed from: l */
        public final void m1532l() {
            this.f2768a.clear();
            this.f2769b.f2676a.clear();
        }

        /* JADX INFO: renamed from: n */
        public final void m1533n(CameraCaptureCallback cameraCaptureCallback) {
            this.f2769b.f2680e.remove(cameraCaptureCallback);
            this.f2773f.remove(cameraCaptureCallback);
        }

        /* JADX INFO: renamed from: o */
        public final void m1534o(Range range) {
            CaptureConfig.Builder builder = this.f2769b;
            builder.getClass();
            builder.f2677b.mo1506u(CaptureConfig.f2667k, range);
        }

        /* JADX INFO: renamed from: p */
        public final void m1535p(Config config) {
            CaptureConfig.Builder builder = this.f2769b;
            builder.getClass();
            builder.f2677b = MutableOptionsBundle.m1508U(config);
        }

        /* JADX INFO: renamed from: q */
        public final void m1536q(InputConfiguration inputConfiguration) {
            this.f2774g = inputConfiguration;
        }

        /* JADX INFO: renamed from: r */
        public final void m1537r(int i) {
            this.f2769b.f2678c = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ErrorListener {
        /* JADX INFO: renamed from: a */
        void mo1170a();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OptionUnpacker {
        /* JADX INFO: renamed from: a */
        void mo985a(Size size, UseCaseConfig useCaseConfig, Builder builder);
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class OutputConfig {

        /* JADX INFO: compiled from: Proguard */
        @AutoValue.Builder
        public static abstract class Builder {
            /* JADX INFO: renamed from: a */
            public abstract OutputConfig mo1416a();
        }

        /* JADX INFO: renamed from: a */
        public static Builder m1538a(DeferrableSurface deferrableSurface) {
            AutoValue_SessionConfig_OutputConfig.Builder builder = new AutoValue_SessionConfig_OutputConfig.Builder();
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            builder.f2579a = deferrableSurface;
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            builder.f2580b = list;
            builder.f2581c = -1;
            builder.f2582d = DynamicRange.f2247d;
            return builder;
        }

        /* JADX INFO: renamed from: b */
        public abstract DynamicRange mo1411b();

        /* JADX INFO: renamed from: c */
        public abstract String mo1412c();

        /* JADX INFO: renamed from: d */
        public abstract List mo1413d();

        /* JADX INFO: renamed from: e */
        public abstract DeferrableSurface mo1414e();

        /* JADX INFO: renamed from: f */
        public abstract int mo1415f();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class SessionError {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ SessionError[] f2775a = {new SessionError("SESSION_ERROR_SURFACE_NEEDS_RESET", 0), new SessionError("SESSION_ERROR_UNKNOWN", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        SessionError EF5;

        public static SessionError valueOf(String str) {
            return (SessionError) Enum.valueOf(SessionError.class, str);
        }

        public static SessionError[] values() {
            return (SessionError[]) f2775a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ValidatingBuilder extends BaseBuilder {

        /* JADX INFO: renamed from: k */
        public static final List f2776k = Arrays.asList(1, 5, 3);

        /* JADX INFO: renamed from: h */
        public final SurfaceSorter f2777h = new SurfaceSorter();

        /* JADX INFO: renamed from: i */
        public boolean f2778i = true;

        /* JADX INFO: renamed from: j */
        public boolean f2779j = false;

        /* JADX INFO: renamed from: a */
        public final void m1539a(SessionConfig sessionConfig) {
            Object objMo1464a;
            CaptureConfig captureConfig = sessionConfig.f2766f;
            int i = captureConfig.f2670c;
            CaptureConfig.Builder builder = this.f2769b;
            if (i != -1) {
                this.f2779j = true;
                int i2 = builder.f2678c;
                Integer numValueOf = Integer.valueOf(i);
                List list = f2776k;
                if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                    i = i2;
                }
                builder.f2678c = i;
            }
            Config.Option option = CaptureConfig.f2667k;
            Object objMo1464a2 = StreamSpec.f2781a;
            OptionsBundle optionsBundle = captureConfig.f2669b;
            try {
                objMo1464a2 = optionsBundle.mo1464a(option);
            } catch (IllegalArgumentException unused) {
            }
            Range range = (Range) objMo1464a2;
            Objects.requireNonNull(range);
            Range range2 = StreamSpec.f2781a;
            if (!range.equals(range2)) {
                MutableOptionsBundle mutableOptionsBundle = builder.f2677b;
                Config.Option option2 = CaptureConfig.f2667k;
                mutableOptionsBundle.getClass();
                try {
                    objMo1464a = mutableOptionsBundle.mo1464a(option2);
                } catch (IllegalArgumentException unused2) {
                    objMo1464a = range2;
                }
                if (((Range) objMo1464a).equals(range2)) {
                    builder.f2677b.mo1506u(CaptureConfig.f2667k, range);
                } else {
                    MutableOptionsBundle mutableOptionsBundle2 = builder.f2677b;
                    Config.Option option3 = CaptureConfig.f2667k;
                    Object objMo1464a3 = StreamSpec.f2781a;
                    mutableOptionsBundle2.getClass();
                    try {
                        objMo1464a3 = mutableOptionsBundle2.mo1464a(option3);
                    } catch (IllegalArgumentException unused3) {
                    }
                    if (!((Range) objMo1464a3).equals(range)) {
                        this.f2778i = false;
                        Logger.m1280a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                    }
                }
            }
            CaptureConfig captureConfig2 = sessionConfig.f2766f;
            builder.f2682g.f2799a.putAll((Map) captureConfig2.f2674g.f2799a);
            this.f2770c.addAll(sessionConfig.f2762b);
            this.f2771d.addAll(sessionConfig.f2763c);
            builder.m1457a(captureConfig2.f2672e);
            this.f2773f.addAll(sessionConfig.f2764d);
            this.f2772e.addAll(sessionConfig.f2765e);
            InputConfiguration inputConfiguration = sessionConfig.f2767g;
            if (inputConfiguration != null) {
                this.f2774g = inputConfiguration;
            }
            LinkedHashSet<OutputConfig> linkedHashSet = this.f2768a;
            linkedHashSet.addAll(sessionConfig.f2761a);
            HashSet hashSet = builder.f2676a;
            hashSet.addAll(Collections.unmodifiableList(captureConfig.f2668a));
            ArrayList arrayList = new ArrayList();
            for (OutputConfig outputConfig : linkedHashSet) {
                arrayList.add(outputConfig.mo1414e());
                Iterator it = outputConfig.mo1413d().iterator();
                while (it.hasNext()) {
                    arrayList.add((DeferrableSurface) it.next());
                }
            }
            if (!arrayList.containsAll(hashSet)) {
                Logger.m1280a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f2778i = false;
            }
            builder.m1459c(optionsBundle);
        }

        /* JADX INFO: renamed from: b */
        public final SessionConfig m1540b() {
            if (!this.f2778i) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f2768a);
            SurfaceSorter surfaceSorter = this.f2777h;
            if (surfaceSorter.f3005a) {
                Collections.sort(arrayList, new C0306a(surfaceSorter, 0));
            }
            return new SessionConfig(arrayList, new ArrayList(this.f2770c), new ArrayList(this.f2771d), new ArrayList(this.f2773f), new ArrayList(this.f2772e), this.f2769b.m1461e(), this.f2774g);
        }
    }

    public SessionConfig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, CaptureConfig captureConfig, InputConfiguration inputConfiguration) {
        this.f2761a = arrayList;
        this.f2762b = Collections.unmodifiableList(arrayList2);
        this.f2763c = Collections.unmodifiableList(arrayList3);
        this.f2764d = Collections.unmodifiableList(arrayList4);
        this.f2765e = Collections.unmodifiableList(arrayList5);
        this.f2766f = captureConfig;
        this.f2767g = inputConfiguration;
    }

    /* JADX INFO: renamed from: a */
    public static SessionConfig m1518a() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig.Builder().m1461e(), null);
    }

    /* JADX INFO: renamed from: b */
    public final List m1519b() {
        ArrayList arrayList = new ArrayList();
        for (OutputConfig outputConfig : this.f2761a) {
            arrayList.add(outputConfig.mo1414e());
            Iterator it = outputConfig.mo1413d().iterator();
            while (it.hasNext()) {
                arrayList.add((DeferrableSurface) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
