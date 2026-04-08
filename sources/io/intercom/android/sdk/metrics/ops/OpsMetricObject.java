package io.intercom.android.sdk.metrics.ops;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class OpsMetricObject {

    /* JADX INFO: renamed from: id */
    private final String f44356id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j;
        this.f44356id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
        if (this.value == opsMetricObject.value && this.type.equals(opsMetricObject.type) && this.name.equals(opsMetricObject.name)) {
            return this.f44356id.equals(opsMetricObject.f44356id);
        }
        return false;
    }

    public String getId() {
        return this.f44356id;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(this.type.hashCode() * 31, 31, this.name);
        long j = this.value;
        return this.f44356id.hashCode() + ((iM5b + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpsMetricObject{type='");
        sb.append(this.type);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', value=");
        sb.append(this.value);
        sb.append(", id='");
        return AbstractC0000a.m19p(sb, this.f44356id, "'}");
    }
}
