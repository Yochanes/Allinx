package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class SessionConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public final SessionConfigurationCompatImpl f2036a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class SessionConfigurationCompatApi28Impl implements SessionConfigurationCompatImpl {

        /* JADX INFO: renamed from: a */
        public final SessionConfiguration f2037a;

        /* JADX INFO: renamed from: b */
        public final List f2038b;

        public SessionConfigurationCompatApi28Impl(ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            OutputConfigurationCompat outputConfigurationCompat;
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, SessionConfigurationCompat.m1135h(arrayList), executor, stateCallback);
            this.f2037a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                if (outputConfiguration == null) {
                    outputConfigurationCompat = null;
                } else {
                    int i = Build.VERSION.SDK_INT;
                    outputConfigurationCompat = new OutputConfigurationCompat(i >= 33 ? new OutputConfigurationCompatApi33Impl(outputConfiguration) : i >= 28 ? new OutputConfigurationCompatApi28Impl(new OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(outputConfiguration)) : i >= 26 ? new OutputConfigurationCompatApi26Impl(new OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26(outputConfiguration)) : new OutputConfigurationCompatApi24Impl(new OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(outputConfiguration)));
                }
                arrayList2.add(outputConfigurationCompat);
            }
            this.f2038b = Collections.unmodifiableList(arrayList2);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: a */
        public final InputConfigurationCompat mo1144a() {
            return InputConfigurationCompat.m1116b(this.f2037a.getInputConfiguration());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: b */
        public final CameraCaptureSession.StateCallback mo1145b() {
            return this.f2037a.getStateCallback();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: c */
        public final Object mo1146c() {
            return this.f2037a;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: d */
        public final void mo1147d(InputConfigurationCompat inputConfigurationCompat) {
            this.f2037a.setInputConfiguration(inputConfigurationCompat.f2021a.f2022a);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: e */
        public final Executor mo1148e() {
            return this.f2037a.getExecutor();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SessionConfigurationCompatApi28Impl) {
                return Objects.equals(this.f2037a, ((SessionConfigurationCompatApi28Impl) obj).f2037a);
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: f */
        public final int mo1149f() {
            return this.f2037a.getSessionType();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: g */
        public final List mo1150g() {
            return this.f2038b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: h */
        public final void mo1151h(CaptureRequest captureRequest) {
            this.f2037a.setSessionParameters(captureRequest);
        }

        public final int hashCode() {
            return this.f2037a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SessionConfigurationCompatImpl {
        /* JADX INFO: renamed from: a */
        InputConfigurationCompat mo1144a();

        /* JADX INFO: renamed from: b */
        CameraCaptureSession.StateCallback mo1145b();

        /* JADX INFO: renamed from: c */
        Object mo1146c();

        /* JADX INFO: renamed from: d */
        void mo1147d(InputConfigurationCompat inputConfigurationCompat);

        /* JADX INFO: renamed from: e */
        Executor mo1148e();

        /* JADX INFO: renamed from: f */
        int mo1149f();

        /* JADX INFO: renamed from: g */
        List mo1150g();

        /* JADX INFO: renamed from: h */
        void mo1151h(CaptureRequest captureRequest);
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface SessionMode {
    }

    public SessionConfigurationCompat(ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f2036a = new SessionConfigurationCompatBaseImpl(arrayList, executor, stateCallback);
        } else {
            this.f2036a = new SessionConfigurationCompatApi28Impl(arrayList, executor, stateCallback);
        }
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m1135h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((OutputConfigurationCompat) it.next()).f2023a.mo1133h());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final Executor m1136a() {
        return this.f2036a.mo1148e();
    }

    /* JADX INFO: renamed from: b */
    public final InputConfigurationCompat m1137b() {
        return this.f2036a.mo1144a();
    }

    /* JADX INFO: renamed from: c */
    public final List m1138c() {
        return this.f2036a.mo1150g();
    }

    /* JADX INFO: renamed from: d */
    public final int m1139d() {
        return this.f2036a.mo1149f();
    }

    /* JADX INFO: renamed from: e */
    public final CameraCaptureSession.StateCallback m1140e() {
        return this.f2036a.mo1145b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionConfigurationCompat)) {
            return false;
        }
        return this.f2036a.equals(((SessionConfigurationCompat) obj).f2036a);
    }

    /* JADX INFO: renamed from: f */
    public final void m1141f(InputConfigurationCompat inputConfigurationCompat) {
        this.f2036a.mo1147d(inputConfigurationCompat);
    }

    /* JADX INFO: renamed from: g */
    public final void m1142g(CaptureRequest captureRequest) {
        this.f2036a.mo1151h(captureRequest);
    }

    public final int hashCode() {
        return this.f2036a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final Object m1143i() {
        return this.f2036a.mo1146c();
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class SessionConfigurationCompatBaseImpl implements SessionConfigurationCompatImpl {

        /* JADX INFO: renamed from: a */
        public final List f2039a;

        /* JADX INFO: renamed from: b */
        public final CameraCaptureSession.StateCallback f2040b;

        /* JADX INFO: renamed from: c */
        public final Executor f2041c;

        /* JADX INFO: renamed from: d */
        public InputConfigurationCompat f2042d = null;

        public SessionConfigurationCompatBaseImpl(ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f2039a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f2040b = stateCallback;
            this.f2041c = executor;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: a */
        public final InputConfigurationCompat mo1144a() {
            return this.f2042d;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: b */
        public final CameraCaptureSession.StateCallback mo1145b() {
            return this.f2040b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: c */
        public final Object mo1146c() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: d */
        public final void mo1147d(InputConfigurationCompat inputConfigurationCompat) {
            this.f2042d = inputConfigurationCompat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: e */
        public final Executor mo1148e() {
            return this.f2041c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SessionConfigurationCompatBaseImpl) {
                SessionConfigurationCompatBaseImpl sessionConfigurationCompatBaseImpl = (SessionConfigurationCompatBaseImpl) obj;
                if (Objects.equals(this.f2042d, sessionConfigurationCompatBaseImpl.f2042d)) {
                    List list = this.f2039a;
                    int size = list.size();
                    List list2 = sessionConfigurationCompatBaseImpl.f2039a;
                    if (size == list2.size()) {
                        for (int i = 0; i < list.size(); i++) {
                            if (((OutputConfigurationCompat) list.get(i)).equals(list2.get(i))) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: f */
        public final int mo1149f() {
            return 0;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: g */
        public final List mo1150g() {
            return this.f2039a;
        }

        public final int hashCode() {
            int iHashCode = this.f2039a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            InputConfigurationCompat inputConfigurationCompat = this.f2042d;
            int iHashCode2 = (inputConfigurationCompat == null ? 0 : inputConfigurationCompat.f2021a.hashCode()) ^ i;
            return (iHashCode2 << 5) - iHashCode2;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        /* JADX INFO: renamed from: h */
        public final void mo1151h(CaptureRequest captureRequest) {
        }
    }
}
