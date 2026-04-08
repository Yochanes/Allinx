package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: b */
    public final LockBasedStorageManager f54830b;

    /* JADX INFO: renamed from: c */
    public final Lambda f54831c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f54832d;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(LockBasedStorageManager storageManager, Function0 function0) {
        Intrinsics.m18599g(storageManager, "storageManager");
        this.f54830b = storageManager;
        this.f54831c = (Lambda) function0;
        this.f54832d = storageManager.mo20076a(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: K0 */
    public final KotlinType mo19302K0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.m18599g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f54830b, new LazyWrappedType$refine$1(kotlinTypeRefiner, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    /* JADX INFO: renamed from: M0 */
    public final KotlinType mo20152M0() {
        return (KotlinType) this.f54832d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    /* JADX INFO: renamed from: N0 */
    public final boolean mo20153N0() {
        return this.f54832d.m20096f();
    }
}
