package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "T", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SaveableHolder$valueProvider$1 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SaveableHolder f16969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableHolder$valueProvider$1(SaveableHolder saveableHolder) {
        super(0);
        this.f16969a = saveableHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SaveableHolder saveableHolder = this.f16969a;
        Saver saver = saveableHolder.f16962a;
        Object obj = saveableHolder.f16965d;
        if (obj != null) {
            return saver.mo3289b(saveableHolder, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }
}
