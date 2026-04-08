package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeConstructorSubstitution$Companion$createByConstructorsMap$1 extends TypeConstructorSubstitution {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f54869c;

    public TypeConstructorSubstitution$Companion$createByConstructorsMap$1(Map map) {
        this.f54869c = map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public final boolean mo20127a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: e */
    public final boolean mo20129e() {
        return this.f54869c.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    /* JADX INFO: renamed from: g */
    public final TypeProjection mo20163g(TypeConstructor key) {
        Intrinsics.m18599g(key, "key");
        return (TypeProjection) this.f54869c.get(key);
    }
}
