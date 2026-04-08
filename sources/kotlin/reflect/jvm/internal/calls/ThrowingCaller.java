package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ThrowingCaller implements Caller {

    /* JADX INFO: renamed from: a */
    public static final ThrowingCaller f52004a = new ThrowingCaller();

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public final List mo18747a() {
        return EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo18748b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] args) {
        Intrinsics.m18599g(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.m18598f(TYPE, "TYPE");
        return TYPE;
    }
}
