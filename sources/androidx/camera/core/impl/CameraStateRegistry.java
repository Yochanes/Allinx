package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f2655a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final Object f2656b;

    /* JADX INFO: renamed from: c */
    public int f2657c;

    /* JADX INFO: renamed from: d */
    public final Camera2CameraCoordinator f2658d;

    /* JADX INFO: renamed from: e */
    public final HashMap f2659e;

    /* JADX INFO: renamed from: f */
    public int f2660f;

    /* JADX INFO: compiled from: Proguard */
    public static class CameraRegistration {

        /* JADX INFO: renamed from: a */
        public CameraInternal.State f2661a = null;

        /* JADX INFO: renamed from: b */
        public final Executor f2662b;

        /* JADX INFO: renamed from: c */
        public final OnConfigureAvailableListener f2663c;

        /* JADX INFO: renamed from: d */
        public final OnOpenAvailableListener f2664d;

        public CameraRegistration(Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.f2662b = executor;
            this.f2663c = onConfigureAvailableListener;
            this.f2664d = onOpenAvailableListener;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnConfigureAvailableListener {
        /* JADX INFO: renamed from: a */
        void mo938a();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnOpenAvailableListener {
        /* JADX INFO: renamed from: a */
        void mo937a();
    }

    public CameraStateRegistry(Camera2CameraCoordinator camera2CameraCoordinator) {
        Object obj = new Object();
        this.f2656b = obj;
        this.f2659e = new HashMap();
        this.f2657c = 1;
        synchronized (obj) {
            this.f2658d = camera2CameraCoordinator;
            this.f2660f = this.f2657c;
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    /* JADX INFO: renamed from: a */
    public final void mo1331a(int i, int i2) {
        synchronized (this.f2656b) {
            boolean z2 = true;
            this.f2657c = i2 == 2 ? 2 : 1;
            boolean z3 = i != 2 && i2 == 2;
            if (i != 2 || i2 == 2) {
                z2 = false;
            }
            if (z3 || z2) {
                m1451e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final CameraRegistration m1448b(String str) {
        HashMap map = this.f2659e;
        for (Camera camera : map.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.mo1213c()).mo945c())) {
                return (CameraRegistration) map.get(camera);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1449c() {
        synchronized (this.f2656b) {
            try {
                Iterator it = this.f2659e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((CameraRegistration) ((Map.Entry) it.next()).getValue()).f2661a == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1450d(Camera camera, CameraInternal.State state, boolean z2) {
        CameraInternal.State state2;
        CameraRegistration cameraRegistrationM1448b;
        synchronized (this.f2656b) {
            try {
                int i = this.f2660f;
                HashMap map = null;
                if (state == CameraInternal.State.RELEASED) {
                    CameraRegistration cameraRegistration = (CameraRegistration) this.f2659e.remove(camera);
                    if (cameraRegistration != null) {
                        m1451e();
                        state2 = cameraRegistration.f2661a;
                    } else {
                        state2 = null;
                    }
                } else {
                    CameraRegistration cameraRegistration2 = (CameraRegistration) this.f2659e.get(camera);
                    Preconditions.m7698e(cameraRegistration2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    CameraInternal.State state3 = cameraRegistration2.f2661a;
                    cameraRegistration2.f2661a = state;
                    CameraInternal.State state4 = CameraInternal.State.OPENING;
                    if (state == state4) {
                        Preconditions.m7699f(state.f2652a || state3 == state4, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                    }
                    if (state3 != state) {
                        m1451e();
                    }
                    state2 = state3;
                }
                if (state2 == state) {
                    return;
                }
                if (this.f2658d.f2109e == 2 && state == CameraInternal.State.CONFIGURED) {
                    String strM1165b = this.f2658d.m1165b(((CameraInternal) camera).mo930q().mo945c());
                    if (strM1165b != null) {
                        cameraRegistrationM1448b = m1448b(strM1165b);
                    }
                } else {
                    cameraRegistrationM1448b = null;
                }
                if (i < 1 && this.f2660f > 0) {
                    map = new HashMap();
                    for (Map.Entry entry : this.f2659e.entrySet()) {
                        if (((CameraRegistration) entry.getValue()).f2661a == CameraInternal.State.PENDING_OPEN) {
                            map.put((Camera) entry.getKey(), (CameraRegistration) entry.getValue());
                        }
                    }
                } else if (state == CameraInternal.State.PENDING_OPEN && this.f2660f > 0) {
                    map = new HashMap();
                    map.put(camera, (CameraRegistration) this.f2659e.get(camera));
                }
                if (map != null && !z2) {
                    map.remove(camera);
                }
                if (map != null) {
                    for (CameraRegistration cameraRegistration3 : map.values()) {
                        cameraRegistration3.getClass();
                        try {
                            cameraRegistration3.f2662b.execute(new RunnableC0015a(cameraRegistration3.f2664d, 1));
                        } catch (RejectedExecutionException e) {
                            Logger.m1283d("CameraStateRegistry", "Unable to notify camera to open.", e);
                        }
                    }
                }
                if (cameraRegistrationM1448b != null) {
                    try {
                        cameraRegistrationM1448b.f2662b.execute(new RunnableC0015a(cameraRegistrationM1448b.f2663c, 2));
                    } catch (RejectedExecutionException e2) {
                        Logger.m1283d("CameraStateRegistry", "Unable to notify camera to configure.", e2);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1451e() {
        boolean zM1285f = Logger.m1285f("CameraStateRegistry");
        StringBuilder sb = this.f2655a;
        if (zM1285f) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f2659e.entrySet()) {
            if (Logger.m1285f("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((Camera) entry.getKey()).toString(), ((CameraRegistration) entry.getValue()).f2661a != null ? ((CameraRegistration) entry.getValue()).f2661a.toString() : "UNKNOWN"));
            }
            CameraInternal.State state = ((CameraRegistration) entry.getValue()).f2661a;
            if (state != null && state.f2652a) {
                i++;
            }
        }
        if (Logger.m1285f("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append("Open count: " + i + " (Max allowed: " + this.f2657c + ")");
            Logger.m1280a("CameraStateRegistry", sb.toString());
        }
        this.f2660f = Math.max(this.f2657c - i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m1452f(Camera camera, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.f2656b) {
            Preconditions.m7699f(!this.f2659e.containsKey(camera), "Camera is already registered: " + camera);
            this.f2659e.put(camera, new CameraRegistration(executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1453g(Camera camera) {
        boolean z2;
        synchronized (this.f2656b) {
            try {
                CameraRegistration cameraRegistration = (CameraRegistration) this.f2659e.get(camera);
                Preconditions.m7698e(cameraRegistration, "Camera must first be registered with registerCamera()");
                z2 = true;
                if (Logger.m1285f("CameraStateRegistry")) {
                    this.f2655a.setLength(0);
                    StringBuilder sb = this.f2655a;
                    Locale locale = Locale.US;
                    Integer numValueOf = Integer.valueOf(this.f2660f);
                    CameraInternal.State state = cameraRegistration.f2661a;
                    sb.append(String.format(locale, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, numValueOf, Boolean.valueOf(state != null && state.f2652a), cameraRegistration.f2661a));
                }
                if (this.f2660f > 0) {
                    cameraRegistration.f2661a = CameraInternal.State.OPENING;
                } else {
                    CameraInternal.State state2 = cameraRegistration.f2661a;
                    if (state2 != null && state2.f2652a) {
                        cameraRegistration.f2661a = CameraInternal.State.OPENING;
                    } else {
                        z2 = false;
                    }
                }
                if (Logger.m1285f("CameraStateRegistry")) {
                    StringBuilder sb2 = this.f2655a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z2 ? "SUCCESS" : "FAIL"));
                    Logger.m1280a("CameraStateRegistry", this.f2655a.toString());
                }
                if (z2) {
                    m1451e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1454h(String str, String str2) {
        synchronized (this.f2656b) {
            try {
                boolean z2 = true;
                if (this.f2658d.f2109e != 2) {
                    return true;
                }
                CameraInternal.State state = null;
                CameraInternal.State state2 = m1448b(str) != null ? m1448b(str).f2661a : null;
                if (str2 != null && m1448b(str2) != null) {
                    state = m1448b(str2).f2661a;
                }
                CameraInternal.State state3 = CameraInternal.State.OPEN;
                boolean z3 = state3.equals(state2) || CameraInternal.State.CONFIGURED.equals(state2);
                boolean z4 = state3.equals(state) || CameraInternal.State.CONFIGURED.equals(state);
                if (!z3 || !z4) {
                    z2 = false;
                }
                return z2;
            } finally {
            }
        }
    }
}
