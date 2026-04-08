package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SubtypePathNode {

    /* JADX INFO: renamed from: a */
    public final KotlinType f54930a;

    /* JADX INFO: renamed from: b */
    public final SubtypePathNode f54931b;

    public SubtypePathNode(KotlinType type, SubtypePathNode subtypePathNode) {
        Intrinsics.m18599g(type, "type");
        this.f54930a = type;
        this.f54931b = subtypePathNode;
    }
}
