package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class FocusMeteringAction {

    /* JADX INFO: renamed from: a */
    public final List f2255a;

    /* JADX INFO: renamed from: b */
    public final List f2256b;

    /* JADX INFO: renamed from: c */
    public final List f2257c;

    /* JADX INFO: renamed from: d */
    public final long f2258d;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MeteringMode {
    }

    public FocusMeteringAction(Builder builder) {
        this.f2255a = Collections.unmodifiableList(builder.f2259a);
        this.f2256b = Collections.unmodifiableList(builder.f2260b);
        this.f2257c = Collections.unmodifiableList(builder.f2261c);
        this.f2258d = builder.f2262d;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final ArrayList f2259a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f2260b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f2261c;

        /* JADX INFO: renamed from: d */
        public final long f2262d;

        public Builder(MeteringPoint meteringPoint) {
            ArrayList arrayList = new ArrayList();
            this.f2259a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f2260b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f2261c = arrayList3;
            this.f2262d = 5000L;
            arrayList.add(meteringPoint);
            arrayList2.add(meteringPoint);
            arrayList3.add(meteringPoint);
        }

        /* JADX INFO: renamed from: a */
        public final void m1232a(int i) {
            if ((i & 1) != 0) {
                this.f2259a.clear();
            }
            if ((i & 2) != 0) {
                this.f2260b.clear();
            }
            if ((i & 4) != 0) {
                this.f2261c.clear();
            }
        }

        public Builder(FocusMeteringAction focusMeteringAction) {
            ArrayList arrayList = new ArrayList();
            this.f2259a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f2260b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f2261c = arrayList3;
            this.f2262d = 5000L;
            arrayList.addAll(focusMeteringAction.f2255a);
            arrayList2.addAll(focusMeteringAction.f2256b);
            arrayList3.addAll(focusMeteringAction.f2257c);
            this.f2262d = focusMeteringAction.f2258d;
        }
    }
}
