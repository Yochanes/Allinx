package androidx.privacysandbox.ads.adservices.topics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class GetTopicsResponse {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31464a;

    public GetTopicsResponse(ArrayList arrayList) {
        this.f31464a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        ArrayList arrayList = this.f31464a;
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (arrayList.size() != getTopicsResponse.f31464a.size()) {
            return false;
        }
        return new HashSet(arrayList).equals(new HashSet(getTopicsResponse.f31464a));
    }

    public final int hashCode() {
        return Objects.hash(this.f31464a);
    }

    public final String toString() {
        return "Topics=" + this.f31464a;
    }
}
