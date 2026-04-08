package com.exchange.allin.net.response;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bHÆ\u0003J?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m18302d2 = {"Lcom/exchange/allin/net/response/ApiPaging;", "T", "", MTPushConstants.Geofence.KEY_COUNT, "", "page", "pageSize", "records", "", "<init>", "(IIILjava/util/List;)V", "getCount", "()I", "getPage", "getPageSize", "getRecords", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class ApiPaging<T> {
    public static final int $stable = 8;
    private final int count;
    private final int page;

    @SerializedName(alternate = {"total"}, value = "page_size")
    private final int pageSize;

    @SerializedName(alternate = {"data", "orders", "trades", AttributeType.LIST}, value = "records")
    @Nullable
    private final List<T> records;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiPaging(int i, int i2, int i3, @Nullable List<? extends T> list) {
        this.count = i;
        this.page = i2;
        this.pageSize = i3;
        this.records = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiPaging copy$default(ApiPaging apiPaging, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = apiPaging.count;
        }
        if ((i4 & 2) != 0) {
            i2 = apiPaging.page;
        }
        if ((i4 & 4) != 0) {
            i3 = apiPaging.pageSize;
        }
        if ((i4 & 8) != 0) {
            list = apiPaging.records;
        }
        return apiPaging.copy(i, i2, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final List<T> component4() {
        return this.records;
    }

    @NotNull
    public final ApiPaging<T> copy(int count, int page, int pageSize, @Nullable List<? extends T> records) {
        return new ApiPaging<>(count, page, pageSize, records);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiPaging)) {
            return false;
        }
        ApiPaging apiPaging = (ApiPaging) other;
        return this.count == apiPaging.count && this.page == apiPaging.page && this.pageSize == apiPaging.pageSize && Intrinsics.m18594b(this.records, apiPaging.records);
    }

    public final int getCount() {
        return this.count;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final List<T> getRecords() {
        return this.records;
    }

    public int hashCode() {
        int iM2228c = AbstractC0455a.m2228c(this.pageSize, AbstractC0455a.m2228c(this.page, Integer.hashCode(this.count) * 31, 31), 31);
        List<T> list = this.records;
        return iM2228c + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ApiPaging(count=");
        sb.append(this.count);
        sb.append(", page=");
        sb.append(this.page);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", records=");
        return AbstractC0455a.m2242q(sb, this.records, ')');
    }
}
