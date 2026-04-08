package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends Lambda implements Function0<KotlinType> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeProjection f54366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturedTypeConstructorKt$createCapturedIfNeeded$1(TypeProjection typeProjection) {
        super(0);
        this.f54366a = typeProjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KotlinType type = this.f54366a.getType();
        Intrinsics.m18598f(type, "this@createCapturedIfNeeded.type");
        return type;
    }
}
