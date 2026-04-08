package com.exchange.allin.p024ui.page.account.web;

import android.net.Uri;
import android.webkit.ValueCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.web.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2979a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f38061b;

    public /* synthetic */ C2979a(Ref.ObjectRef objectRef, int i) {
        this.f38060a = i;
        this.f38061b = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit unit;
        Unit unit2;
        Uri uri = (Uri) obj;
        switch (this.f38060a) {
            case 0:
                Unit unit3 = Unit.f51459a;
                Ref.ObjectRef objectRef = this.f38061b;
                if (uri == null) {
                    ValueCallback valueCallback = (ValueCallback) objectRef.f51659a;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(null);
                    }
                } else {
                    ValueCallback valueCallback2 = (ValueCallback) objectRef.f51659a;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(new Uri[]{uri});
                        unit = unit3;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                    }
                }
                objectRef.f51659a = null;
                return unit3;
            default:
                Unit unit4 = Unit.f51459a;
                Ref.ObjectRef objectRef2 = this.f38061b;
                if (uri == null) {
                    ValueCallback valueCallback3 = (ValueCallback) objectRef2.f51659a;
                    if (valueCallback3 != null) {
                        valueCallback3.onReceiveValue(null);
                    }
                } else {
                    ValueCallback valueCallback4 = (ValueCallback) objectRef2.f51659a;
                    if (valueCallback4 != null) {
                        valueCallback4.onReceiveValue(new Uri[]{uri});
                        unit2 = unit4;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                    }
                }
                objectRef2.f51659a = null;
                return unit4;
        }
    }
}
