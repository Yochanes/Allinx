package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: b */
    public final NotNullLazyValue f54451b;

    public LazyScopeAdapter(StorageManager storageManager, Function0 function0) {
        Intrinsics.m18599g(storageManager, "storageManager");
        this.f54451b = storageManager.mo20076a(new LazyScopeAdapter$lazyScope$1(function0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    /* JADX INFO: renamed from: i */
    public final MemberScope mo19995i() {
        return (MemberScope) this.f54451b.invoke();
    }
}
