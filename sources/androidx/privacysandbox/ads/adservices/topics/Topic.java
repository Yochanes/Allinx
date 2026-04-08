package androidx.privacysandbox.ads.adservices.topics;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/topics/Topic;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Topic {

    /* JADX INFO: renamed from: a */
    public final long f31465a;

    /* JADX INFO: renamed from: b */
    public final long f31466b;

    /* JADX INFO: renamed from: c */
    public final int f31467c;

    public Topic(long j, long j2, int i) {
        this.f31465a = j;
        this.f31466b = j2;
        this.f31467c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.f31465a == topic.f31465a && this.f31466b == topic.f31466b && this.f31467c == topic.f31467c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31467c) + AbstractC0455a.m2231f(this.f31466b, Long.hashCode(this.f31465a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f31465a);
        sb.append(", ModelVersion=");
        sb.append(this.f31466b);
        sb.append(", TopicCode=");
        return AbstractC0000a.m13j("Topic { ", AbstractC0000a.m11h(this.f31467c, " }", sb));
    }
}
