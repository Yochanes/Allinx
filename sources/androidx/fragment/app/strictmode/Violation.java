package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Fragment f24826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        Intrinsics.m18599g(fragment, "fragment");
        this.f24826a = fragment;
    }
}
