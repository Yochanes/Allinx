package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"derivedWindowInsetsTypeOf", "Lcom/google/accompanist/insets/WindowInsets$Type;", "types", "", "([Lcom/google/accompanist/insets/WindowInsets$Type;)Lcom/google/accompanist/insets/WindowInsets$Type;", "insets_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class WindowInsetsTypeKt {
    @Deprecated
    @NotNull
    public static final WindowInsets.Type derivedWindowInsetsTypeOf(@NotNull WindowInsets.Type... types) {
        Intrinsics.m18599g(types, "types");
        return new CalculatedWindowInsetsType((WindowInsets.Type[]) Arrays.copyOf(types, types.length));
    }
}
