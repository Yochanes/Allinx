package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0003H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "restored", "", "", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazySaveableStateHolder$Companion$saver$2 extends Lambda implements Function1<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SaveableStateRegistry f7420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SaveableStateHolder f7421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$Companion$saver$2(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        super(1);
        this.f7420a = saveableStateRegistry;
        this.f7421b = saveableStateHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SaveableStateHolder saveableStateHolder = this.f7421b;
        return new LazySaveableStateHolder(this.f7420a, (Map) obj, saveableStateHolder);
    }
}
