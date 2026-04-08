package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class UnwrappedType extends KotlinType {
    /* JADX INFO: renamed from: M0 */
    public abstract UnwrappedType mo19303M0(boolean z2);

    /* JADX INFO: renamed from: N0 */
    public abstract UnwrappedType mo19304N0(KotlinTypeRefiner kotlinTypeRefiner);

    /* JADX INFO: renamed from: O0 */
    public abstract UnwrappedType mo19305O0(TypeAttributes typeAttributes);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: L0 */
    public final UnwrappedType mo20144L0() {
        return this;
    }
}
