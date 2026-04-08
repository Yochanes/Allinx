package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0631xbf752ad0 extends Lambda implements Function0<LazySaveableStateHolder> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SaveableStateRegistry f7429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SaveableStateHolder f7430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0631xbf752ad0(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        super(0);
        this.f7429a = saveableStateRegistry;
        this.f7430b = saveableStateHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LazySaveableStateHolder(this.f7429a, MapsKt.m18481d(), this.f7430b);
    }
}
