package androidx.camera.camera2.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.MultiValueSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraEventCallbacks extends MultiValueSet<CameraEventCallback> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ComboCameraEventCallback {

        /* JADX INFO: renamed from: a */
        public final ArrayList f1529a = new ArrayList();

        public ComboCameraEventCallback(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f1529a.add((CameraEventCallback) it.next());
            }
        }

        /* JADX INFO: renamed from: a */
        public final ArrayList m819a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f1529a.iterator();
            while (it.hasNext()) {
                ((CameraEventCallback) it.next()).getClass();
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    public static CameraEventCallbacks m817b() {
        CameraEventCallbacks cameraEventCallbacks = new CameraEventCallbacks();
        cameraEventCallbacks.f2748a = new HashSet();
        cameraEventCallbacks.f2748a.addAll(Arrays.asList(new CameraEventCallback[0]));
        return cameraEventCallbacks;
    }

    @Override // androidx.camera.core.impl.MultiValueSet
    /* JADX INFO: renamed from: a */
    public final CameraEventCallbacks mo818a() {
        CameraEventCallbacks cameraEventCallbacksM817b = m817b();
        cameraEventCallbacksM817b.f2748a.addAll(Collections.unmodifiableList(new ArrayList(this.f2748a)));
        return cameraEventCallbacksM817b;
    }

    @Override // androidx.camera.core.impl.MultiValueSet
    public final /* bridge */ /* synthetic */ Object clone() {
        return mo818a();
    }
}
