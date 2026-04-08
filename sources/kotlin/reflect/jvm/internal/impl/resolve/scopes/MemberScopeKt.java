package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class MemberScopeKt {
    /* JADX INFO: renamed from: a */
    public static final HashSet m20001a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo19039e = ((MemberScope) it.next()).mo19039e();
            if (setMo19039e == null) {
                return null;
            }
            CollectionsKt.m18434i(hashSet, setMo19039e);
        }
        return hashSet;
    }
}
