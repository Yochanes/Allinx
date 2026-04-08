package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SpreadBuilder {

    /* JADX INFO: renamed from: a */
    public final ArrayList f51662a;

    public SpreadBuilder(int i) {
        this.f51662a = new ArrayList(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m18623a(Object obj) {
        this.f51662a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m18624b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z2 = obj instanceof Object[];
        ArrayList arrayList = this.f51662a;
        if (z2) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }
}
