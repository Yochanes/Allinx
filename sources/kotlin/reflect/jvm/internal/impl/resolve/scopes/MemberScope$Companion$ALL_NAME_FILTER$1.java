package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MemberScope$Companion$ALL_NAME_FILTER$1 extends Lambda implements Function1<Name, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final MemberScope$Companion$ALL_NAME_FILTER$1 f54456a = new MemberScope$Companion$ALL_NAME_FILTER$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Name it = (Name) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.TRUE;
    }
}
