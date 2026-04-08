package com.geetest.captcha;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.y */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3611y {

    /* JADX INFO: renamed from: a */
    public final ArrayList<InterfaceC3612z> f42296a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m14384a(@Nullable InterfaceC3612z interfaceC3612z) {
        if (interfaceC3612z == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (this.f42296a) {
            if (this.f42296a.contains(interfaceC3612z)) {
                throw new IllegalStateException(("Observer " + interfaceC3612z + " is already registered.").toString());
            }
            this.f42296a.add(interfaceC3612z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14385a(@NotNull String errorCode, @NotNull String errorMsg, @NotNull JSONObject errorDesc) {
        Intrinsics.m18599g(errorCode, "errorCode");
        Intrinsics.m18599g(errorMsg, "errorMsg");
        Intrinsics.m18599g(errorDesc, "errorDesc");
        Iterator<InterfaceC3612z> it = this.f42296a.iterator();
        while (it.hasNext()) {
            it.next().mo14366a(errorCode, errorMsg, errorDesc);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14386a(boolean z2, @NotNull String result) {
        Intrinsics.m18599g(result, "result");
        Iterator<InterfaceC3612z> it = this.f42296a.iterator();
        while (it.hasNext()) {
            it.next().mo14367a(z2, result);
        }
    }
}
