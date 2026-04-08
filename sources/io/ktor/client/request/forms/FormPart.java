package io.ktor.client.request.forms;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/request/forms/FormPart;", "", "T", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class FormPart<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormPart)) {
            return false;
        }
        ((FormPart) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "FormPart(key=null, value=null, headers=null)";
    }
}
