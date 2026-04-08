package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lcom/google/accompanist/insets/Insets;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CalculatedWindowInsetsType$layoutInsets$2 extends Lambda implements Function0<Insets> {
    final /* synthetic */ WindowInsets.Type[] $types;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatedWindowInsetsType$layoutInsets$2(WindowInsets.Type[] typeArr) {
        super(0);
        this.$types = typeArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Insets invoke() {
        WindowInsets.Type[] typeArr = this.$types;
        Insets empty = Insets.INSTANCE.getEmpty();
        for (WindowInsets.Type type : typeArr) {
            empty = InsetsKt.coerceEachDimensionAtLeast(empty, type);
        }
        return empty;
    }
}
