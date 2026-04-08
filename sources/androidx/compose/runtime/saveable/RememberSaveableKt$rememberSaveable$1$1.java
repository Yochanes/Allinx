package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "T", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class RememberSaveableKt$rememberSaveable$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SaveableHolder f16956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Saver f16957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SaveableStateRegistry f16958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f16959d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f16960f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object[] f16961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1$1(SaveableHolder saveableHolder, Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        super(0);
        this.f16956a = saveableHolder;
        this.f16957b = saver;
        this.f16958c = saveableStateRegistry;
        this.f16959d = str;
        this.f16960f = obj;
        this.f16961g = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        SaveableHolder saveableHolder = this.f16956a;
        SaveableStateRegistry saveableStateRegistry = saveableHolder.f16963b;
        SaveableStateRegistry saveableStateRegistry2 = this.f16958c;
        boolean z3 = true;
        if (saveableStateRegistry != saveableStateRegistry2) {
            saveableHolder.f16963b = saveableStateRegistry2;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = saveableHolder.f16964c;
        String str2 = this.f16959d;
        if (Intrinsics.m18594b(str, str2)) {
            z3 = z2;
        } else {
            saveableHolder.f16964c = str2;
        }
        saveableHolder.f16962a = this.f16957b;
        saveableHolder.f16965d = this.f16960f;
        saveableHolder.f16966f = this.f16961g;
        SaveableStateRegistry.Entry entry = saveableHolder.f16967g;
        if (entry != null && z3) {
            entry.unregister();
            saveableHolder.f16967g = null;
            saveableHolder.m4754b();
        }
        return Unit.f51459a;
    }
}
