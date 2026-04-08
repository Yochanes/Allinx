package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Invocation {

    /* JADX INFO: renamed from: a */
    public final Class f59315a;

    /* JADX INFO: renamed from: b */
    public final Object f59316b;

    /* JADX INFO: renamed from: c */
    public final Method f59317c;

    /* JADX INFO: renamed from: d */
    public final List f59318d;

    public Invocation(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f59315a = cls;
        this.f59316b = obj;
        this.f59317c = method;
        this.f59318d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f59315a.getName(), this.f59317c.getName(), this.f59318d);
    }
}
