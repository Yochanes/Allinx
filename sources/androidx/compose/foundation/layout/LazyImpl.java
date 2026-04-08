package androidx.compose.foundation.layout;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/layout/LazyImpl;", "Lkotlin/Lazy;", "", "Companion", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyImpl implements Lazy<Integer> {

    /* JADX INFO: renamed from: a */
    public final Lambda f6487a;

    /* JADX INFO: renamed from: b */
    public final String f6488b;

    /* JADX INFO: renamed from: c */
    public int f6489c = -1;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/layout/LazyImpl$Companion;", "", "", "UNINITIALIZED_VALUE", "I", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyImpl(Function0 function0, String str) {
        this.f6487a = (Lambda) function0;
        this.f6488b = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public final Integer m2783a() {
        if (this.f6489c == -1) {
            this.f6489c = ((Number) this.f6487a.invoke()).intValue();
        }
        int i = this.f6489c;
        if (i != -1) {
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(this.f6488b);
    }

    @Override // kotlin.Lazy
    public final /* bridge */ /* synthetic */ Object getValue() {
        return m2783a();
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f6489c != -1;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(m2783a().intValue()) : this.f6488b;
    }
}
