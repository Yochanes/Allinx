package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CalculatedWindowInsetsType$animationFraction$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ WindowInsets.Type[] $types;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatedWindowInsetsType$animationFraction$2(WindowInsets.Type[] typeArr) {
        super(0);
        this.$types = typeArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        WindowInsets.Type[] typeArr = this.$types;
        if (typeArr.length == 0) {
            throw new NoSuchElementException();
        }
        float animationFraction = typeArr[0].getAnimationFraction();
        IntProgressionIterator intProgressionIteratorM18652g = new IntRange(1, typeArr.length - 1, 1).m18652g();
        while (intProgressionIteratorM18652g.f51690c) {
            animationFraction = Math.max(animationFraction, typeArr[intProgressionIteratorM18652g.mo2140c()].getAnimationFraction());
        }
        return Float.valueOf(animationFraction);
    }
}
