package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DrawablePainterKt$MAIN_HANDLER$2 extends Lambda implements Function0<Handler> {
    public static final DrawablePainterKt$MAIN_HANDLER$2 INSTANCE = new DrawablePainterKt$MAIN_HANDLER$2();

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
