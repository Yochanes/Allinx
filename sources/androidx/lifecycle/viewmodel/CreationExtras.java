package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "Key", "Empty", "Companion", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class CreationExtras {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f25037a = new LinkedHashMap();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Companion;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Empty extends CreationExtras {

        /* JADX INFO: renamed from: b */
        public static final Empty f25038b = new Empty();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        /* JADX INFO: renamed from: a */
        public final Object mo9187a(Key key) {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "T", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface Key<T> {
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9187a(Key key);

    public final boolean equals(Object obj) {
        return (obj instanceof CreationExtras) && Intrinsics.m18594b(this.f25037a, ((CreationExtras) obj).f25037a);
    }

    public final int hashCode() {
        return this.f25037a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f25037a + ')';
    }
}
