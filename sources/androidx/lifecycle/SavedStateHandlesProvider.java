package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateWriter;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p005F.C0013a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a */
    public final SavedStateRegistry f24985a;

    /* JADX INFO: renamed from: b */
    public boolean f24986b;

    /* JADX INFO: renamed from: c */
    public Bundle f24987c;

    /* JADX INFO: renamed from: d */
    public final Lazy f24988d;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.m18599g(savedStateRegistry, "savedStateRegistry");
        Intrinsics.m18599g(viewModelStoreOwner, "viewModelStoreOwner");
        this.f24985a = savedStateRegistry;
        this.f24988d = LazyKt.m18299b(new C0013a(viewModelStoreOwner, 1));
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    /* JADX INFO: renamed from: a */
    public final Bundle mo175a() {
        Bundle bundleM7644a = BundleKt.m7644a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f24987c;
        if (bundle != null) {
            bundleM7644a.putAll(bundle);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.f24988d.getValue()).f24989a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo175a = ((SavedStateHandle) entry.getValue()).f24975b.f25034e.mo175a();
            if (!bundleMo175a.isEmpty()) {
                SavedStateWriter.m11881d(bundleM7644a, str, bundleMo175a);
            }
        }
        this.f24986b = false;
        return bundleM7644a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9168b() {
        if (this.f24986b) {
            return;
        }
        Bundle bundleM11871a = this.f24985a.m11871a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM7644a = BundleKt.m7644a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f24987c;
        if (bundle != null) {
            bundleM7644a.putAll(bundle);
        }
        if (bundleM11871a != null) {
            bundleM7644a.putAll(bundleM11871a);
        }
        this.f24987c = bundleM7644a;
        this.f24986b = true;
    }
}
