package androidx.camera.core;

import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraSelector {

    /* JADX INFO: renamed from: b */
    public static final CameraSelector f2205b;

    /* JADX INFO: renamed from: c */
    public static final CameraSelector f2206c;

    /* JADX INFO: renamed from: a */
    public LinkedHashSet f2207a;

    /* JADX INFO: compiled from: Proguard */
    @OptIn
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LensFacing {
    }

    static {
        Builder builder = new Builder();
        builder.m1221b(0);
        f2205b = builder.m1220a();
        Builder builder2 = new Builder();
        builder2.m1221b(1);
        f2206c = builder2.m1220a();
    }

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet m1217a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraInternal) it.next()).mo1213c());
        }
        List listM1218b = m1218b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal cameraInternal = (CameraInternal) it2.next();
            if (listM1218b.contains(cameraInternal.mo1213c())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: b */
    public final List m1218b(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f2207a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((CameraFilter) it.next()).mo1216b(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m1219c() {
        Integer num = null;
        for (CameraFilter cameraFilter : this.f2207a) {
            if (cameraFilter instanceof LensFacingCameraFilter) {
                Integer numValueOf = Integer.valueOf(((LensFacingCameraFilter) cameraFilter).f2741b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet f2208a;

        public Builder() {
            this.f2208a = new LinkedHashSet();
        }

        /* JADX INFO: renamed from: a */
        public final CameraSelector m1220a() {
            LinkedHashSet linkedHashSet = this.f2208a;
            CameraSelector cameraSelector = new CameraSelector();
            cameraSelector.f2207a = linkedHashSet;
            return cameraSelector;
        }

        /* JADX INFO: renamed from: b */
        public final void m1221b(int i) {
            Preconditions.m7699f(i != -1, "The specified lens facing is invalid.");
            this.f2208a.add(new LensFacingCameraFilter(i));
        }

        public Builder(LinkedHashSet linkedHashSet) {
            this.f2208a = new LinkedHashSet(linkedHashSet);
        }
    }
}
