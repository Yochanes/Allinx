package androidx.compose.p013ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {

    /* JADX INFO: renamed from: a */
    public final Function0 f19401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SaveableStateRegistry f19402b;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, Function0 function0) {
        this.f19401a = function0;
        this.f19402b = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: a */
    public final boolean mo3079a(Object obj) {
        return this.f19402b.mo3079a(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: b */
    public final Map mo3080b() {
        return this.f19402b.mo3080b();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: c */
    public final Object mo3081c(String str) {
        return this.f19402b.mo3081c(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: d */
    public final SaveableStateRegistry.Entry mo3082d(String str, Function0 function0) {
        return this.f19402b.mo3082d(str, function0);
    }
}
