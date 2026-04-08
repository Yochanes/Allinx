package io.intercom.android.sdk.p041ui.extension;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"ifTrue", "Landroidx/compose/ui/Modifier;", "condition", "", "modifier", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "intercom-sdk-ui_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ModifierExtensionsKt {
    @NotNull
    public static final Modifier ifTrue(@NotNull Modifier modifier, boolean z2, @NotNull Function1<? super Modifier, ? extends Modifier> modifier2) {
        Intrinsics.m18599g(modifier, "<this>");
        Intrinsics.m18599g(modifier2, "modifier");
        return z2 ? modifier.then((Modifier) modifier2.invoke(Modifier.Companion.f17180a)) : modifier;
    }
}
