package com.google.accompanist.permissions;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "permissionsResult", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C3664xb0014e0 extends Lambda implements Function1<Map<String, Boolean>, Unit> {
    final /* synthetic */ MutableMultiplePermissionsState $multiplePermissionsState;
    final /* synthetic */ Function1<Map<String, Boolean>, Unit> $onPermissionsResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3664xb0014e0(MutableMultiplePermissionsState mutableMultiplePermissionsState, Function1<? super Map<String, Boolean>, Unit> function1) {
        super(1);
        this.$multiplePermissionsState = mutableMultiplePermissionsState;
        this.$onPermissionsResult = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, Boolean>) obj);
        return Unit.f51459a;
    }

    public final void invoke(@NotNull Map<String, Boolean> permissionsResult) {
        Intrinsics.m18599g(permissionsResult, "permissionsResult");
        this.$multiplePermissionsState.updatePermissionsStatus$permissions_release(permissionsResult);
        this.$onPermissionsResult.invoke(permissionsResult);
    }
}
