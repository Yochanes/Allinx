package com.google.accompanist.permissions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C3667x570010 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MutablePermissionState $permissionState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3667x570010(MutablePermissionState mutablePermissionState) {
        super(1);
        this.$permissionState = mutablePermissionState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f51459a;
    }

    public final void invoke(boolean z2) {
        this.$permissionState.refreshPermissionStatus$permissions_release();
    }
}
