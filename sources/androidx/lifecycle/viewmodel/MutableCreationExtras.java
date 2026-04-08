package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras(CreationExtras initialExtras) {
        Intrinsics.m18599g(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f25037a;
        Intrinsics.m18599g(initialExtras2, "initialExtras");
        this.f25037a.putAll(initialExtras2);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    /* JADX INFO: renamed from: a */
    public final Object mo9187a(CreationExtras.Key key) {
        return this.f25037a.get(key);
    }

    public /* synthetic */ MutableCreationExtras(int i) {
        this(CreationExtras.Empty.f25038b);
    }
}
