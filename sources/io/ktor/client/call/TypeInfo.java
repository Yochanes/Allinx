package io.ktor.client.call;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/call/TypeInfo;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class TypeInfo {

    /* JADX INFO: renamed from: a */
    public final KClass f44937a;

    /* JADX INFO: renamed from: b */
    public final Type f44938b;

    /* JADX INFO: renamed from: c */
    public final KType f44939c;

    public TypeInfo(KClass type, Type type2, KType kType) {
        Intrinsics.m18599g(type, "type");
        this.f44937a = type;
        this.f44938b = type2;
        this.f44939c = kType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) obj;
        return Intrinsics.m18594b(this.f44937a, typeInfo.f44937a) && Intrinsics.m18594b(this.f44938b, typeInfo.f44938b) && Intrinsics.m18594b(this.f44939c, typeInfo.f44939c);
    }

    public final int hashCode() {
        KClass kClass = this.f44937a;
        int iHashCode = (kClass != null ? kClass.hashCode() : 0) * 31;
        Type type = this.f44938b;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        KType kType = this.f44939c;
        return iHashCode2 + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeInfo(type=" + this.f44937a + ", reifiedType=" + this.f44938b + ", kotlinType=" + this.f44939c + ")";
    }
}
