package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class LazyWrappedType$refine$1 extends Lambda implements Function0<KotlinType> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KotlinTypeRefiner f54833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LazyWrappedType f54834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyWrappedType$refine$1(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        super(0);
        this.f54833a = kotlinTypeRefiner;
        this.f54834b = lazyWrappedType;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f54833a.mo20279f((KotlinTypeMarker) this.f54834b.f54831c.invoke());
    }
}
