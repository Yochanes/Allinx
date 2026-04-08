package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/activity/OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1", "Landroid/window/OnBackAnimationCallback;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class C0034x8ac2f76a implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function0 f107c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function0 f108d;

    public C0034x8ac2f76a(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.f105a = function1;
        this.f106b = function12;
        this.f107c = function0;
        this.f108d = function02;
    }

    public final void onBackCancelled() {
        this.f108d.invoke();
    }

    public final void onBackInvoked() {
        this.f107c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        this.f106b.invoke(new BackEventCompat(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        this.f105a.invoke(new BackEventCompat(backEvent));
    }
}
