package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class Quirks {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2753a;

    public Quirks(ArrayList arrayList) {
        this.f2753a = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1513a(Class cls) {
        Iterator it = this.f2753a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((Quirk) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Quirk m1514b(Class cls) {
        for (Quirk quirk : this.f2753a) {
            if (quirk.getClass() == cls) {
                return quirk;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m1515c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Quirk quirk : this.f2753a) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
