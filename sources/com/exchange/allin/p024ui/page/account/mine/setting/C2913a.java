package com.exchange.allin.p024ui.page.account.mine.setting;

import com.exchange.allin.utils.ext.ClipboardExtKt;
import com.exchange.allin.utils.ext.StringExtKt;
import com.exchange.allin.utils.ext.ToastExtKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.mine.setting.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2913a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Triple f37564b;

    public /* synthetic */ C2913a(Triple triple, int i) {
        this.f37563a = i;
        this.f37564b = triple;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37563a) {
            case 0:
                ((Function0) this.f37564b.f51441c).invoke();
                break;
            case 1:
                ((Function0) this.f37564b.f51441c).invoke();
                break;
            case 2:
                ToastExtKt.m14235a(StringExtKt.m14217f("common_copied"));
                ClipboardExtKt.m14191a((CharSequence) this.f37564b.f51440b);
                break;
            case 3:
                ToastExtKt.m14235a(StringExtKt.m14217f("common_copied"));
                ClipboardExtKt.m14191a((CharSequence) this.f37564b.f51440b);
                break;
            case 4:
                ToastExtKt.m14235a(StringExtKt.m14217f("common_copied"));
                ClipboardExtKt.m14191a((CharSequence) this.f37564b.f51440b);
                break;
            case 5:
                ToastExtKt.m14235a(StringExtKt.m14217f("common_copied"));
                ClipboardExtKt.m14191a((CharSequence) this.f37564b.f51440b);
                break;
            default:
                ToastExtKt.m14235a(StringExtKt.m14217f("common_copied"));
                ClipboardExtKt.m14191a((CharSequence) this.f37564b.f51440b);
                break;
        }
        return Unit.f51459a;
    }
}
