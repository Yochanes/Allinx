package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/activity/OnBackPressedDispatcherKt$addCallback$callback$1", "Landroidx/activity/OnBackPressedCallback;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class OnBackPressedDispatcherKt$addCallback$callback$1 extends OnBackPressedCallback {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lambda f115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcherKt$addCallback$callback$1(Function1 function1) {
        super(true);
        this.f115d = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.activity.OnBackPressedCallback
    /* JADX INFO: renamed from: b */
    public final void mo161b() {
        this.f115d.invoke(this);
    }
}
